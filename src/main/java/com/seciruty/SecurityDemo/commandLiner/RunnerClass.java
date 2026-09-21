package com.seciruty.SecurityDemo.commandLiner;


import com.seciruty.SecurityDemo.entity.User;
import com.seciruty.SecurityDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RunnerClass {

    @Bean
    public CommandLineRunner insertUsers(UserRepository repository, PasswordEncoder passwordEncoder) {
        return args -> {
            if(repository.findUserByUsername("admin1").isEmpty()) {
                User user = new User();
                user.setUsername("admin1");
                user.setPassword(passwordEncoder.encode("admin1234"));
                user.setRole("ROLE_ADMIN");
                repository.save(user);
            }
        };
    }
}
