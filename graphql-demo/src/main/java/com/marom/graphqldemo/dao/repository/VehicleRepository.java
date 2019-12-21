package com.marom.graphqldemo.dao.repository;

import com.marom.graphqldemo.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
