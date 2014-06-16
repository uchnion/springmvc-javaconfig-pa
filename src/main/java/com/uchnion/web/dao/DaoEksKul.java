package com.uchnion.web.dao;

import com.uchnion.web.model.EksKul;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoEksKul {
    
    void insertEksKul (EksKul eksKul);
    
    void updateEksKul (EksKul eksKul);
    
    void deleteEksKul (Integer ekskulid);
    
    EksKul getEksKul (Integer ekskulid);
    
    void selectEksKul (EksKul eksKul);
    
    List<EksKul>getAllEksKul();
    
}
