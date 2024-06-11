package com.stelconsultancy.course.config;

import com.stelconsultancy.course.entities.Order;
import com.stelconsultancy.course.entities.User;
import com.stelconsultancy.course.entities.enums.OrderStatus;
import com.stelconsultancy.course.repositories.OrderRepository;
import com.stelconsultancy.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    final private UserRepository userRepository;

    final private OrderRepository orderRepository;


    public TestConfig(UserRepository userRepository , OrderRepository orderRepository) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2024-01-01T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2024-03-01T19:53:07Z"), u2, OrderStatus.PAID);
        Order o3 = new Order(null, Instant.parse("2024-04-01T19:53:07Z"), u1, OrderStatus.SHIPPED);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
