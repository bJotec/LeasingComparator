package pl.camp.it.leasing.comparator.database;

import pl.camp.it.leasing.comparator.model.User;

import java.util.Optional;

public interface IUserDAO {

    Optional<User> getUserByLogin(String login);
    void addUser(User user);

}
