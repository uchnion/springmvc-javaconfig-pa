package com.uchnion.web.dao;

import com.uchnion.web.model.Siswa;
import java.util.List;

/**
 *
 * @author Marojahan
 */
public interface DaoSiswa {

    void insertSiswa(Siswa siswa);
    void updateSiswa(Siswa siswa);
    void deleteSiswa(Integer siswaId);
    Siswa getSiswa(Integer siswaId);
    void selectSiswa(Siswa siswa);
    List<Siswa> getAllSiswa();

}
