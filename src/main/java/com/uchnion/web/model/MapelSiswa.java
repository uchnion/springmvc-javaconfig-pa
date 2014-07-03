package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Marojahan
 */
@Entity
@Table(name = "mapel_siswa")
@AssociationOverrides({
    @AssociationOverride(name = "pk.siswa",
            joinColumns = @JoinColumn(name = "SISWA_ID")),
    @AssociationOverride(name = "pk.mapel",
            joinColumns = @JoinColumn(name = "MAPEL_ID"))})
public class MapelSiswa implements Serializable{
    
    private MapelSiswaId pk = new MapelSiswaId();
    private Integer akademik;
    private Integer praktik;
    private String tahunAjar;

    public MapelSiswa() {
    }

    @EmbeddedId
    public MapelSiswaId getPk() {
        return pk;
    }

    public void setPk(MapelSiswaId pk) {
        this.pk = pk;
    }
    
    @Transient
    public Siswa getSiswa() {
        return getPk().getSiswa();
    }

    public void setSiswa(Siswa siswa) {
        getPk().setSiswa(siswa);
    }
    
    @Transient
    public Mapel getMapel(){
        return getPk().getMapel();
    }
    
    public void setMapel(Mapel mapel){
        getPk().setMapel(mapel);
    }

    @Column(name = "NILAI_AKADEMIK",nullable = true)
    public Integer getAkademik() {
        return akademik;
    }

    public void setAkademik(Integer akademik) {
        this.akademik = akademik;
    }

    @Column(name = "NILAI_PRAKTIK",nullable = true)
    public Integer getPraktik() {
        return praktik;
    }

    public void setPraktik(Integer praktik) {
        this.praktik = praktik;
    }

    @Column(name = "TAHUN_AJAR", nullable = false, length = 10)
    public String getTahunAjar() {
        return tahunAjar;
    }

    public void setTahunAjar(String tahunAjar) {
        this.tahunAjar = tahunAjar;
    }
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MapelSiswa that = (MapelSiswa) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }
}
