package com.herbaldemo.herbaldemo.model.repository;

import com.herbaldemo.herbaldemo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByUserId(long userId);
}
