package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    public List<User> getAll() {

        return userDao.getAll();
    }

    public void saveUser(User user) {
        userDao.add(user);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }
}

