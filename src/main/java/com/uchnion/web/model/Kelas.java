
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
@Table(name = "KELAS")
public class Kelas implements Serializable{
    
    private static final long serialVersionID = 1L;
    
    @Id
    @NotNull
    @Column(name = "KODEKELAS", nullable = false, length = 20)
    private String kodekelas;
    
    @NotNull
    @Column (nullable = false, length = 20)
    private String namakelas;
    
    @NotNull
    @Column(nullable = false, length = 10)
    private String tahunajaran;

//    getter and setter
    public String getKodekelas() {
        return kodekelas;
    }

    public void setKodekelas(String kodekelas) {
        this.kodekelas = kodekelas;
    }

    public String getNamakelas() {
        return namakelas;
    }

    public void setNamakelas(String namakelas) {
        this.namakelas = namakelas;
    }

    public String getTahunajaran() {
        return tahunajaran;
    }

    public void setTahunajaran(String tahunajaran) {
        this.tahunajaran = tahunajaran;
    }
    
    
    
}
