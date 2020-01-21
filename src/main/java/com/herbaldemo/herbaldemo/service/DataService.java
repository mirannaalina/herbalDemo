package com.herbaldemo.herbaldemo.service;

import com.herbaldemo.herbaldemo.model.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DataService {


    @Value("${reservation.service.url")
    private String dataServiceURL;

    private final RestTemplate restTemplate = new RestTemplate();//?

    //get all entries from an user
    public List<Data> getAllData(){
        System.out.println(dataServiceURL);
        String url = dataServiceURL+"/date";
        HttpEntity<String> request = new HttpEntity<>(null,null);
        return this.restTemplate.
                exchange(url,HttpMethod.GET, request, new ParameterizedTypeReference<List<Data>>(){}).getBody();
    }

        //@Transactional
        //new entry
    public Data newEntry (Data data, Long id){
        String url=dataServiceURL+"/add";
        //in progress implementation
        // return new Data("20.01.2020",23,20,55,17,19,20);

        HttpEntity<Data> request = new HttpEntity<>(data,null);
        return this.restTemplate.
                exchange(url,HttpMethod.PUT,request,Data.class)
                .getBody();
    }


}