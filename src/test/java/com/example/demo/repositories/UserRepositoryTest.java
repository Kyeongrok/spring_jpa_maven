package com.example.demo.repositories;

import com.example.demo.entities.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("local")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void name() {
        User user = new User();
        user.setName("kyeongrok");

        userRepository.save(user);
    }
}