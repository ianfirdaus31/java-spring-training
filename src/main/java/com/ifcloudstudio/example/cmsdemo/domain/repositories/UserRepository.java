package com.ifcloudstudio.example.cmsdemo.domain.repositories;

import com.ifcloudstudio.example.cmsdemo.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends MongoRepository<User, String> {
}
