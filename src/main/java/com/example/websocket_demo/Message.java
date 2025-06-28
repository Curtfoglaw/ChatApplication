package com.example.websocket_demo;

public class Message {
    public String user;
    public String message;

    public Message() {
    }
    public Message (String user, String message) {
        this.user = user;
        this.message = message;
    }
    public String getUser() {
        return this.user;
    }
    public String getMessage() {
        return this.message;
    }

}
