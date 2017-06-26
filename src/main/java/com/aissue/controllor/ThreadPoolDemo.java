package com.aissue.controllor;

import org.apache.log4j.Logger;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Aissue on 2017/6/26.
 */
@Controller
@RequestMapping("/threadDemo")
public class ThreadPoolDemo {
    private static Logger logger= Logger.getLogger(ThreadPoolDemo.class);

    @Resource(name = "taskExecutor")
//    private TaskExecutor taskExecutor;
    ThreadPoolTaskExecutor poolTaskExecutor;

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test(){
        logger.info("successful...");
        try {
            while(true){
                poolTaskExecutor.execute(new Runnable() {
                    public void run() {
                        //这里编写处理业务代码
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        logger.info(Thread.currentThread().getName()+"这里编写处理业务代码...");
                    }
                });
                int count=poolTaskExecutor.getActiveCount();
                int size=poolTaskExecutor.getCorePoolSize();
                logger.info("activeCount:"+count+"|"+"corePoolSize:"+size);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "cao ni mei";
    }

}
