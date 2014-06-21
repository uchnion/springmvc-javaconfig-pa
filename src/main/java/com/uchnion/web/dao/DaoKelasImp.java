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
       Kelas KelasUp = getKelas(kelas.getKelasId());
       
       if(KelasUp != null){
           KelasUp.setKodekKelas(kelas.getKodekKelas());
           KelasUp.setNamaKelas(kelas.getNamaKelas());
           
           getSessionFactory().update(KelasUp);
       }
    }

    @Override
    public void deleteKelas(Integer kelasId) {
        Kelas KelasDel = getKelas(kelasId);
        if (KelasDel != null){
            getSessionFactory().delete(KelasDel);
        }
    }

    @Override
    public Kelas getKelas(Integer kelasId) {
        return (Kelas)getSessionFactory().get(Kelas.class, kelasId);
    }

    @Override
    public void selectKelas(Kelas kelas) {
        Kelas KelasSel = getKelas(kelas.getKelasId());
        if (KelasSel != null){
            KelasSel.setKodekKelas(kelas.getKodekKelas());
            KelasSel.setNamaKelas(kelas.getNamaKelas());
            
            getSessionFactory().update(KelasSel);
        }
    }

    @Override
    public List<Kelas> getAllKelas() {
        return getSessionFactory().createCriteria(Kelas.class).list();
    }
    
}
