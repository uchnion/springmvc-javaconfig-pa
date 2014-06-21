package com.uchnion.web.dao;

import com.uchnion.web.model.Ekskul;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoEkskul {
    
    void insertEkskul (Ekskul ekskul);
    
    void updateEkskul (Ekskul ekskul);
    
    void deleteEkskul (Integer ekskulid);
    
    Ekskul getEkskul (Integer ekskulid);
    
    void selectEkskul (Ekskul ekskul);
    
    List<Ekskul>getAllEkskul();
    
}
