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
@Table(name = "ekskul_siswa")
@AssociationOverrides({
    @AssociationOverride(name = "pk.siswa",
            joinColumns = @JoinColumn(name = "SISWA_ID")),
    @AssociationOverride(name = "pk.ekskul",
            joinColumns = @JoinColumn(name = "EKSKUL_ID"))})
public class EkskulSiswa implements Serializable {

    private EkskulSiswaId pk = new EkskulSiswaId();
    private String tahunAjar;
    private String semester;
    private String nilaiEkskul;

    public EkskulSiswa() {
    }

    @EmbeddedId
    public EkskulSiswaId getPk() {
        return pk;
    }

    public void setPk(EkskulSiswaId pk) {
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
    public Ekskul getEkskul() {
        return getPk().getEkskul();
    }

    public void setEkskul(Ekskul ekskul){
        getPk().setEkskul(ekskul);
    }

    @Column(name = "TAHUN_AJAR", nullable = true, length = 10)
    public String getTahunAjar() {
        return tahunAjar;
    }

    public void setTahunAjar(String tahunAjar) {
        this.tahunAjar = tahunAjar;
    }

    @Column(name = "SEMESTER", nullable = true, length = 10)
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Column(name = "NILAI_EKSKUL", nullable = true, length = 10)
    public String getNilaiEkskul() {
        return nilaiEkskul;
    }

    public void setNilaiEkskul(String nilaiEkskul) {
        this.nilaiEkskul = nilaiEkskul;
    }
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EkskulSiswa that = (EkskulSiswa) o;

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
