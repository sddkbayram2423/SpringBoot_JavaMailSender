package com.bayram.javamailsender;

import javax.mail.internet.InternetAddress;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailController {
	
	
	@Autowired
	private JavaMailSender mailSender;
	
	public String sendEmail() {
		MimeMessage mimeMessage=mailSender.createMimeMessage();
		MimeMessageHelper messageHelper=new MimeMessageHelper(mimeMessage);
		try {
			messageHelper.setSubject("App Test");
			messageHelper.setText("Hello \n My first App ");
			messageHelper.setTo(new InternetAddress("sddkbyrm2423@gmail.com"));
			
			
		} catch (Exception e) {
			return "Hata : "+e;
		}
		
		mailSender.send(mimeMessage);
		return "Sended Mail";
		
	}
	
	public void show() {
		System.out.println("Göster");
	}

}
