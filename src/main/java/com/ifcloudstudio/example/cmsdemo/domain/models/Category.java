package com.ifcloudstudio.example.cmsdemo.domain.models;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "category")
public class Category {
    @Id
    String id;

    String name;
}
