package com.sales.analyze.service;

import com.sales.analyze.model.UserModel;
import com.sales.analyze.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public String reg(UserModel userModel){
        userRepo.save(userModel);
        return "User Saved Successfull";
    }
}
