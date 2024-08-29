package system.feedback.seller.service;

import system.feedback.seller.model.User;

public interface LoginService {
    boolean authenticateUser(User user);
}
