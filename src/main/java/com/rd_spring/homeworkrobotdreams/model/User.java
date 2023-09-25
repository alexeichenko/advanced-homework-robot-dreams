package com.rd_spring.homeworkrobotdreams.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Component
public class User {
    private int id;
    private String name;
    private String email;
    public User() {
        // Конструктор за замовчуванням без параметрів
    }
}
