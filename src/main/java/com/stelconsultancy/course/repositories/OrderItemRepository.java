package com.stelconsultancy.course.repositories;

import com.stelconsultancy.course.entities.OrderItem;
import com.stelconsultancy.course.entities.pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
