package com.takateam.salonapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;


@Configuration
@Data
public class SalonDetails {
    
    @Value("${salon.name}")
    private String name;
    
    @Value("${salon.address}")
    private String address;
    
    @Value("${salon.city}")
    private String city;
    
    @Value("${salon.state}")
    private String state;
    
    @Value("${salon.zipcode}")
    private String zipCode;
    
    @Value("${salon.phone}")
    private String phone;

}
