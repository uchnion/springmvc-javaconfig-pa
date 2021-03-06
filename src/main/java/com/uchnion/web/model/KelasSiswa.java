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
@Table(name = "kelas_siswa")
@AssociationOverrides({
    @AssociationOverride(name = "pk.siswa",
            joinColumns = @JoinColumn(name = "SISWA_ID")),
    @AssociationOverride(name = "pk.kelas",
            joinColumns = @JoinColumn(name = "KELAS_ID"))})
public class KelasSiswa implements Serializable{
    
    private KelasSiswaId pk = new KelasSiswaId();
    private String tahunAjar;

    public KelasSiswa() {
    }

    @EmbeddedId
    public KelasSiswaId getPk() {
        return pk;
    }

    public void setPk(KelasSiswaId pk) {
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
    public Kelas getKelas() {
        return getPk().getKelas();
    }

    public void setKelas(Kelas kelas) {
        getPk().setKelas(kelas);
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

        KelasSiswa that = (KelasSiswa) o;

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
