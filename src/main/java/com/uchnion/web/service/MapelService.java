package com.uchnion.web.service;

import com.uchnion.web.model.Mapel;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface MapelService {
    
    void insertMapel (Mapel mapel);
    
    void updateMapel (Mapel mapel);
    
    void deleteMapel (String kodemapel);
    
    Mapel getMapel (String kodemapel);
    
    void selectMapel (Mapel mapel);
    
    List<Mapel>getAllMapel();
    
}
