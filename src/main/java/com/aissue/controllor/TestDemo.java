package com.aissue.controllor;

import org.apache.log4j.Logger;

/**
 * Created by Aissue on 2017/6/4.
 *
 */
public class TestDemo {
    private static Logger logger = Logger.getLogger(TestDemo.class);
    public static void main(String[] args){
        logger.debug("This is Debug information");
        logger.error("This is Error information");
        logger.info("This is just information");

    }
}
