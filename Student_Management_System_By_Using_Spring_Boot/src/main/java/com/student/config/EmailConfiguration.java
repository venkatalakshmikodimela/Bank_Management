package com.student.config;

import com.student.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailConfiguration 
{

	private String from;
	@Autowired
	private JavaMailSender javaMailSender;
	@Value("$(spring.mail.username)")
	private String username;
	//@value annotation is used to injucted the 
	//primitive data types and read and load the properties files
	
	
	public void sendTextMsg(String to,String subject,String body)
	{
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(from);
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(body);
		
		javaMailSender.send(simpleMailMessage);
	}
}
