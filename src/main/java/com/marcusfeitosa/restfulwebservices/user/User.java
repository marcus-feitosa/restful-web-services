package com.marcusfeitosa.restfulwebservices.user;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
public class User {


    private Integer id;
    private String name;
    private LocalDate birthDate;
}
