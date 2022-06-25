package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    @Override
    public User showUser(long id) {
        return userDaoImpl.showUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDaoImpl.saveUser(user);
    }

    @Override
    public void updateUser(long id, User updateUser) {
        userDaoImpl.updateUser(id, updateUser);
    }

    @Override
    public void delete(long id) {
        userDaoImpl.delete(id);
    }
}
