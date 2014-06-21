package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marojahan
 */
@Embeddable
public class EkskulSiswaId implements Serializable{
    
    private Siswa siswa;
    private Ekskul ekskul;

    @ManyToOne
    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    @ManyToOne
    public Ekskul getEkskul() {
        return ekskul;
    }

    public void setEkskul(Ekskul ekskul) {
        this.ekskul = ekskul;
    }
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EkskulSiswaId that = (EkskulSiswaId) o;

        if (siswa != null ? !siswa.equals(that.siswa) : that.siswa != null) {
            return false;
        }
        if (ekskul != null ? !ekskul.equals(that.ekskul) : that.ekskul != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result;
        result = (siswa != null ? siswa.hashCode() : 0);
        result = 31 * result + (ekskul != null ? ekskul.hashCode() : 0);
        return result;
    }
    
}
