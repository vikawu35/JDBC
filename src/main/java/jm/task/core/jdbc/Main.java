package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        List<User> usersToAdd = new ArrayList<>();
        usersToAdd.add(new User("John", "Doe", (byte) 30));
        usersToAdd.add(new User("Jane", "Smith", (byte) 35));
        usersToAdd.add(new User("Michael", "Johnson", (byte) 45));
        usersToAdd.add(new User("Emily", "Brown", (byte) 26));

        for (User user : usersToAdd) {
            userService.saveUser(user.getName(), user.getLastName(), user.getAge());
            System.out.println("User with name - " + user.getName() + " added to the database.");
        }
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
