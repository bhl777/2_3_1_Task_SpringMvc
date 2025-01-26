package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

   // private final UserRepository userRepository;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        //this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {

        return userDao.getAll();
    }

    @Override
    public void saveUser(User user) {
        userDao.add(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }
}

