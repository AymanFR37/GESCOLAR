package ma.gescolar.school.controllers;

import ma.gescolar.school.models.User;
import ma.gescolar.school.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/check")
    public Boolean loginUser(@RequestBody User userData) {
        User userA = userRepository.findByUsername(userData.getUsername());
        if (userA != null) {
            if (userA.getPassword().equals(userData.getPassword())) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }


    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable User username) {
        return userRepository.findByUsername(username.getUsername());
    }

}
