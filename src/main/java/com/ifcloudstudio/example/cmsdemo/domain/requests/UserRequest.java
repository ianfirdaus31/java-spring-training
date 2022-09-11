package com.ifcloudstudio.example.cmsdemo.domain.requests;

import com.ifcloudstudio.example.cmsdemo.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {
    String identity;
    String name;
    Role role;
}
