package oop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//  데이터에 접속하기 위한 정보를 가진 객체
public class MyDAO {
    // jdbc 경로
    private final String DB_DRIVER_CLASS = "org.mariadb.jdbc.Driver";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_USER = "root";
    private final String DB_NAME = "vuestargram";
    private final String DB_PASSWORD = "php504";
    private final String DB_URL = String.format("jdbc:mariadb://%s:%s/%s", DB_HOST, DB_PORT, DB_NAME);
    //순서대로 파라미터가 들어감 -> //localhost:3306/vuestargram

    // ** 주의 ** : 부모쪽에서 connection 풀하면 안됨

    // throws SQLException, ClassNotFoundException 메소드 옆에 적어주면 이셉션 처리할 수 있음
    // try - catch 없이
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // maria db 드라이버 클래스 로딩
        Class.forName(DB_DRIVER_CLASS);

        // DB conection 객체 생성
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

}
