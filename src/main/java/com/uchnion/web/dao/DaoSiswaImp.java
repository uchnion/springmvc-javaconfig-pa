package com.uchnion.web.dao;

import com.uchnion.web.model.Siswa;
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
public class DaoSiswaImp implements DaoSiswa {

    @Autowired
    private SessionFactory SessionFactory;

    private Session getSessionFactory() {
        return SessionFactory.getCurrentSession();
    }

    @Override
    public void inserSiswa(Siswa siswa) {
        getSessionFactory().save(siswa);
    }

    @Override
    public void updateSiswa(Siswa siswa) {
        Siswa SiswaUp = getSiswa(siswa.getId());

        if (SiswaUp != null) {
            SiswaUp.setNis(siswa.getNis());
            SiswaUp.setNama(siswa.getNama());
            SiswaUp.setJk_kelamin(siswa.getJk_kelamin());
            SiswaUp.setTempat_l(siswa.getTempat_l());
            SiswaUp.setTanggal_l(siswa.getTanggal_l());
            SiswaUp.setAlamat(siswa.getAlamat());
            SiswaUp.setGaji_ortu(siswa.getGaji_ortu());

            getSessionFactory().update(SiswaUp);
        }
    }

    @Override
    public void deleteSiswa(Integer id) {
        Siswa siswaDel = getSiswa(id);

        if (siswaDel != null) {
            getSessionFactory().delete(siswaDel);
        }
    }

    @Override
    public Siswa getSiswa(Integer id) {
        return (Siswa) getSessionFactory().get(Siswa.class, id);
    }

    @Override
    public void selectSiswa(Siswa siswa) {
        Siswa SiswaSel = getSiswa(siswa.getId());

        if (SiswaSel != null) {
            SiswaSel.setNis(siswa.getNis());
            SiswaSel.setNama(siswa.getNama());
            SiswaSel.setJk_kelamin(siswa.getJk_kelamin());
            SiswaSel.setTempat_l(siswa.getTempat_l());
            SiswaSel.setTanggal_l(siswa.getTanggal_l());
            SiswaSel.setAlamat(siswa.getAlamat());
            SiswaSel.setGaji_ortu(siswa.getGaji_ortu());

            getSessionFactory().update(SiswaSel);

        }
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return getSessionFactory().createCriteria(Siswa.class).list();
    }

}
