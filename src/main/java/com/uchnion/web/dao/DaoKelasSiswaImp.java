package com.uchnion.web.dao;

import com.uchnion.web.model.KelasSiswa;
import com.uchnion.web.model.KelasSiswaId;
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
public class DaoKelasSiswaImp implements DaoKelasSiswa {

    @Autowired
    private SessionFactory sessionfactory;

    private Session getSessionFactory() {
        return sessionfactory.getCurrentSession();
    }

    @Override
    public void insertKelasSiswa(KelasSiswa klssis) {
        getSessionFactory().save(klssis);
    }

    @Override
    public void updateKelasSiswa(KelasSiswa klssis) {
        KelasSiswa KelasSiswaUp = getKelasSiswa(klssis.getPk());

        if (KelasSiswaUp != null) {
            KelasSiswaUp.setTahunAjar(klssis.getTahunAjar());

            getSessionFactory().update(KelasSiswaUp);
        }
    }

    @Override
    public void deleteKelasSiswa(KelasSiswaId pk) {
        KelasSiswa KelasSiswaDel = getKelasSiswa(pk);
        if (KelasSiswaDel != null){
            getSessionFactory().delete(KelasSiswaDel);
        }

    }

    @Override
    public KelasSiswa getKelasSiswa(KelasSiswaId pk) {
        return (KelasSiswa)getSessionFactory().get(KelasSiswa.class,pk);
    }

    @Override
    public void selectKelasSiswa(KelasSiswa klssis) {
        KelasSiswa KelasSiswaSel = getKelasSiswa(klssis.getPk());
        if (KelasSiswaSel != null){
            KelasSiswaSel.setTahunAjar(klssis.getTahunAjar());
            
            getSessionFactory().update(KelasSiswaSel);
        }
    }

    @Override
    public List<KelasSiswa> getAllKelasSiswa() {
        return getSessionFactory().createCriteria(KelasSiswa.class).list();
    }

}
