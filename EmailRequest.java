package com.email.writer;

// Import statements as needed
import lombok.Data; // Optional if you're using Lombok

public class EmailRequest {
    private String emailContent;
    private String tone;

    // Getters and setters
    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}