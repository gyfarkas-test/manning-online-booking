package com.takateam.salonapi.repository;

import com.takateam.salonapi.enities.SalonServiceDetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalonServiceDetailRepository extends JpaRepository<SalonServiceDetail, Long> {
    
}


