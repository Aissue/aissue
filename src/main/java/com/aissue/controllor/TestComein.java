package com.aissue.controllor;

import com.aissue.domain.Userinfor;
import com.aissue.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Aissue on 2017/6/8.
 *
 */
@Controller
@RequestMapping("all")
public class TestComein {

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "test1")
    @ResponseBody
    public String test1() throws Exception {
        Userinfor userinfor=(Userinfor) baseService.findObjectOne("com.aissue.mapper.userMapper.getUser",1);
        System.out.println("successful");
        return userinfor.getName();
    }
}
