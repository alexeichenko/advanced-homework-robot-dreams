package com.rd_spring.homeworkrobotdreams.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AnotherBean {
    public void message2() {
        System.out.println("I am prototype");
    }
}
