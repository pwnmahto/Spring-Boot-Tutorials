package com.spring.boot.scheduler.examples;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SchedulerExample1 {

    @Scheduled(cron = "0 * 9 * * ?")
    public void runEveryMinute() {

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("The current time is : " + currentTime);

    }
}
