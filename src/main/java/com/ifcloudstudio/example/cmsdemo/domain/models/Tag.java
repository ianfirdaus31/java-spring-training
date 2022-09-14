package com.ifcloudstudio.example.cmsdemo.domain.models;

import lombok.Data;

import javax.persistence.Embeddable;
@Data
@Embeddable
public class Tag {
    String value;
}
