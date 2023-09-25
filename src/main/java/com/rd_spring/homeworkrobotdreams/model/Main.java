package com.rd_spring.homeworkrobotdreams.model;

import com.rd_spring.homeworkrobotdreams.config.SpringConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // Отримую біни
        SomeBean singletonBean1 = context.getBean(SomeBean.class);
        SomeBean singletonBean2 = context.getBean(SomeBean.class);

        AnotherBean prototypeBean1 = context.getBean(AnotherBean.class);
        AnotherBean prototypeBean2 = context.getBean(AnotherBean.class);

        // Відображаю скоупи бінів
        System.out.println("singletonBean1 == singletonBean2: " + (singletonBean1 == singletonBean2));
        System.out.println("prototypeBean1 == prototypeBean2: " + (prototypeBean1 == prototypeBean2));

        // Використовую сервіс для додавання користувачів
        UserManagementService userManagementService = context.getBean(UserManagementService.class);
        User user1 = new User(1, "John", "john@example.com");
        User user2 = new User(2, "Alice", "alice@example.com");
        userManagementService.addUser(user1);
        userManagementService.addUser(user2);

        // Отримую всіх користувачів
        List<User> allUsers = userManagementService.getAllUsers();
        System.out.println("All Users:");
        for (User user : allUsers) {
            System.out.println(user.getName() + " (" + user.getEmail() + ")");
        }

        // Завершую контекст Spring
        context.close();
    }
}
