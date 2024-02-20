package com.suti.community.dao;

import org.springframework.stereotype.Repository;

//通过括号里可以定义bean的名字
@Repository("AlphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
