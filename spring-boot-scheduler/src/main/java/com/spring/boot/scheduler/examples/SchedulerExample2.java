package com.spring.boot.scheduler.examples;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SchedulerExample2 {

    @Scheduled(fixedRate = 10000)
    public void runAtFixedRate() {

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("The current time is : " + currentTime);

    }

}
