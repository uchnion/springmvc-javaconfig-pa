package com.uchnion.web.dao;

import com.uchnion.web.model.MapelSiswa;
import com.uchnion.web.model.MapelSiswaId;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoMapelSiswa {
    void insertMapelSiswa (MapelSiswa mplsis);
    
    void updateMapelSiswa (MapelSiswa mplsis);
    
    void deleteMapelSiswa (MapelSiswaId pk);
    
    MapelSiswa getMapelSiswa (MapelSiswaId pk);
    
    void selectMapelSiswa (MapelSiswa mplsis);
    
    List<MapelSiswa>getAllMapelSiswa();

    public MapelSiswa getMapelSiswa(Integer mapelId, Integer siswaId);
}
