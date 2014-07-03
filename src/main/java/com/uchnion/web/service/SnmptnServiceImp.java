package com.uchnion.web.service;

import com.uchnion.web.dao.DaoSnmptn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SnmptnServiceImp implements SnmptnService{
    
    @Autowired
    private DaoSnmptn daosnmptn;
    
}
