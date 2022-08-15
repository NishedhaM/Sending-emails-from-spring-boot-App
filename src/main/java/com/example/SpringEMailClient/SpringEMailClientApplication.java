package com.example.SpringEMailClient;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEMailClientApplication {
	
	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringEMailClientApplication.class, args);}
		
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() throws MessagingException {
//			service.sendSimpleEmail("kadnishedha@gmail.com", "This is the body", "This is the email");
			service.sendemailWithAttachment("Kadnishedha@gmail.com", "This is email body with attachment", "the email has attachment", "C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (3).png" );
		}

}
