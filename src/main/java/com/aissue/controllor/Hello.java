package com.aissue.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Aissue on 2017/6/3.
 *
 */
@Controller
@RequestMapping("/hello")
public class Hello {
    @RequestMapping(value = "/index")
    @ResponseBody
    public String index() {
        System.out.println("test！！");
        return "helloindex";
    }

}
