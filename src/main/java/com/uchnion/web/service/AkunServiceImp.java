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
    public void deleteAkun(Integer akunid) {
        daoakun.deleteAkun(akunid);
    }

    @Override
    @Transactional(readOnly = true)
    public Akun getAkun(Integer akunid) {
        return daoakun.getAkun(akunid);
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
