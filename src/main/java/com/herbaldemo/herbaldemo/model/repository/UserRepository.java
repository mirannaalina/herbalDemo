package com.herbaldemo.herbaldemo.model.repository;

import com.herbaldemo.herbaldemo.model.Role;
import com.herbaldemo.herbaldemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Role,Long> {

    User findByUsername(String username);
}
