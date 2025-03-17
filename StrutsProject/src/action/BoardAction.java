package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.BoardDAO;
import model.Board;

public class BoardAction extends ActionSupport {
    private List<Board> boards;
    private Board board;
    private int id;
    private String title;
    private String content;

    private BoardDAO boardDAO = new BoardDAO();

    // 게시글 목록 조회
    public String list() {
        boards = boardDAO.getAllBoards();
        return SUCCESS;
    }

    // 게시글 상세 조회
    public String view() {
        board = boardDAO.getBoardById(id);
        return SUCCESS;
    }

    // 게시글 작성
    public String write() {
        return SUCCESS;
    }

    // 게시글 저장
    public String save() {
        Board newBoard = new Board();
        newBoard.setTitle(title);
        newBoard.setContent(content);
        boardDAO.saveBoard(newBoard);
        return SUCCESS;
    }

    // 게시글 수정
    public String edit() {
        board = boardDAO.getBoardById(id);
        return SUCCESS;
    }

    // 게시글 업데이트
    public String update() {
        Board updatedBoard = new Board();
        updatedBoard.setId(id);
        updatedBoard.setTitle(title);
        updatedBoard.setContent(content);
        boardDAO.updateBoard(updatedBoard);
        return SUCCESS;
    }

    // 게시글 삭제
    public String delete() {
        boardDAO.deleteBoard(id);
        return SUCCESS;
    }

    // Getters and Setters
    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
