package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marojahan
 */
@Embeddable
public class KelasSiswaId implements Serializable{
    
    private Siswa siswa;
    private Kelas kelas;

    @ManyToOne
    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    @ManyToOne
    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        KelasSiswaId that = (KelasSiswaId) o;

        if (siswa != null ? !siswa.equals(that.siswa) : that.siswa != null) {
            return false;
        }
        if (kelas != null ? !kelas.equals(that.kelas) : that.kelas != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result;
        result = (siswa != null ? siswa.hashCode() : 0);
        result = 31 * result + (kelas != null ? kelas.hashCode() : 0);
        return result;
    }
}
