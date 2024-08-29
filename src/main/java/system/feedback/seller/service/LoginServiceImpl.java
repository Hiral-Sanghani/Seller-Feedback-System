package system.feedback.seller.service;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import system.feedback.seller.model.User;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    private static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Override
    public boolean authenticateUser(User user) {
        log.info("Authenticating user details:   {}",user);
        if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}
