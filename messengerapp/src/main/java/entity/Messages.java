package entity;

import java.time.LocalDate;

public class Messages {

    private String message;
    private LocalDate date;
    private User sender;
    private User receiver;

    public Messages(String message, LocalDate date, User sender, User receiver) {
        this.message = message;
        this.date = date;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Messages() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
