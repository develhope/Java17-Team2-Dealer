package com.develhope.spring.repositories;

import com.develhope.spring.entities.StatusOfVehicle.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}