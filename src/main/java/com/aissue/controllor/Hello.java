package com.aissue.controllor;

import com.aissue.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Aissue on 2017/6/3.
 *
 */
@Controller
@RequestMapping("/allTest")
public class Hello {

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1() {
        System.out.println("jkjkj");
        return "successful!";
    }

}
