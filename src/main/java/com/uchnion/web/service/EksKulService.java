package com.uchnion.web.service;

import java.util.List;
import com.uchnion.web.model.EksKul;

/**
 *
 * @author Marojahan
 */
public interface EksKulService {
    
    void insertEksKul (EksKul eksKul);
    
    void updateEksKul (EksKul eksKul);
    
    void deleteEksKul (Integer ekskulid);
    
    EksKul getEksKul (Integer ekskulid);
    
    void selectEksKul (EksKul eksKul);
    
    List<EksKul>getAllEksKul();
    
}
