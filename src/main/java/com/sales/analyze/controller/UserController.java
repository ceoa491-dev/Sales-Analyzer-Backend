package com.sales.analyze.controller;

import com.sales.analyze.model.UserModel;
import com.sales.analyze.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
@Autowired
    private UserService userService;
@PostMapping("/reg")
    public ResponseEntity<?>savereg(@RequestBody UserModel userModel){
    return ResponseEntity.ok(userService.reg(userModel));
}
}
