package com.uchnion.web.dao;

import com.uchnion.web.model.Kelas;
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
public class DaoKelasImp implements DaoKelas{
    
    @Autowired
    private SessionFactory sessionfactory;
    
    private Session getSessionFactory(){
        return sessionfactory.getCurrentSession();
    }
    

    @Override
    public void insertKelas(Kelas kelas) {  
        getSessionFactory().save(kelas);
    }

    @Override
    public void updateKelas(Kelas kelas) {
       Kelas KelasUp = getKelas(kelas.getKodekelas());
       
       if(KelasUp != null){
           KelasUp.setNamakelas(kelas.getNamakelas());
           KelasUp.setTahunajaran(kelas.getTahunajaran());
           
           getSessionFactory().update(KelasUp);
       }
    }

    @Override
    public void deleteKelas(String kodekelas) {
        Kelas KelasDel = getKelas(kodekelas);
        if (KelasDel != null){
            getSessionFactory().delete(KelasDel);
        }
    }

    @Override
    public Kelas getKelas(String kodekelas) {
        return (Kelas)getSessionFactory().get(Kelas.class, kodekelas);
    }

    @Override
    public void selectKelas(Kelas kelas) {
        Kelas KelasSel = getKelas(kelas.getKodekelas());
        if (KelasSel != null){
            KelasSel.setNamakelas(kelas.getNamakelas());
            KelasSel.setTahunajaran(kelas.getTahunajaran());
            
            getSessionFactory().update(KelasSel);
        }
    }

    @Override
    public List<Kelas> getAllKelas() {
        return getSessionFactory().createCriteria(Kelas.class).list();
    }
    
}
