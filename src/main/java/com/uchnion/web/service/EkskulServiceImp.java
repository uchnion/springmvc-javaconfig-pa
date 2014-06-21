package com.uchnion.web.service;

import com.uchnion.web.dao.DaoEkskul;
import com.uchnion.web.model.Ekskul;
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
public class EkskulServiceImp implements EkskulService{

    @Autowired
    private DaoEkskul daoekskul;

    @Override
    public void insertEkskul(Ekskul ekskul) {
        daoekskul.insertEkskul(ekskul);
    }

    @Override
    public void updateEkskul(Ekskul ekskul) {
        daoekskul.updateEkskul(ekskul);
    }

    @Override
    public void deleteEkskul(Integer ekskulId) {
        daoekskul.deleteEkskul(ekskulId);
    }

    @Override
    @Transactional(readOnly = true)
    public Ekskul getEkskul(Integer ekskulId) {
        return daoekskul.getEkskul(ekskulId);
    }

    @Override
    public void selectEkskul(Ekskul ekskul) {
        daoekskul.selectEkskul(ekskul);
    }

    @Override
    public List<Ekskul> getAllEkskul() {
        return daoekskul.getAllEkskul();
    }
    
}
