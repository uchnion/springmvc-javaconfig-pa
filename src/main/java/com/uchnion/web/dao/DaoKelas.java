package com.uchnion.web.dao;

import com.uchnion.web.model.Kelas;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoKelas {
    
    void insertKelas (Kelas kelas);
    
    void updateKelas (Kelas kelas);
    
    void deleteKelas (Integer kelasId);
    
    Kelas getKelas (Integer kelasId);
    
    void selectKelas (Kelas kelas);
    
    List<Kelas>getAllKelas();
    
}
