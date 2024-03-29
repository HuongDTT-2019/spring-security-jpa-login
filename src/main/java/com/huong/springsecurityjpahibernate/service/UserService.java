package com.huong.springsecurityjpahibernate.service;

import com.huong.springsecurityjpahibernate.model.CustomUserDetails;
import com.huong.springsecurityjpahibernate.model.User;
import com.huong.springsecurityjpahibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username){
        User user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
    }
}
