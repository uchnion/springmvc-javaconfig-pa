package com.uchnion.web.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Marojahan
 */
@Entity
@Table (name ="SISWA")
public class Siswa implements Serializable{
    
    public static final long serialVersionID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
    
    @NotNull
    @Column(nullable = false, length = 20)
    private String nis;
    
    @NotNull
    @Column(nullable = false, length = 120)
    private String nama;
    
    @NotNull
    @Column(nullable = false, length = 20)
    private String jk_kelamin;
    
    @NotNull
    @Column(nullable = false, length = 120)
    private String tempat_l;
    
    @NotNull
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tanggal_l;
    
    @NotNull
    @Column(nullable = false, length = 200)
    private String alamat;
    
    @NotNull
    @Column(nullable = false, length = 15)
    private Integer gaji_ortu;
    
    
    
//    generate setter and getter
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempat_l() {
        return tempat_l;
    }

    public void setTempat_l(String tempat_l) {
        this.tempat_l = tempat_l;
    }

    public Date getTanggal_l() {
        return tanggal_l;
    }

    public void setTanggal_l(Date tanggal_l) {
        this.tanggal_l = tanggal_l;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getGaji_ortu() {
        return gaji_ortu;
    }

    public void setGaji_ortu(Integer gaji_ortu) {
        this.gaji_ortu = gaji_ortu;
    }

    public String getJk_kelamin() {
        return jk_kelamin;
    }

    public void setJk_kelamin(String jk_kelamin) {
        this.jk_kelamin = jk_kelamin;
    }
    
}
