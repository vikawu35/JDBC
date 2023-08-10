package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserService user = new UserServiceImpl();
        user.createUsersTable();

        user.saveUser("John", "Doe", (byte) 30);
        user.saveUser("Jane", "Smith", (byte) 35);
        user.saveUser("Michael", "Johnson", (byte) 45);
        user.saveUser("Emily", "Brown", (byte) 26);

        List<User> userList = user.getAllUsers();
        userList.forEach(System.out::println);

        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
