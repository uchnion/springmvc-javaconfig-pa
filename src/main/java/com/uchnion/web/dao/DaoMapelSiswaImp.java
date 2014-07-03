package com.uchnion.web.dao;

import com.uchnion.web.model.MapelSiswa;
import com.uchnion.web.model.MapelSiswaId;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marojahan
 */
@Repository
public class DaoMapelSiswaImp implements DaoMapelSiswa {

    private static final Logger LOG = Logger.getLogger(DaoMapelSiswaImp.class.getName());
    
    @Autowired
    private SessionFactory sessionfactory;

    private Session getSessionFactory() {
        return sessionfactory.getCurrentSession();
    }

    @Override
    public void insertMapelSiswa(MapelSiswa mplsis) {
        getSessionFactory().save(mplsis);
    }

    @Override
    public void updateMapelSiswa(MapelSiswa mplsis) {
        MapelSiswa MapelSiswaUp = getMapelSiswa(mplsis.getPk());

        if (MapelSiswaUp != null) {
            MapelSiswaUp.setAkademik(mplsis.getAkademik());
            MapelSiswaUp.setPraktik(mplsis.getPraktik());
            MapelSiswaUp.setTahunAjar(mplsis.getTahunAjar());

            getSessionFactory().update(MapelSiswaUp);
        }
    }

    @Override
    public void deleteMapelSiswa(MapelSiswaId pk) {
        MapelSiswa MapelSiswaDel = getMapelSiswa(pk);
        if (MapelSiswaDel != null) {
            getSessionFactory().delete(MapelSiswaDel);
        }
    }

    @Override
    public MapelSiswa getMapelSiswa(MapelSiswaId pk) {
        return (MapelSiswa) getSessionFactory().get(MapelSiswa.class, pk);
    }

    @Override
    public void selectMapelSiswa(MapelSiswa mplsis) {
        MapelSiswa MapelSiswaSel = getMapelSiswa(mplsis.getPk());
        if (MapelSiswaSel != null) {
            MapelSiswaSel.setAkademik(mplsis.getAkademik());
            MapelSiswaSel.setPraktik(mplsis.getPraktik());
            MapelSiswaSel.setTahunAjar(mplsis.getTahunAjar());

            getSessionFactory().update(MapelSiswaSel);
        }
    }

    @Override
    public List<MapelSiswa> getAllMapelSiswa() {
        return getSessionFactory().createCriteria(MapelSiswa.class).list();
    }

    @Override
    public MapelSiswa getMapelSiswa(Integer mapelId, Integer siswaId) {
        return (MapelSiswa) getSessionFactory()
                .createQuery("From MapelSiswa where pk.mapel.mapelId=:idMapel and pk.siswa.siswaId=:idSiswa")
                .setParameter("idSiswa", siswaId)
                .setParameter("idMapel", mapelId)
                .list().get(0);
    }

}
