package com.suti.community.service;

import com.suti.community.dao.AlphaDao;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//为了展示容器管理bean的初始化和销毁
@Service
//@Scope("prototype")
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("construct AlphaService");
    }
    @PostConstruct
    public void init(){
        System.out.println("Initial AlphaService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Destory AlphaService");
    }

    public String find(){
        return alphaDao.select();
    }
}
