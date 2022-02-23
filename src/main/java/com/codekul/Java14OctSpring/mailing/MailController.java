package com.codekul.Java14OctSpring.mailing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    @PostMapping("sendMail")
    public String sendMail(){
        String from  = "codekul.vaibhav@gmail.com";
        String to = "dhavaldokhe@gmail.com";

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("Hii ");
        simpleMailMessage.setText("Hello Dhaval...");
        simpleMailMessage.setCc("patelallauddin53@gmail.com");
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        mailSender.send(simpleMailMessage);
        return "mail sent";
    }
}
