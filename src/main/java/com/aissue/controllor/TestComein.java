package com.aissue.controllor;

import com.aissue.domain.UserinforEntity;
import com.aissue.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Aissue on 2017/6/8.
 *
 */
@Controller
@Transactional
@RequestMapping("all")
public class TestComein {

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "test1")
    @Transactional
    @ResponseBody
    public String test1() throws Exception {
        UserinforEntity user=new UserinforEntity();
        user.setId(2);
        user.setName("王坤");
        user.setSalary(234.99);
        user.setGender("1");
        baseService.save(user);

        return "successful";
    }
}
