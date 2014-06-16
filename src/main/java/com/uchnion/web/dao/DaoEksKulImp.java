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
        EksKul EkskulUp = getEksKul(eksKul.getEkskulid());
       
       if(EkskulUp != null){
           EkskulUp.setKode_ekskul(eksKul.getKode_ekskul());
           EkskulUp.setNama_ekskul(eksKul.getNama_ekskul());
           EkskulUp.setKeterangan(eksKul.getKeterangan());
           
           getSessionFactory().update(EkskulUp);
       }
    }

    @Override
    public void deleteEksKul(Integer ekskulid) {
        EksKul EksKulDel = getEksKul(ekskulid);
        if (EksKulDel != null){
            getSessionFactory().delete(EksKulDel);
        }
    }

    @Override
    public EksKul getEksKul(Integer ekskulid) {
        return (EksKul)getSessionFactory().get(EksKul.class,ekskulid);
    }

    @Override
    public void selectEksKul(EksKul eksKul) {
        EksKul EkskulSel = getEksKul(eksKul.getEkskulid());
        if (EkskulSel != null){
            EkskulSel.setKode_ekskul(eksKul.getKode_ekskul());
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
