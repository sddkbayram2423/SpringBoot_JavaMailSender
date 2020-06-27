package com.bayram.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bayram.javamailsender.MailController;

@SpringBootTest
@RunWith(SpringRunner.class)
class ApplicationTests {
	@Autowired
	private MailController controller;

	@Test
	void contextLoads() {
	
	}

}
