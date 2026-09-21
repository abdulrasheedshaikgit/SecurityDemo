package com.seciruty.SecurityDemo.commandLiner;


import com.seciruty.SecurityDemo.entity.User;
import com.seciruty.SecurityDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RunnerClass {

    @Autowired
    UserRepository repository;

    @Bean
    public CommandLineRunner insertUsers() {
        return args -> {
            User user = new User();
            user.setUsername("admin");
            user.setPassword("admin1234");
            user.setRole("ROLE_ADMIN");
            repository.save(user);
        };
    }
}
