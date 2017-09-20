package com.aissue.service;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


/**
 * Created by Aissue on 2017/6/8.
 *
 */
@Service
public class BaseService {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @PersistenceContext
    EntityManager entityManager;

    public EntityManager getEm(){
        return this.entityManager;
    }

    public List queryForListBySql(String statementId,Object value) throws Exception{
        List list=this.sqlSessionTemplate.selectList(statementId,value);
        return list;
    }

    public Object findObjectOne(String statementId,Object value){
        Object object=this.sqlSessionTemplate.selectOne(statementId,value);
        return object;
    }

    public Object save(Object object) throws Exception{
        getEm().persist(object);
        getEm().flush();
        return object;
    }

    public Object update(Object object) throws  Exception{
        getEm().merge(object);
        getEm().flush();
        return object;
    }




}
