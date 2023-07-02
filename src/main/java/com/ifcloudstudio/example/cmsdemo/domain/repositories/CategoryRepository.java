package com.ifcloudstudio.example.cmsdemo.domain.repositories;

import com.ifcloudstudio.example.cmsdemo.domain.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface CategoryRepository extends MongoRepository<Category, String> {

}
