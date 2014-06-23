package com.uchnion.web.dao;

import com.uchnion.web.model.EkskulSiswa;
import com.uchnion.web.model.EkskulSiswaId;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoEkskulSiswa {
    
    void insertEkskulSiswa (EkskulSiswa ekssis);
    
    void updateEkskulSiswa (EkskulSiswa ekssis);
    
    void deleteEkskulSiswa (EkskulSiswaId pk);
    
    EkskulSiswa getEkskulSiswa (EkskulSiswaId pk);
    
    void selectEkskulSiswa (EkskulSiswa ekssis);
    
    List<EkskulSiswa>getAllEkskulSiswa();
    
}
