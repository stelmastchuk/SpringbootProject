package com.stelconsultancy.course.repositories;

import com.stelconsultancy.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
