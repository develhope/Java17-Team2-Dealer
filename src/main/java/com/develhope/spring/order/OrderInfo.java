package com.develhope.spring.order;

import com.develhope.spring.car.Vehicle;
import com.develhope.spring.user.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "Orders")
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Double advancePayment;               //Anticipo

    private Boolean paidInFull;                  //Flag pagato

    @ManyToMany
    @JoinTable(
            name = "ORDER_VEHICLE",
            joinColumns = @JoinColumn(name = "ORDER_ID", referencedColumnName = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID", referencedColumnName = "vehicleId"))
    private List<Vehicle> vehicles;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;             //Stato ordine

}