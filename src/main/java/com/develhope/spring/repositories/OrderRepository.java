package com.develhope.spring.repositories;

import com.develhope.spring.entities.StatusOfVehicle.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderInfo, Long> {
}