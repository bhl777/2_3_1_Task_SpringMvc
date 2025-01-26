package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAll();
    void add(User user);
    void deleteUser(int id);
    void updateUser(int id, User user);
}
