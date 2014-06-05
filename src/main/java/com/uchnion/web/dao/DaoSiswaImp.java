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
            SiswaUp.setTempat_l(siswa.getTempat_l());
            SiswaUp.setTanggal_l(siswa.getTanggal_l());
            SiswaUp.setJeniskelamin(siswa.getJeniskelamin());
            SiswaUp.setAgama(siswa.getAgama());
            SiswaUp.setAnak_ke(siswa.getAnak_ke());
            SiswaUp.setStatinkeluarga(siswa.getStatinkeluarga());
            SiswaUp.setAlamat(siswa.getAlamat());
            SiswaUp.setTelepon(siswa.getTelepon());
            SiswaUp.setDikelas(siswa.getDikelas());
            SiswaUp.setPadatgl(siswa.getPadatgl());
            SiswaUp.setSemester(siswa.getSemester());
            SiswaUp.setSkol_asal(siswa.getSkol_asal());
            SiswaUp.setAlmskol_asal(siswa.getAlmskol_asal());
            SiswaUp.setIjazahtahun(siswa.getIjazahtahun());
            SiswaUp.setIjazahno(siswa.getIjazahno());
            SiswaUp.setSkhuntahun(siswa.getSkhuntahun());
            SiswaUp.setSkhunno(siswa.getSkhunno());
            SiswaUp.setNamaayah(siswa.getNamaayah());
            SiswaUp.setNamaibu(siswa.getNamaibu());
            SiswaUp.setAlamatortu(siswa.getAlamatortu());
            SiswaUp.setTelepon_ortu(siswa.getTelepon_ortu());
            SiswaUp.setKerjaayah(siswa.getKerjaayah());
            SiswaUp.setKerjaibu(siswa.getKerjaibu());
            SiswaUp.setGaji_ortu(siswa.getGaji_ortu());
            SiswaUp.setNamawali(siswa.getNamawali());
            SiswaUp.setAlamatwali(siswa.getAlamatwali());
            SiswaUp.setTeleponwali(siswa.getTeleponwali());
            SiswaUp.setKerjawali(siswa.getKerjawali());
            SiswaUp.setPenghasilan_wali(siswa.getPenghasilan_wali());

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
            SiswaSel.setTempat_l(siswa.getTempat_l());
            SiswaSel.setTanggal_l(siswa.getTanggal_l());
            SiswaSel.setJeniskelamin(siswa.getJeniskelamin());
            SiswaSel.setAgama(siswa.getAgama());
            SiswaSel.setAnak_ke(siswa.getAnak_ke());
            SiswaSel.setStatinkeluarga(siswa.getStatinkeluarga());
            SiswaSel.setAlamat(siswa.getAlamat());
            SiswaSel.setTelepon(siswa.getTelepon());
            SiswaSel.setDikelas(siswa.getDikelas());
            SiswaSel.setPadatgl(siswa.getPadatgl());
            SiswaSel.setSemester(siswa.getSemester());
            SiswaSel.setSkol_asal(siswa.getSkol_asal());
            SiswaSel.setAlmskol_asal(siswa.getAlmskol_asal());
            SiswaSel.setIjazahtahun(siswa.getIjazahtahun());
            SiswaSel.setIjazahno(siswa.getIjazahno());
            SiswaSel.setSkhuntahun(siswa.getSkhuntahun());
            SiswaSel.setSkhunno(siswa.getSkhunno());
            SiswaSel.setNamaayah(siswa.getNamaayah());
            SiswaSel.setNamaibu(siswa.getNamaibu());
            SiswaSel.setAlamatortu(siswa.getAlamatortu());
            SiswaSel.setTelepon_ortu(siswa.getTelepon_ortu());
            SiswaSel.setKerjaayah(siswa.getKerjaayah());
            SiswaSel.setKerjaibu(siswa.getKerjaibu());
            SiswaSel.setGaji_ortu(siswa.getGaji_ortu());
            SiswaSel.setNamawali(siswa.getNamawali());
            SiswaSel.setAlamatwali(siswa.getAlamatwali());
            SiswaSel.setTeleponwali(siswa.getTeleponwali());
            SiswaSel.setKerjawali(siswa.getKerjawali());
            SiswaSel.setPenghasilan_wali(siswa.getPenghasilan_wali());
            

            getSessionFactory().update(SiswaSel);

        }
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return getSessionFactory().createCriteria(Siswa.class).list();
    }

}
