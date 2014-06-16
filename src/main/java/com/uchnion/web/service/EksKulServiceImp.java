package com.uchnion.web.service;

import com.uchnion.web.dao.DaoEksKul;
import com.uchnion.web.model.EksKul;
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
public class EksKulServiceImp implements EksKulService{

    @Autowired
    private DaoEksKul daoekskul;

    @Override
    public void insertEksKul(EksKul ekskul) {
        daoekskul.insertEksKul(ekskul);
    }

    @Override
    public void updateEksKul(EksKul ekskul) {
        daoekskul.updateEksKul(ekskul);
    }

    @Override
    public void deleteEksKul(Integer ekskulid) {
        daoekskul.deleteEksKul(ekskulid);
    }

    @Override
    @Transactional(readOnly = true)
    public EksKul getEksKul(Integer ekskulid) {
        return daoekskul.getEksKul(ekskulid);
    }

    @Override
    public void selectEksKul(EksKul ekskul) {
        daoekskul.selectEksKul(ekskul);
    }

    @Override
    public List<EksKul> getAllEksKul() {
        return daoekskul.getAllEksKul();
    }
    
}
