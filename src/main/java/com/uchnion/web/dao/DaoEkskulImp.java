package com.uchnion.web.dao;

import com.uchnion.web.model.Ekskul;
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
public class DaoEkskulImp implements DaoEkskul{

    @Autowired
    private SessionFactory sessionfactory;
    
    private Session getSessionFactory(){
        return sessionfactory.getCurrentSession();
    }

    @Override
    public void insertEkskul(Ekskul ekskul) {
        getSessionFactory().save(ekskul);
    }

    @Override
    public void updateEkskul(Ekskul ekskul) {
        Ekskul EkskulUp = getEkskul(ekskul.getEkskulId());
       
       if(EkskulUp != null){
           EkskulUp.setKodeEkskul(ekskul.getKodeEkskul());
           EkskulUp.setNamaEkskul(ekskul.getNamaEkskul());
           
           getSessionFactory().update(EkskulUp);
       }
    }

    @Override
    public void deleteEkskul(Integer ekskulId) {
        Ekskul EkskulDel = getEkskul(ekskulId);
        if (EkskulDel != null){
            getSessionFactory().delete(EkskulDel);
        }
    }

    @Override
    public Ekskul getEkskul(Integer ekskulId) {
        return (Ekskul)getSessionFactory().get(Ekskul.class,ekskulId);
    }

    @Override
    public void selectEkskul(Ekskul ekskul) {
        Ekskul EkskulSel = getEkskul(ekskul.getEkskulId());
        if (EkskulSel != null){
            EkskulSel.setKodeEkskul(ekskul.getKodeEkskul());
            EkskulSel.setNamaEkskul(ekskul.getNamaEkskul());
            
            getSessionFactory().update(EkskulSel);
        }
    }

    @Override
    public List<Ekskul> getAllEkskul() {
        return getSessionFactory().createCriteria(Ekskul.class).list();
    }

}
