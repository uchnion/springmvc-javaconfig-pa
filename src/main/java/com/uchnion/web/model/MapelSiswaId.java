package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marojahan
 */
@Embeddable
public class MapelSiswaId implements Serializable{
    
    private Siswa siswa;
    private Mapel mapel;

    @ManyToOne
    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    @ManyToOne
    public Mapel getMapel() {
        return mapel;
    }

    public void setMapel(Mapel mapel) {
        this.mapel = mapel;
    }
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MapelSiswaId that = (MapelSiswaId) o;

        if (siswa != null ? !siswa.equals(that.siswa) : that.siswa != null) {
            return false;
        }
        if (mapel != null ? !mapel.equals(that.mapel) : that.mapel != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result;
        result = (siswa != null ? siswa.hashCode() : 0);
        result = 31 * result + (mapel != null ? mapel.hashCode() : 0);
        return result;
    }
    
}
