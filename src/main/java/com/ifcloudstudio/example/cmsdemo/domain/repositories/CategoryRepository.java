package com.ifcloudstudio.example.cmsdemo.domain.repositories;

import com.ifcloudstudio.example.cmsdemo.domain.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryRepository extends JpaRepository<Category, String> {
    List<Category> findByName(String name);
    List<Category> findByNameIgnoreCaseStartingWith(String name);
}
