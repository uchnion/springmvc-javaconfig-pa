
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
    void deleteMapel (String kodemapel);
    Mapel getMapel (String kodemapel);
    void selectMapel (Mapel mapel);
    List<Mapel>getAllMapel();
    
}
