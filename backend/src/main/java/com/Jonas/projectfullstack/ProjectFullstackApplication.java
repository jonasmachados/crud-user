package com.Jonas.projectfullstack;

import com.Jonas.projectfullstack.entities.User;
import com.Jonas.projectfullstack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectFullstackApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectFullstackApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        this.userRepository.save(new User(null, "Bob", "Brown", "bob@gmail.com"));
        this.userRepository.save(new User(null, "Ana", "Blue", "ana@gmail.com"));
        this.userRepository.save(new User(null, "Alex", "Green", "alex@gmail.com"));
        this.userRepository.save(new User(null, "Chris", "red", "chris@gmail.com"));   

    }

}
