package oop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// myDAO를 상속받음
public class UserDAO extends MyDAO {
    private MyDAO myDao;
    public UserDAO() {
        this.myDao = new MyDAO();
    }

    public List<UserDTO> getUsers(int limit, int offset) {
        List<UserDTO> users = new ArrayList<>();
        String sql = "select * from users limit ? offset ?";

        try (
                // 리소스를 획득하는 처리 : catch에서도 에러가 발생가능 하기 때문에
                Connection conn = this.myDao.getConnection(); // connection 객체 획득
                PreparedStatement ps = conn.prepareStatement(sql);
                ) {
                ps.setInt(1, limit);
                ps.setInt(2, offset);

                // resultset 객체도 리소스 : 외부에서 들어오는 데이터
                // 외부에서 들어오는 데이터 : 리소스
                try(ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        // 포인트가 가르키는 데이터를 가져오고 그 다음으로 포인터가 이동
                        // 계속 그걸 반복하면서 데이터를 확인?
                        // 그 다음 포인터가 없을 시 false를 반환에서 while 종료

                        UserDTO user = new UserDTO();
                        user.setUserId(rs.getLong("user_id"));
                        user.setName(rs.getString("name"));
                        user.setPassword(rs.getString("password"));
                        user.setAccount(rs.getString("account"));
                        user.setProfile(rs.getString("profile"));
                        user.setRefreshToken(rs.getString("refresh_token"));
                        user.setCreatedAt(rs.getString("created_at"));
                        user.setUpdatedAt(rs.getString("updated_at"));
                        user.setDeletedAt(rs.getString("deleted_at"));

                        users.add(user); // users arraylist에 데이터를 계속  추가
                    }
                }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return users;
    }

}
