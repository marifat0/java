package com.api.smtp.ctrlers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.smtp.utility.MailService;
import com.api.smtp.enums.Constants;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class MailController {

    @Autowired
    private MailService mailService;

    // @Value("${attachment.path}")
    // private String attachmentPath;

    // @Value("${message.subject}")
    // private String subject;

    // @Value("${message.body}")
    // private String body;

    private Log log = LogFactory.getLog(MailController.class);

    @GetMapping("/hello")
    public String hello() {
        log.info(Constants.EMAIL.getValue());
        return "Hello World!";
    }

    @GetMapping("/send")
    public String send(@RequestParam(value = "body", required = true) String body) {
        try {
            log.info("Sending email with body: " + body);
            mailService.sendMail(Constants.EMAIL.getValue(), "Test email", body);
            return "Email sent!";
        } catch (Exception e) {
            log.error("Error sending email", e.getCause());
            return "Error sending email";
        }
    }
    @GetMapping("/sendAtt")
    public String sendMWA() {
        try {
            String attachmentPath = Constants.ATTACHMENT_PATH.getValue();
            String subject = Constants.SUBJECT.getValue();
            String body = Constants.BODY.getValue();

            log.info("Sending email with attachment");
            log.info("Attachment path: " + attachmentPath);
            log.info("Subject: " + subject);
            log.info("Body: " + body);
            String to = Constants.EMAIL.getValue();
            mailService.SendMailWithAttachment(to, subject, body, attachmentPath);
            return "Email sent with attachment!";
        } catch (Exception e) {
            log.error("Error sending email with attachment", e.getCause());
            return "Error sending email with attachment";
        }
    }
}
