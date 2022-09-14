package com.ifcloudstudio.example.cmsdemo.domain.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "system_user")
public class User {
    @Id
    @GeneratedValue(generator = "system_value")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;

    String identity;

    String name;

    Role role;
}
