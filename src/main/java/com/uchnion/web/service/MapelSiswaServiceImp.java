package com.uchnion.web.service;

import com.uchnion.web.dao.DaoKelasSiswa;
import com.uchnion.web.dao.DaoMapel;
import com.uchnion.web.dao.DaoMapelSiswa;
import com.uchnion.web.dao.DaoSiswa;
import com.uchnion.web.model.Mapel;
import com.uchnion.web.model.MapelSiswa;
import com.uchnion.web.model.MapelSiswaId;
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
public class MapelSiswaServiceImp implements MapelSiswaService{
    
    @Autowired
    public DaoMapelSiswa daoms;
    
    @Autowired
    public DaoSiswa daosiswa;
    
    @Autowired
    public DaoMapel daomapel;

    @Override
    public void insertMapelSiswa(MapelSiswa mplsis) {
        daoms.insertMapelSiswa(mplsis);
    }

    @Override
    public void updateMapelSiswa(MapelSiswa mplsis) {
        daoms.updateMapelSiswa(mplsis);
    }

    @Override
    public void deleteMapelSiswa(MapelSiswaId pk) {
        daoms.deleteMapelSiswa(pk);
    }

    @Override
    @Transactional(readOnly = true)
    public MapelSiswa getMapelSiswa(MapelSiswaId pk) {
        return daoms.getMapelSiswa(pk);
    }

    @Override
    public void selectMapelSiswa(MapelSiswa mplsis) {
        daoms.selectMapelSiswa(mplsis);
    }

    @Override
    public List<MapelSiswa> getAllMapelSiswa() {
        return daoms.getAllMapelSiswa();
    }

    @Override
    public List<Siswa> getAllSiswa() {
        return daosiswa.getAllSiswa();
    }

    @Override
    public List<Mapel> getAllMapel() {
        return daomapel.getAllMapel();
    }

    @Override
    public MapelSiswa getMapelSiswa(Integer mapelId, Integer siswaId) {
        return daoms.getMapelSiswa(mapelId,siswaId);
    }
    
}
