package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDaoJDBCImpl UserDaoJDBCImpl = new UserDaoJDBCImpl();

    public void createUsersTable() {
        UserDaoJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() {
        UserDaoJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        UserDaoJDBCImpl.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        UserDaoJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return UserDaoJDBCImpl.getAllUsers();
    }

    public void cleanUsersTable() {
        UserDaoJDBCImpl.cleanUsersTable();
    }
}
