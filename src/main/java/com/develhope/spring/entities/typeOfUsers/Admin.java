package com.develhope.spring.entities.typeOfUsers;

import com.develhope.spring.configurations.Role;

import com.develhope.spring.entities.StatusOfVehicle.OrderInfo;
import com.develhope.spring.entities.vehicleTypes.Vehicle;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Admins")
public class Admin extends User {

    private Role role = Role.ROLE_ADMIN;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "administrator_vehicle", joinColumns = @JoinColumn(name = "administrator_id"), inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
    private List<Vehicle> vehicle;
    
}
