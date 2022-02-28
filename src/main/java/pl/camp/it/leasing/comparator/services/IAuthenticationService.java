package pl.camp.it.leasing.comparator.services;

import pl.camp.it.leasing.comparator.model.view.RegisterUser;

public interface IAuthenticationService {
    void authenticate(String login, String password);
    void logout();
    boolean register(RegisterUser registerUser);
}
