package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Marojahan
 */
@Entity
@Table(name = "EKSKUL")
public class EksKul implements Serializable{
    
    private static final long serialVersionID = 1L;
    
    @Id
    @NotNull
    @Column(name = "KODEKELAS", nullable = false, length = 20)
    private String id_ekskul;
    
    @NotNull
    @Column (nullable = false, length = 20)
    private String nama_ekskul;
    
    @NotNull
    @Column(nullable = false, length = 200)
    private String keterangan;
    
    

    public String getId_ekskul() {
        return id_ekskul;
    }

    public void setId_ekskul(String id_ekskul) {
        this.id_ekskul = id_ekskul;
    }

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
    
}
