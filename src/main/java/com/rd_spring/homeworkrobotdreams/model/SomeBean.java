package com.rd_spring.homeworkrobotdreams.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SomeBean {
    public void message() {
        System.out.println("I am singleton");
    }
}
