package com.marcusfeitosa.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,
                "Marcus",
                LocalDate.now().minusYears(30)));
        users.add(new User(2,
                "Lia",
                LocalDate.now().minusYears(28)));
    }
}
