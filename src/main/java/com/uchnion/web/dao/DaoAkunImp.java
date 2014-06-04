package com.uchnion.web.dao;

import com.uchnion.web.model.Akun;
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
public class DaoAkunImp implements DaoAkun{
    
    @Autowired
    private SessionFactory sessionfactory;
    
    private Session getSessionFactory() {
        return sessionfactory.getCurrentSession();
    }

    @Override
    public void insertAkun(Akun akun) {
        getSessionFactory().save(akun);
    }

    @Override
    public void updateAkun(Akun akun) {
        Akun AkunUp = getAkun(akun.getUserakun());
        if (AkunUp != null){
            AkunUp.setPassakun(akun.getPassakun());
            
            getSessionFactory().update(AkunUp);
        }
        
    }

    @Override
    public void deleteAkun(String userakun) {
        Akun AkunDel = getAkun(userakun);
        
        if(AkunDel != null){
            getSessionFactory() .delete(AkunDel);
        }
    }

    @Override
    public Akun getAkun(String userakun) {
        return (Akun)getSessionFactory().get(Akun.class, userakun);
    }

    @Override
    public void selectAkun(Akun akun) {
        Akun AkunSel = getAkun(akun.getUserakun());
        
        if (AkunSel != null){
            AkunSel.setPassakun(akun.getPassakun());
            
            getSessionFactory().update(AkunSel);
        }
    }

    @Override
    public List<Akun> getAllAkun() {
        return getSessionFactory().createCriteria(Akun.class).list();
    }
    
}
