package com.example.oauth.repo;

import com.example.oauth.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
   User findByName(String name);
}
