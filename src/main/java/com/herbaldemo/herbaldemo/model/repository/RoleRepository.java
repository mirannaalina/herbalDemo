package com.herbaldemo.herbaldemo.model.repository;

import com.herbaldemo.herbaldemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
