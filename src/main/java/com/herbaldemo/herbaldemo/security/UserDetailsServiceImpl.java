package com.herbaldemo.herbaldemo.security;

import com.herbaldemo.herbaldemo.model.UserEntity;
import com.herbaldemo.herbaldemo.model.UserRole;
import com.herbaldemo.herbaldemo.model.repository.UserRepository;
import com.herbaldemo.herbaldemo.model.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository,
                                  UserRoleRepository userRoleRepository) {
        super();
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = this.userRepository.findByUsername(username);

        if (null == user) {
            System.out.println("UserEntity not found:" + username);
            throw new UsernameNotFoundException("UserEntity not found:" + username);
        }

        System.out.println(username + " is found in database!");

        // want to read roles
        List<Long> idsList = new ArrayList<>();
        Iterable<UserRole> rolesUsers = userRoleRepository.findByUserId(user.getId());
        rolesUsers.forEach(rolesUser -> {
            idsList.add(rolesUser.getRoleId());
            System.out.println("ROLE in db" + rolesUser.getRoleId());
        });


        List<GrantedAuthority> grantedList = new ArrayList<>();

        //for (Role role : user.getRoles()){
            grantedList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        //}

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), grantedList);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        return userDetails;
    }
}
