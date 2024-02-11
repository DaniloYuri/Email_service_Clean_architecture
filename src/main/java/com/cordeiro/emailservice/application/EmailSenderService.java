package com.cordeiro.emailservice.application;

import com.cordeiro.emailservice.EmailServiceApplication;
import com.cordeiro.emailservice.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;


public class EmailSenderService implements EmailSenderUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailgateway){
        this.emailSenderGateway= emailgateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
