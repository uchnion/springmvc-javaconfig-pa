package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Marojahan
 */
@Entity
@Table(name = "EKSKUL")
public class EksKul implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "EKSKUL_ID", nullable = false)
    private Integer ekskulid;

    @NotNull
    @Column(name = "KEDE_EKSKUL", nullable = false, length = 20)
    private String kode_ekskul;

    @NotNull
    @Column(name = "NAMA_EKSKUL", nullable = false, length = 20)
    private String nama_ekskul;

    @NotNull
    @Column(name = "KETERANGAN", nullable = false, length = 200)
    private String keterangan;

    //Getter and Setter
    
    public String getNama_ekskul() {
        return nama_ekskul;
    }

    public void setNama_ekskul(String nama_ekskul) {
        this.nama_ekskul = nama_ekskul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getEkskulid() {
        return ekskulid;
    }

    public void setEkskulid(Integer ekskulid) {
        this.ekskulid = ekskulid;
    }

    public String getKode_ekskul() {
        return kode_ekskul;
    }

    public void setKode_ekskul(String kode_ekskul) {
        this.kode_ekskul = kode_ekskul;
    }

}
