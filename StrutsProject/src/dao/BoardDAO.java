package dao;

import model.Board;
import utils.DBConnection;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class BoardDAO {

    // DB 연결 메서드
    private Connection getConnection() throws SQLException {
        return DBConnection.getConnection();  // DBConnection 클래스에서 가져오는 방식으로 수정
    }

    // 모든 게시글 조회
    public List<Board> getAllBoards() {
        List<Board> boardList = new ArrayList<>();
        String query = "SELECT * FROM board";  // 게시글을 조회하는 SQL 쿼리
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Board board = new Board();
                board.setId(rs.getInt("id"));
                board.setTitle(rs.getString("title"));
                board.setContent(rs.getString("content"));
                boardList.add(board);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return boardList;
    }

    // 게시글 ID로 조회
    public Board getBoardById(int id) {
        Board board = null;
        String query = "SELECT * FROM board WHERE id = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    board = new Board();
                    board.setId(rs.getInt("id"));
                    board.setTitle(rs.getString("title"));
                    board.setContent(rs.getString("content"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return board;
    }

    // 게시글 추가
    public void saveBoard(Board board) {
        String query = "INSERT INTO board (title, content) VALUES (?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, board.getTitle());
            stmt.setString(2, board.getContent());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 게시글 수정
    public void updateBoard(Board board) {
        String query = "UPDATE board SET title = ?, content = ? WHERE id = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, board.getTitle());
            stmt.setString(2, board.getContent());
            stmt.setInt(3, board.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 게시글 삭제
    public void deleteBoard(int id) {
        String query = "DELETE FROM board WHERE id = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
