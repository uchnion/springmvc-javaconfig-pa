package com.uchnion.web.service;

import com.uchnion.web.model.Siswa;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface SiswaService {
    
    void insertSiswa (Siswa siswa);
    
    void updateSiswa (Siswa siswa);
    
    void deleteSiswa (Integer siswaId);
    
    Siswa getSiswa (Integer siswaId);
    
    void selectSiswa (Siswa siswa);
    
    List<Siswa>getAllSiswa();
    
}
