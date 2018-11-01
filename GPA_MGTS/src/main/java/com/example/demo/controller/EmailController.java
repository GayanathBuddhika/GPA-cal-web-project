package com.example.demo.controller;

import com.example.demo.config.MyConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.Session;

@RestController
@RequestMapping("/api/email")
public class EmailController {

     private JavaMailSender emailSender;

    @Autowired
    public void setMailSender(JavaMailSender mailSender) {
        this.emailSender = mailSender;
    }

    @ResponseBody
    @RequestMapping("/sendEmail/{subject}/{message}/{email}")
    public String sendSimpleEmail(@PathVariable("subject") String subject,
    		@PathVariable("message") String message1,
    		@PathVariable("email") String email) {
    	
        System.setProperty("mail.mime.charset", "utf8");
        // Create a Simple MailMessage.
        // String s1 = email.concat(".com");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject(subject);
        message.setText(message1 );
        // Send Message!
        this.emailSender.send(message);

        return "Email Sent!";
    }

}
