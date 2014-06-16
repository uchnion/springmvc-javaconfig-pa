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
@Table(name = "KELAS")
public class Kelas implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "KELASID", nullable = false, length = 20)
    private Integer kelasid;

    @NotNull
    @Column(name = "KODEKELAS", nullable = false, length = 20)
    private String kodekelas;

    @NotNull
    @Column(name = "NAMAKELAS", nullable = false, length = 20)
    private String namakelas;

    @NotNull
    @Column(name = "TAHUNAJAR", nullable = false, length = 10)
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

    public Integer getKelasid() {
        return kelasid;
    }

    public void setKelasid(Integer kelasid) {
        this.kelasid = kelasid;
    }

   
}
