package com.api.smtp.utility;

import org.springframework.stereotype.Service;

@Service
public interface MailService {

    public void sendMail(String to, String subject, String body);

    public void SendMailWithAttachment(String to, String subject, String body, String attachment);

    public void sendMailWithAttachmentPdf(String to, String subject, String body, String imagePath);
}
