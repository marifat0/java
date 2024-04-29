package com.learn.smtp.model;

public class EmailModel {
	
	private String email;
	private String subject;
	private String recipient;
	private String body;
	private String attachment;
	
	public EmailModel() {
   // default contructor
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
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getRecipient() {
		return this.recipient;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getBody() {
		return this.body;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getAttachment() {
		return this.attachment;
	}
}
