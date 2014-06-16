package com.uchnion.web.dao;

import com.uchnion.web.model.Akun;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoAkun {
    
    void insertAkun (Akun akun);
    
    void updateAkun (Akun akun);
    
    void deleteAkun (Integer akunid);
    
    Akun getAkun (Integer akunid);
    
    void selectAkun (Akun akun);
    
    List<Akun>getAllAkun();
    
}
