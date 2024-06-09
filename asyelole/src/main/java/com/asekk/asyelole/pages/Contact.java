package com.asekk.asyelole.pages;

public class Contact
{
    public String email;
    public String subject;
    public String attachment;
    public String body;
    public String recipient;
    public String title;
    public String mime_message;
    public String smtp_server_url;
    public String []recipients;

    public Contact() {
        // default constructor
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return this.subject;
    }
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
