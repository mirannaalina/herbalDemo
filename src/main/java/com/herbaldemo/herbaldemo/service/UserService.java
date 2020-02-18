package com.herbaldemo.herbaldemo.service;

import com.herbaldemo.herbaldemo.model.User;
import com.herbaldemo.herbaldemo.model.UserEntity;
import com.herbaldemo.herbaldemo.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public User registerNewUser(UserEntity userEntity){
        User user = new User();
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());

        //return  userRepository.save(user).orElse(null);
        return null;
    }
}
