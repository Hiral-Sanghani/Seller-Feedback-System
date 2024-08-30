package system.feedback.seller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import system.feedback.seller.model.User;
import system.feedback.seller.service.LoginService;

@RestController 
@CrossOrigin(origins = "http://localhost:3000") 
@RequestMapping("/api")
public class LoginController {

    private LoginService loginService;


    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticateUser(@RequestBody User user) {
        boolean isAuthenticated = loginService.authenticateUser(user);

        if (isAuthenticated) {
            return ResponseEntity.ok("Login Successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }
}
