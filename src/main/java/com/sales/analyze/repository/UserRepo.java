package com.sales.analyze.repository;

import com.sales.analyze.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel,Long> {
}
