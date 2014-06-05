package com.uchnion.web.service;

import com.uchnion.web.dao.DaoKelas;
import com.uchnion.web.model.Kelas;
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
public class KelasServiceImp implements KelasService{
    
    @Autowired
    private DaoKelas daokelas;

    @Override
    public void insertKelas(Kelas kelas) {
        daokelas.insertKelas(kelas);
    }

    @Override
    public void updateKelas(Kelas kelas) {
        daokelas.updateKelas(kelas);
    }

    @Override
    public void deleteKelas(String kodekelas) {
        daokelas.deleteKelas(kodekelas);
    }

    @Override
    @Transactional(readOnly = true)
    public Kelas getKelas(String kodekelas) {
        return daokelas.getKelas(kodekelas);
    }

    @Override
    public void selectKelas(Kelas kelas) {
        daokelas.selectKelas(kelas);
    }

    @Override
    public List<Kelas> getAllKelas() {
        return daokelas.getAllKelas();
    }
    
}
