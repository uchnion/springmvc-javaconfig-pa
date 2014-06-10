package com.uchnion.web.service;

import java.util.List;
import com.uchnion.web.model.EksKul;

/**
 *
 * @author Marojahan
 */
public interface EksKulService {
    
    void insertEksKul (EksKul ekskul);
    
    void updateEksKul (EksKul ekskul);
    
    void deleteEksKul (String id_ekskul);
    
    EksKul getEksKul (String id_ekskul);
    
    void selectEksKul (EksKul ekskul);
    
    List<EksKul>getAllEksKul();
    
}
