package com.uchnion.web.service;

import com.uchnion.web.model.Ekskul;
import com.uchnion.web.model.EkskulSiswa;
import com.uchnion.web.model.EkskulSiswaId;
import com.uchnion.web.model.Siswa;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface EkskulSiswaService {
    
    void insertEkskulSiswa (EkskulSiswa ekssis);
    
    void updateEkskulSiswa (EkskulSiswa ekssis);
    
    void deleteEkskulSiswa (EkskulSiswaId pk);
    
    EkskulSiswa getEkskulSiswa (EkskulSiswaId pk);
    
    void selectEkskulSiswa (EkskulSiswa ekssis);
    
    List<EkskulSiswa>getAllEkskulSiswa();
    
    List<Siswa>getAllSiswa();
    
    List<Ekskul> getAllEksKul();
    
}
