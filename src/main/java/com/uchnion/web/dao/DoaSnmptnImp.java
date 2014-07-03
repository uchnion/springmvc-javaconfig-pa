package com.uchnion.web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoaSnmptnImp implements DaoSnmptn{
    
    @Autowired
    private SessionFactory SessionFactory;

    private Session getSessionFactory() {
        return SessionFactory.getCurrentSession();
    }
    
}
