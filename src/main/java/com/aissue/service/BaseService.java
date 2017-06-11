package com.aissue.service;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Aissue on 2017/6/8.
 *
 */
@Service
public class BaseService {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List queryForListBySql(String statementId,Object value) throws Exception{
        List list=this.sqlSessionTemplate.selectList(statementId,value);
        return list;
    }

    public Object findObjectOne(String statementId,Object value){
        Object object=this.sqlSessionTemplate.selectOne(statementId,value);
        return object;
    }


}
