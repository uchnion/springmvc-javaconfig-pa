package com.uchnion.web.dao;

import com.uchnion.web.model.EksKul;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marojahan
 */
@Repository
public class DaoEksKulImp implements DaoEksKul{

    @Autowired
    private SessionFactory sessionfactory;
    
    private Session getSessionFactory(){
        return sessionfactory.getCurrentSession();
    }

    @Override
    public void insertEksKul(EksKul eksKul) {
        getSessionFactory().save(eksKul);
    }

    @Override
    public void updateEksKul(EksKul eksKul) {
        EksKul EkskulUp = getEksKul(eksKul.getId_ekskul());
       
       if(EkskulUp != null){
           EkskulUp.setNama_ekskul(eksKul.getNama_ekskul());
           EkskulUp.setKeterangan(eksKul.getKeterangan());
           
           getSessionFactory().update(EkskulUp);
       }
    }

    @Override
    public void deleteEksKul(String id_ekskul) {
        EksKul EksKulDel = getEksKul(id_ekskul);
        if (EksKulDel != null){
            getSessionFactory().delete(EksKulDel);
        }
    }

    @Override
    public EksKul getEksKul(String id_ekskul) {
        return (EksKul)getSessionFactory().get(EksKul.class, id_ekskul);
    }

    @Override
    public void selectEksKul(EksKul eksKul) {
        EksKul EkskulSel = getEksKul(eksKul.getId_ekskul());
        if (EkskulSel != null){
            EkskulSel.setNama_ekskul(eksKul.getNama_ekskul());
            EkskulSel.setKeterangan(eksKul.getKeterangan());
            
            getSessionFactory().update(EkskulSel);
        }
    }

    @Override
    public List<EksKul> getAllEksKul() {
        return getSessionFactory().createCriteria(EksKul.class).list();
    }

}
