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
    
    void deleteAkun (String userakun);
    
    Akun getAkun (String userakun);
    
    void selectAkun (Akun akun);
    
    List<Akun>getAllAkun();
    
}
