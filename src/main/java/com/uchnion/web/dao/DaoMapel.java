
package com.uchnion.web.dao;

import com.uchnion.web.model.Mapel;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoMapel {
    
    void insertMapel (Mapel mapel);
    
    void updateMapel (Mapel mapel);
    
    void deleteMapel (Integer mapelid);
    
    Mapel getMapel (Integer mapelid);
    
    void selectMapel (Mapel mapel);
    
    List<Mapel>getAllMapel();
    
}
