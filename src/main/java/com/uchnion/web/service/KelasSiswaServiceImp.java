package com.uchnion.web.service;

import com.uchnion.web.dao.DaoKelas;
import com.uchnion.web.dao.DaoKelasSiswa;
import com.uchnion.web.dao.DaoSiswa;
import com.uchnion.web.model.Kelas;
import com.uchnion.web.model.KelasSiswa;
import com.uchnion.web.model.KelasSiswaId;
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
public class KelasSiswaServiceImp implements KelasSiswaService{
    
    @Autowired
    public DaoKelasSiswa daoks;
    
    @Autowired
    public DaoSiswa daosiswa;
    
    @Autowired
    public DaoKelas daokelas;

    @Override
    public void insertKelasSiswa(KelasSiswa klssis) {
        daoks.insertKelasSiswa(klssis);
    }

    @Override
    public void updateKelasSiswa(KelasSiswa klssis) {
        daoks.updateKelasSiswa(klssis);
    }

    @Override
    public void deleteKelasSiswa(KelasSiswaId pk) {
        daoks.deleteKelasSiswa(pk);
    }

    @Override
    @Transactional(readOnly = true)
    public KelasSiswa getKelasSiswa(KelasSiswaId pk) {
        return daoks.getKelasSiswa(pk);
    }

    @Override
    public void selectKelasSiswa(KelasSiswa klssis) {
        daoks.selectKelasSiswa(klssis);
    }

    @Override
    public List<KelasSiswa> getAllKelasSiswa() {
        return daoks.getAllKelasSiswa();
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return daosiswa.getAllSiswa();
    }

    @Override
    public List<Kelas> getAllKelas() {
        return daokelas.getAllKelas();
    }

    
    
}
