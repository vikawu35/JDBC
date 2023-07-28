package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;



public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl user = new UserDaoJDBCImpl();
        user.createUsersTable();

        user.saveUser("John", "Doe", (byte) 30);
        user.saveUser("Jane", "Smith", (byte) 35);
        user.saveUser("Michael", "Johnson", (byte) 45);
        user.saveUser("Emily", "Brown", (byte) 26);

        user.getAllUsers();
        System.out.println(user.getAllUsers().toString());
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
