package com.bayram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bayram.javamailsender.MailController;

@SpringBootApplication(scanBasePackages = "com.bayram")
public class Application implements CommandLineRunner{
	
	
	@Autowired
	private MailController controller;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controller.sendEmail();
	}

}
