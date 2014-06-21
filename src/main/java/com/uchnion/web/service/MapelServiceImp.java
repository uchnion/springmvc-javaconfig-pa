package com.uchnion.web.service;

import com.uchnion.web.dao.DaoMapel;
import com.uchnion.web.model.Mapel;
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
public class MapelServiceImp implements MapelService{

    @Autowired
    private DaoMapel daomapel;
    
    @Override
    public void insertMapel(Mapel mapel) {
        daomapel.insertMapel(mapel);
    }

    @Override
    public void updateMapel(Mapel mapel) {
        daomapel.updateMapel(mapel);
    }

    @Override   
    public void deleteMapel(Integer mapelId) {
        daomapel.deleteMapel(mapelId);
    }

    @Override
    @Transactional(readOnly = true)
    public Mapel getMapel(Integer mapelId) {
        return daomapel.getMapel(mapelId);
    }

    @Override
    public void selectMapel(Mapel mapel) {
        daomapel.selectMapel(mapel);
    }

    @Override
    public List<Mapel> getAllMapel() {
        return daomapel.getAllMapel();
    }
    
}
