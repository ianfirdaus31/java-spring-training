package com.ifcloudstudio.example.cmsdemo.domain.requests;

import com.ifcloudstudio.example.cmsdemo.domain.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {
    String title;
    String constent;
    Set<CategoryRequest> categories;
    Set<Tag> tags;
}
