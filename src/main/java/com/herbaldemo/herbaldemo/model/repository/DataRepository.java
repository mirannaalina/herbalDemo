package com.herbaldemo.herbaldemo.model.repository;

import com.herbaldemo.herbaldemo.model.DataEntity;
import com.herbaldemo.herbaldemo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataEntity,Long> {
    DataEntity findByUser(UserEntity user);
}
