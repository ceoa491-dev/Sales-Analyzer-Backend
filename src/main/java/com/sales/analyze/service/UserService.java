package com.sales.analyze.service;

import com.sales.analyze.model.UserModel;
import com.sales.analyze.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public Map<String,Object> reg(UserModel userModel){
        UserModel exist=userRepo.findbyEmail(userModel.getEmail());
        if(exist!=null){
            return Map.of("status","success");
        }
        else {
            userRepo.save(userModel);
            return Map.of("status","failed");
        }
    }
}
