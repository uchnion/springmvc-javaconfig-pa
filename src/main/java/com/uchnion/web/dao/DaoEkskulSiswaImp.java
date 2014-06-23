package com.uchnion.web.dao;

import com.uchnion.web.model.EkskulSiswa;
import com.uchnion.web.model.EkskulSiswaId;
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
public class DaoEkskulSiswaImp implements DaoEkskulSiswa{

     @Autowired
    private SessionFactory sessionfactory;
    
    private Session getSessionFactory(){
        return sessionfactory.getCurrentSession();
    }
    
    @Override
    public void insertEkskulSiswa(EkskulSiswa ekssis) {
        getSessionFactory().save(ekssis);
    }

    @Override
    public void updateEkskulSiswa(EkskulSiswa ekssis) {
        EkskulSiswa EkskulSiswaUp = getEkskulSiswa(ekssis.getPk());
       
       if(EkskulSiswaUp != null){
           EkskulSiswaUp.setNilaiEkskul(ekssis.getNilaiEkskul());
           EkskulSiswaUp.setTahunAjar(ekssis.getTahunAjar());
           EkskulSiswaUp.setSemester(ekssis.getSemester());
           
           getSessionFactory().update(EkskulSiswaUp);
       }
    }

    @Override
    public void deleteEkskulSiswa(EkskulSiswaId pk) {
        EkskulSiswa ekssisDel = getEkskulSiswa(pk);
        if (ekssisDel != null){
            getSessionFactory().delete(ekssisDel);
        }
    }

    @Override
    public EkskulSiswa getEkskulSiswa(EkskulSiswaId pk) {
        return (EkskulSiswa)getSessionFactory().get(EkskulSiswa.class, pk);
    }

    @Override
    public void selectEkskulSiswa(EkskulSiswa ekssis) {
        EkskulSiswa ekssisSel = getEkskulSiswa(ekssis.getPk());
        if (ekssis != null){
            ekssisSel.setNilaiEkskul(ekssis.getNilaiEkskul());
            ekssisSel.setSemester(ekssis.getSemester());
            ekssisSel.setTahunAjar(ekssis.getTahunAjar());
            
            getSessionFactory().update(ekssisSel);
        }
    }

    @Override
    public List<EkskulSiswa> getAllEkskulSiswa() {
        return getSessionFactory().createCriteria(EkskulSiswa.class).list();
    }
    
}
