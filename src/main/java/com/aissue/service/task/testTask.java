package com.aissue.service.task;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Aissue on 2017/6/15.
 */
@Component
public class TestTask {
    private static Logger logger = Logger.getLogger(TestTask.class);

    //@Scheduled(cron = "0/5 * * ? * *")
    public void execuit(){
        System.out.println("testTask is running...");
        logger.info("testTask is running...");
    }
}
