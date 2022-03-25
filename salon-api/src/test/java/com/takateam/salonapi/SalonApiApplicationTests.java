package com.takateam.salonapi;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SalonApiApplicationTests {
   
	@Autowired
	SalonDetails d;

	@Test
	void contextLoads() {
		assertEquals("AR Salon and Day Spa Services", d.getName());
	}

}
