package com.uchnion.web.service;

import com.uchnion.web.model.Mapel;
import com.uchnion.web.model.MapelSiswa;
import com.uchnion.web.model.MapelSiswaId;
import com.uchnion.web.model.Siswa;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface MapelSiswaService {
    
    void insertMapelSiswa (MapelSiswa mplsis);
    
    void updateMapelSiswa (MapelSiswa mplsis);
    
    void deleteMapelSiswa (MapelSiswaId pk);
    
    MapelSiswa getMapelSiswa (MapelSiswaId pk);
    
    void selectMapelSiswa (MapelSiswa mplsis);
    
    List<MapelSiswa>getAllMapelSiswa();
    
    List<Siswa>getAllSiswa();
    
    List<Mapel> getAllMapel();

    public MapelSiswa getMapelSiswa(Integer mapelId, Integer siswaId);
    
}
