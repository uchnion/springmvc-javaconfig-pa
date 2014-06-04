package com.uchnion.web.service;

import com.uchnion.web.model.Kelas;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface KelasService {
    
    void insertKelas (Kelas kelas);
    
    void updateKelas (Kelas kelas);
    
    void deleteKelas (String kodekelas);
    
    Kelas getKelas (String kodekelas);
    
    void selectKelas (Kelas kelas);
    
    List<Kelas>getAllKelas();
    
}
