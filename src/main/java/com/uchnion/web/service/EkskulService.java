package com.uchnion.web.service;

import java.util.List;
import com.uchnion.web.model.Ekskul;

/**
 *
 * @author Marojahan
 */
public interface EkskulService {
    
    void insertEkskul (Ekskul eksKul);
    
    void updateEkskul (Ekskul eksKul);
    
    void deleteEkskul (Integer ekskulId);
    
    Ekskul getEkskul (Integer ekskulId);
    
    void selectEkskul (Ekskul eksKul);
    
    List<Ekskul>getAllEkskul();
    
}
