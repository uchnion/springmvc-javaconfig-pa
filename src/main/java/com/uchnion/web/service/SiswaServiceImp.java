package com.uchnion.web.service;

import com.uchnion.web.dao.DaoSiswa;
import com.uchnion.web.model.Siswa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Marojahan
 */
@Service
@Transactional
public class SiswaServiceImp implements SiswaService {

    @Autowired
    private DaoSiswa daosiswa;

    @Override
    public void insertSiswa(Siswa siswa) {
        daosiswa.insertSiswa(siswa);
    }

    @Override
    public void updateSiswa(Siswa siswa) {
        daosiswa.updateSiswa(siswa);
    }

    @Override
    public void deleteSiswa(Integer id) {
        daosiswa.deleteSiswa(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Siswa getSiswa(Integer id) {
        return daosiswa.getSiswa(id);
    }

    @Override
    public void selectSiswa(Siswa siswa) {
        daosiswa.selectSiswa(siswa);
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return daosiswa.getAllSiswa();
    }

}
