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
@Table(name = "SISWA")
public class Siswa implements Serializable {

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
    @Column(nullable = false, length = 50)
    private String tempat_l;
    
    @NotNull
    @Column(nullable = false, length = 20)
    private String tanggal_l;
    
    @NotNull
    @Column(nullable = false, length = 20)
    private String jeniskelamin;
    
    @NotNull
    @Column(nullable = false, length = 30)
    private String agama;
    
    @NotNull
    @Column(nullable = false, length = 20)
    private String anak_ke;
    
    @NotNull
    @Column(nullable = false, length = 30)
    private String statinkeluarga;
    
    @NotNull
    @Column(nullable = false, length = 200)
    private String alamat;
    
    @NotNull
    @Column(nullable = false, length = 20)
    private String telepon;
    
    @Column(nullable = false,length = 10)
    private String dikelas;
    
    @Column(nullable = false,length = 20)
    private String padatgl;
    
    @Column(nullable = false, length = 20)
    private String semester;
    
    @NotNull
    @Column(nullable = false, length = 120)
    private String skol_asal;
    
    @NotNull
    @Column(nullable = false, length = 200)
    private String almskol_asal;
    
    @NotNull
    @Column(nullable = false, length = 10)
    private String ijazahtahun;
    
    @NotNull
    @Column(nullable = false, length = 30)
    private String ijazahno;
    
    @NotNull
    @Column(nullable = false, length = 10)
    private String skhuntahun;
    
    @NotNull
    @Column(nullable = false, length = 30)
    private String skhunno;
    
    @NotNull
    @Column(nullable = false, length = 120)
    private String namaayah;
    
    @NotNull
    @Column(nullable = false, length = 120)
    private String namaibu;
    
    @Column(nullable = false, length = 120)
    private String alamatortu;
    
    @Column(nullable = false, length = 20)
    private String telepon_ortu;
    
    @Column(nullable = false, length = 120)
    private String kerjaayah;
    
    @Column(nullable = false, length = 120)
    private String kerjaibu;
    
    @NotNull
    @Column(nullable = false)
    private Integer gaji_ortu;
    
    @Column(nullable = false, length = 100)
    private String namawali;
    
    @Column(nullable = false, length = 200)
    private String alamatwali;
    
    @Column(nullable = false, length = 20)
    private String teleponwali;
    
    @Column(nullable = false, length = 100)
    private String kerjawali;
    
    @Column(nullable = false)
    private Integer penghasilan_wali;
    
    //Create Getter and Setter
    //=====================================//
    
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

    public String getTanggal_l() {
        return tanggal_l;
    }

    public void setTanggal_l(String tanggal_l) {
        this.tanggal_l = tanggal_l;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAnak_ke() {
        return anak_ke;
    }

    public void setAnak_ke(String anak_ke) {
        this.anak_ke = anak_ke;
    }

    public String getStatinkeluarga() {
        return statinkeluarga;
    }

    public void setStatinkeluarga(String statinkeluarga) {
        this.statinkeluarga = statinkeluarga;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getDikelas() {
        return dikelas;
    }

    public void setDikelas(String dikelas) {
        this.dikelas = dikelas;
    }

    public String getPadatgl() {
        return padatgl;
    }

    public void setPadatgl(String padatgl) {
        this.padatgl = padatgl;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSkol_asal() {
        return skol_asal;
    }

    public void setSkol_asal(String skol_asal) {
        this.skol_asal = skol_asal;
    }

    public String getAlmskol_asal() {
        return almskol_asal;
    }

    public void setAlmskol_asal(String almskol_asal) {
        this.almskol_asal = almskol_asal;
    }

    public String getIjazahtahun() {
        return ijazahtahun;
    }

    public void setIjazahtahun(String ijazahtahun) {
        this.ijazahtahun = ijazahtahun;
    }

    public String getIjazahno() {
        return ijazahno;
    }

    public void setIjazahno(String ijazahno) {
        this.ijazahno = ijazahno;
    }

    public String getSkhuntahun() {
        return skhuntahun;
    }

    public void setSkhuntahun(String skhuntahun) {
        this.skhuntahun = skhuntahun;
    }

    public String getSkhunno() {
        return skhunno;
    }

    public void setSkhunno(String skhunno) {
        this.skhunno = skhunno;
    }

    public String getNamaayah() {
        return namaayah;
    }

    public void setNamaayah(String namaayah) {
        this.namaayah = namaayah;
    }

    public String getNamaibu() {
        return namaibu;
    }

    public void setNamaibu(String namaibu) {
        this.namaibu = namaibu;
    }

    public String getAlamatortu() {
        return alamatortu;
    }

    public void setAlamatortu(String alamatortu) {
        this.alamatortu = alamatortu;
    }

    public String getTelepon_ortu() {
        return telepon_ortu;
    }

    public void setTelepon_ortu(String telepon_ortu) {
        this.telepon_ortu = telepon_ortu;
    }

    public String getKerjaayah() {
        return kerjaayah;
    }

    public void setKerjaayah(String kerjaayah) {
        this.kerjaayah = kerjaayah;
    }

    public String getKerjaibu() {
        return kerjaibu;
    }

    public void setKerjaibu(String kerjaibu) {
        this.kerjaibu = kerjaibu;
    }

    public Integer getGaji_ortu() {
        return gaji_ortu;
    }

    public void setGaji_ortu(Integer gaji_ortu) {
        this.gaji_ortu = gaji_ortu;
    }

    public String getNamawali() {
        return namawali;
    }

    public void setNamawali(String namawali) {
        this.namawali = namawali;
    }

    public String getAlamatwali() {
        return alamatwali;
    }

    public void setAlamatwali(String alamatwali) {
        this.alamatwali = alamatwali;
    }

    public String getTeleponwali() {
        return teleponwali;
    }

    public void setTeleponwali(String teleponwali) {
        this.teleponwali = teleponwali;
    }

    public String getKerjawali() {
        return kerjawali;
    }

    public void setKerjawali(String kerjawali) {
        this.kerjawali = kerjawali;
    }

    public Integer getPenghasilan_wali() {
        return penghasilan_wali;
    }

    public void setPenghasilan_wali(Integer penghasilan_wali) {
        this.penghasilan_wali = penghasilan_wali;
    }
    
}
