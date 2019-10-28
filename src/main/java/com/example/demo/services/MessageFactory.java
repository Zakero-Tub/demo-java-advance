package com.example.demo.services;

import com.example.demo.enums.MessageType;

public class MessageFactory {


    public MessageService getMessageService(MessageType messageType) {
        switch (messageType) {
            case SMS:
                return new SMSService();
            case EMAIL:
                return new EmailService();
            case VIBER:
                break;
            case TELEGRAM:
                break;
        }
        throw new IllegalArgumentException("Message type not supported");
    }
}
