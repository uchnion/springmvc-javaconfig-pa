package com.uchnion.web.dao;

import com.uchnion.web.model.KelasSiswa;
import com.uchnion.web.model.KelasSiswaId;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoKelasSiswa {
    
    void insertKelasSiswa (KelasSiswa klssis);
    
    void updateKelasSiswa (KelasSiswa klssis);
    
    void deleteKelasSiswa (KelasSiswaId pk);
    
    KelasSiswa getKelasSiswa (KelasSiswaId pk);
    
    void selectKelasSiswa (KelasSiswa klssis);
    
    List<KelasSiswa>getAllKelasSiswa();
    
}
