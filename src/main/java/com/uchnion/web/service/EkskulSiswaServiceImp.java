package com.uchnion.web.service;
import com.uchnion.web.dao.DaoEkskul;
import com.uchnion.web.dao.DaoEkskulSiswa;
import com.uchnion.web.dao.DaoSiswa;
import com.uchnion.web.model.Ekskul;
import com.uchnion.web.model.EkskulSiswa;
import com.uchnion.web.model.EkskulSiswaId;
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
public class EkskulSiswaServiceImp implements EkskulSiswaService{
    
    @Autowired
    public DaoEkskulSiswa daoekssis;
    
    @Autowired
    public DaoSiswa daosiswa;
    
    @Autowired
    public DaoEkskul daoekskul;

    @Override
    public void insertEkskulSiswa(EkskulSiswa ekssis) {
        daoekssis.insertEkskulSiswa(ekssis);
    }

    @Override
    public void updateEkskulSiswa(EkskulSiswa ekssis) {
        daoekssis.updateEkskulSiswa(ekssis);
    }

    @Override
    public void deleteEkskulSiswa(EkskulSiswaId pk) {
        daoekssis.deleteEkskulSiswa(pk);
    }

    @Override
    @Transactional(readOnly = true)
    public EkskulSiswa getEkskulSiswa(EkskulSiswaId pk) {
        return daoekssis.getEkskulSiswa(pk);
    }

    @Override
    public void selectEkskulSiswa(EkskulSiswa ekssis) {
        daoekssis.selectEkskulSiswa(ekssis);
    }

    @Override
    public List<EkskulSiswa> getAllEkskulSiswa() {
        return daoekssis.getAllEkskulSiswa();
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return daosiswa.getAllSiswa();
    }

    @Override
    public List<Ekskul> getAllEksKul() {
        return daoekskul.getAllEkskul();
    }
    
}
