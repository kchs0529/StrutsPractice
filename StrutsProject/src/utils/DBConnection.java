package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/struts";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // DB 연결 메서드
    public static Connection getConnection() throws SQLException {
        try {
            // JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            // DB 연결
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("JDBC Driver not found", e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Database connection error", e);
        }
    }
}
