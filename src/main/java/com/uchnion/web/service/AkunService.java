package com.uchnion.web.service;

import com.uchnion.web.model.Akun;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface AkunService {
    
    void insertAkun (Akun akun);
    
    void updateAkun (Akun akun);
    
    void deleteAkun (Integer akunid);
    
    Akun getAkun (Integer akunid);
    
    void selectAkun (Akun akun);
    
    List<Akun>getAllAkun();
    
}
