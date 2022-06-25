package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {


    List<User> getAllUsers();

    User showUser(long id);

    void saveUser(User user);

    void updateUser(long id, User updateUser);

    void delete(long id);
}
