package com.uchnion.web.service;

import com.uchnion.web.model.Kelas;
import com.uchnion.web.model.KelasSiswa;
import com.uchnion.web.model.KelasSiswaId;
import com.uchnion.web.model.Siswa;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface KelasSiswaService {
    
    void insertKelasSiswa (KelasSiswa klssis);
    
    void updateKelasSiswa (KelasSiswa klssis);
    
    void deleteKelasSiswa (KelasSiswaId pk);
    
    KelasSiswa getKelasSiswa (KelasSiswaId pk);
    
    void selectKelasSiswa (KelasSiswa klssis);
    
    List<KelasSiswa>getAllKelasSiswa();
    
    List<Siswa>getAllSiswa();
    
    List<Kelas> getAllKelas();
    
}
