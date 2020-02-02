package com.herbaldemo.herbaldemo.service;

import com.herbaldemo.herbaldemo.model.Data;
import com.herbaldemo.herbaldemo.model.DataEntity;
import com.herbaldemo.herbaldemo.model.DataModel;
import com.herbaldemo.herbaldemo.model.UserEntity;
import com.herbaldemo.herbaldemo.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DataService {

    private final UserRepository userRepository;

    @Autowired
    public DataService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Transactional
    //get all entries from an user
    public List<UserEntity> getAllData() {
        return userRepository.findAll();
        //find all datas from a specific user
    }



    @Transactional
        //new entry
    public void newEntry (DataModel dataModel){
        DataEntity dataEntity= new DataEntity();
        dataEntity.setDataEntry(dataModel.getDataEntry());
        dataEntity.setAge(dataModel.getAge());
        dataEntity.setMetabolicAge(dataModel.getMetabolicAge());
        dataEntity.setKg(dataModel.getKg());
        dataEntity.setBodyFat(dataModel.getBodyFat());
        dataEntity.setMuscle(dataModel.getMuscle());
        dataEntity.setHydrationLevel(dataModel.getHydrationLevel());


    }


}
