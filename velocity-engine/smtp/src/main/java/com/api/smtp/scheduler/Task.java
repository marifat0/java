package com.api.smtp.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {

    @Scheduled(cron = "*/10 * * * * *")
    public void printHelloWorld() {
        System.out.println("Anjayani");
    }
    

}
