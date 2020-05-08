package com.jin.community.dao;

import org.springframework.stereotype.Repository;

//相当于component
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
