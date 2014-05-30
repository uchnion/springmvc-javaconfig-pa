
package com.uchnion.web.dao;

import com.uchnion.web.model.Mapel;
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
public class DaoMapelImp implements DaoMapel{

    @Autowired
    private SessionFactory SessionFactory;
    
    private Session getSessionFactory() {
        return SessionFactory.getCurrentSession();
    }
    
    @Override
    public void insertMapel(Mapel mapel) {
        getSessionFactory().save(mapel);
    }

    @Override
    public void updateMapel(Mapel mapel) {
       Mapel MapelUp = getMapel(mapel.getKodemapel());
        
        if(MapelUp != null){
            MapelUp.setNamamapel(mapel.getNamamapel());
            MapelUp.setKkm(mapel.getKkm());
            
            getSessionFactory().update(MapelUp);
        }
    }

    @Override
    public void deleteMapel(String kodemapel) {
        Mapel MapelDel = getMapel(kodemapel);
        
        if(MapelDel != null){
            getSessionFactory().delete(MapelDel);
        }
    }

    @Override
    public Mapel getMapel(String kodemapel) {
        return (Mapel)getSessionFactory().get(Mapel.class, kodemapel);
    }

    @Override
    public void selectMapel(Mapel mapel) {
        Mapel MapelSel = getMapel(mapel.getKodemapel());
        
        if(MapelSel != null){
            MapelSel.setNamamapel(mapel.getNamamapel());
            MapelSel.setKkm(mapel.getKkm());
            
            getSessionFactory().update(MapelSel);
        }
    }

    @Override
    public List<Mapel> getAllMapel() {
        return getSessionFactory().createCriteria(Mapel.class).list();
    }
    
}
