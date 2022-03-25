package com.takateam.salonapi.repository;

import com.takateam.salonapi.enities.Slot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ISlotRepository extends JpaRepository<Slot, Long> {
    
}


