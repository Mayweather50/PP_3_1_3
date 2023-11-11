package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

@Service
public interface UserServices extends UserDetailsService {
    List<User> getAllUsers();
    User getUserById(Long id);

    void addUser(User user);
    void updateUser(User user);
    void removeUser(Long id);

    public User findByUsername(String username) throws UsernameNotFoundException;

}
