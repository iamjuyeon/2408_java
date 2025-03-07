package oop.db;

import java.util.List;
import java.util.stream.Stream;

public class DbMain {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        List<UserDTO> result = userDAO.getUsers(2,0);

        Stream<UserDTO> stream = result.stream();
        stream.forEach(user -> System.out.println(user.getAccount()));

    }

}
