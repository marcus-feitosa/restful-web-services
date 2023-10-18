package com.marcusfeitosa.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;
    static {
        users.add(new User(++userCount,
                "Marcus",
                LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,
                "Lia",
                LocalDate.now().minusYears(28)));
    }
    public List<User> findAll(){
        return users;
    }
    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
    public User saveUser(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
}
