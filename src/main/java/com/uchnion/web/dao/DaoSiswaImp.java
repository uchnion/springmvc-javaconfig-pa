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
    public void insertSiswa(Siswa siswa) {
        getSessionFactory().save(siswa);
    }

    @Override
    public void updateSiswa(Siswa siswa) {
        Siswa SiswaUp = getSiswa(siswa.getSiswaId());

        if (SiswaUp != null) {
            SiswaUp.setNis(siswa.getNis());
            SiswaUp.setNama(siswa.getNama());
            SiswaUp.setTempat_l(siswa.getTempat_l());
            SiswaUp.setTanggal_l(siswa.getTanggal_l());
            SiswaUp.setJenisKelamin(siswa.getJenisKelamin());
            SiswaUp.setAgama(siswa.getAgama());
            SiswaUp.setAnak_ke(siswa.getAnak_ke());
            SiswaUp.setStatinKeluarga(siswa.getStatinKeluarga());
            SiswaUp.setAlamat(siswa.getAlamat());
            SiswaUp.setTelepon(siswa.getTelepon());
            SiswaUp.setDikelas(siswa.getDikelas());
            SiswaUp.setPadatgl(siswa.getPadatgl());
            SiswaUp.setSemester(siswa.getSemester());
            SiswaUp.setSkol_asal(siswa.getSkol_asal());
            SiswaUp.setNamaayah(siswa.getNamaayah());
            SiswaUp.setNamaibu(siswa.getNamaibu());
            SiswaUp.setAlamatortu(siswa.getAlamatortu());
            SiswaUp.setTelepon_ortu(siswa.getTelepon_ortu());
            SiswaUp.setKerjaayah(siswa.getKerjaayah());
            SiswaUp.setKerjaibu(siswa.getKerjaibu());
            SiswaUp.setGaji_ortu(siswa.getGaji_ortu());
            SiswaUp.setNamawali(siswa.getNamawali());
            SiswaUp.setAlamatWali(siswa.getAlamatWali());
            SiswaUp.setTeleponWali(siswa.getTeleponWali());
            SiswaUp.setKerjaWali(siswa.getKerjaWali());
            SiswaUp.setGajiWali(siswa.getGajiWali());

            getSessionFactory().update(SiswaUp);
        }
    }

    @Override
    public void deleteSiswa(Integer siswaId) {
        Siswa siswaDel = getSiswa(siswaId);

        if (siswaDel != null) {
            getSessionFactory().delete(siswaDel);
        }
    }

    @Override
    public Siswa getSiswa(Integer siswaId) {
        return (Siswa) getSessionFactory().get(Siswa.class, siswaId);
    }

    @Override
    public void selectSiswa(Siswa siswa) {
        Siswa SiswaSel = getSiswa(siswa.getSiswaId());

        if (SiswaSel != null) {
            SiswaSel.setNis(siswa.getNis());
            SiswaSel.setNama(siswa.getNama());
            SiswaSel.setTempat_l(siswa.getTempat_l());
            SiswaSel.setTanggal_l(siswa.getTanggal_l());
            SiswaSel.setJenisKelamin(siswa.getJenisKelamin());
            SiswaSel.setAgama(siswa.getAgama());
            SiswaSel.setAnak_ke(siswa.getAnak_ke());
            SiswaSel.setStatinKeluarga(siswa.getStatinKeluarga());
            SiswaSel.setAlamat(siswa.getAlamat());
            SiswaSel.setTelepon(siswa.getTelepon());
            SiswaSel.setDikelas(siswa.getDikelas());
            SiswaSel.setPadatgl(siswa.getPadatgl());
            SiswaSel.setSemester(siswa.getSemester());
            SiswaSel.setSkol_asal(siswa.getSkol_asal());
            SiswaSel.setNamaayah(siswa.getNamaayah());
            SiswaSel.setNamaibu(siswa.getNamaibu());
            SiswaSel.setAlamatortu(siswa.getAlamatortu());
            SiswaSel.setTelepon_ortu(siswa.getTelepon_ortu());
            SiswaSel.setKerjaayah(siswa.getKerjaayah());
            SiswaSel.setKerjaibu(siswa.getKerjaibu());
            SiswaSel.setGaji_ortu(siswa.getGaji_ortu());
            SiswaSel.setNamawali(siswa.getNamawali());
            SiswaSel.setAlamatWali(siswa.getAlamatWali());
            SiswaSel.setTeleponWali(siswa.getTeleponWali());
            SiswaSel.setKerjaWali(siswa.getKerjaWali());
            SiswaSel.setGajiWali(siswa.getGajiWali());
            

            getSessionFactory().update(SiswaSel);

        }
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return getSessionFactory().createCriteria(Siswa.class).list();
    }

}
