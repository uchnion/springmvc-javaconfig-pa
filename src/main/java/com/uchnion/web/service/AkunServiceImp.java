package com.uchnion.web.service;

import com.uchnion.web.dao.DaoAkun;
import com.uchnion.web.model.Akun;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Marojahan
 */
@Service
@Transactional
public class AkunServiceImp implements AkunService{
    
    @Autowired
    private DaoAkun daoakun;

    @Override
    public void insertAkun(Akun akun) {
        daoakun.insertAkun(akun);
    }

    @Override
    public void updateAkun(Akun akun) {
        daoakun.updateAkun(akun);
    }

    @Override
    public void deleteAkun(String userakun) {
        daoakun.deleteAkun(userakun);
    }

    @Override
    @Transactional(readOnly = true)
    public Akun getAkun(String userakun) {
        return daoakun.getAkun(userakun);
    }

    @Override
    public void selectAkun(Akun akun) {
        daoakun.selectAkun(akun);
    }

    @Override
    public List<Akun> getAllAkun() {
        return daoakun.getAllAkun();
    }
    
}