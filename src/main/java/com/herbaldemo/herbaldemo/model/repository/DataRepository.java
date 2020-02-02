package com.herbaldemo.herbaldemo.model.repository;

import com.herbaldemo.herbaldemo.model.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataEntity,Long> {
}
