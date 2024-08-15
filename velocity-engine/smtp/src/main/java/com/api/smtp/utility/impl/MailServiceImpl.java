package com.api.smtp.utility.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.api.smtp.utility.MailService;
import com.api.smtp.utility.PdfService;

import jakarta.mail.internet.MimeMessage;

@Component
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired PdfService pdfService;

    @Value("${spring.mail.username}")
    private String sender;

    private SimpleMailMessage message = new SimpleMailMessage();

    @Override
    public void sendMail(String to, String subject, String body) {
        message.setFrom(sender);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);

    }

    @Override
    public void SendMailWithAttachment(String to, String subject, String body, String attachmentPath) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(sender);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body);

            FileSystemResource file = new FileSystemResource(new File(attachmentPath));
            helper.addAttachment(file.getFilename(), file);

            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendMailWithAttachmentPdf(String to, String subject, String body, String imagePath) {
        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(sender);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body);

            String htmlPath = "src/main/resources/Attachment.html";
            
            String pdfPath = pdfService.generatePdfWithAnImage(htmlPath, imagePath);

            FileSystemResource file = new FileSystemResource(new File(pdfPath));
            helper.addAttachment(file.getFilename(), file);

            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
