package com.uchnion.web.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Marojahan
 */
@Entity
@Table(name = "siswa", uniqueConstraints = {@UniqueConstraint(columnNames = "NIS")})
public class Siswa implements Serializable{
    
    private Integer siswaId;
    private String nis;
    private String nama;
    private String tempat_l;
    private String tanggal_l;
    private String jenisKelamin;
    private String agama;
    private String anak_ke;
    private String statinKeluarga;
    private String alamat;
    private String telepon;
    private String dikelas;
    private String padatgl;
    private String semester;
    private String skol_asal;
//    private String almskol_asal;
//    private String ijazahtahun;
//    private String ijazahno;
//    private String skhuntahun;
//    private String skhunno;
    private String namaayah;
    private String namaibu;
    private String alamatortu;
    private String telepon_ortu;
    private String kerjaayah;
    private String kerjaibu;
    private Integer gaji_ortu;
    private String namawali;
    private String alamatWali;
    private String teleponWali;
    private String kerjaWali;
    private Integer gajiWali;
    private Set<KelasSiswa> kelasSiswacom= new HashSet<KelasSiswa>(0);
    private Set<EkskulSiswa> ekskulSiswacom = new HashSet<EkskulSiswa>(0);
    private Set<MapelSiswa> mapelSiswacom = new HashSet<MapelSiswa>(0);

    public Siswa() {
    }

    public Siswa(String nis, String nama, String tempat_l, String tanggal_l, String jenisKelamin, 
            String agama, String anak_ke, String statinKeluarga, String alamat, String telepon, 
            String dikelas, String padatgl, String semester, String skol_asal, String namaayah, 
            String namaibu, String alamatortu, String telepon_ortu, String kerjaayah, String kerjaibu, 
            Integer gaji_ortu, String namawali, String alamatWali, String teleponWali, String kerjaWali, Integer gajiWali) {
        this.nis = nis;
        this.nama = nama;
        this.tempat_l = tempat_l;
        this.tanggal_l = tanggal_l;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.anak_ke = anak_ke;
        this.statinKeluarga = statinKeluarga;
        this.alamat = alamat;
        this.telepon = telepon;
        this.dikelas = dikelas;
        this.padatgl = padatgl;
        this.semester = semester;
        this.skol_asal = skol_asal;
//        this.almskol_asal = almskol_asal;
//        this.ijazahtahun = ijazahtahun;
//        this.ijazahno = ijazahno;
//        this.skhuntahun = skhuntahun;
//        this.skhunno = skhunno;
        this.namaayah = namaayah;
        this.namaibu = namaibu;
        this.alamatortu = alamatortu;
        this.telepon_ortu = telepon_ortu;
        this.kerjaayah = kerjaayah;
        this.kerjaibu = kerjaibu;
        this.gaji_ortu = gaji_ortu;
        this.namawali = namawali;
        this.alamatWali = alamatWali;
        this.teleponWali = teleponWali;
        this.kerjaWali = kerjaWali;
        this.gajiWali = gajiWali;
    }
    
    public Siswa(String nis, String nama, String tempat_l, String tanggal_l, String jenisKelamin, String agama, 
            String anak_ke, String statinKeluarga, String alamat, String telepon, String dikelas, String padatgl, 
            String semester, String skol_asal, String namaayah, String namaibu, String alamatortu, 
            String telepon_ortu, String kerjaayah, String kerjaibu, Integer gaji_ortu, String namawali, 
            String alamatWali, String teleponWali, String kerjaWali, Integer gajiWali, 
            Set <KelasSiswa>kelasSiswacom,Set<EkskulSiswa>ekskulSiswacom, Set<MapelSiswa>mapelSiswacom) {
        this.nis = nis;
        this.nama = nama;
        this.tempat_l = tempat_l;
        this.tanggal_l = tanggal_l;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.anak_ke = anak_ke;
        this.statinKeluarga = statinKeluarga;
        this.alamat = alamat;
        this.telepon = telepon;
        this.dikelas = dikelas;
        this.padatgl = padatgl;
        this.semester = semester;
        this.skol_asal = skol_asal;
//        this.almskol_asal = almskol_asal;
//        this.ijazahtahun = ijazahtahun;
//        this.ijazahno = ijazahno;
//        this.skhuntahun = skhuntahun;
//        this.skhunno = skhunno;
        this.namaayah = namaayah;
        this.namaibu = namaibu;
        this.alamatortu = alamatortu;
        this.telepon_ortu = telepon_ortu;
        this.kerjaayah = kerjaayah;
        this.kerjaibu = kerjaibu;
        this.gaji_ortu = gaji_ortu;
        this.namawali = namawali;
        this.alamatWali = alamatWali;
        this.teleponWali = teleponWali;
        this.kerjaWali = kerjaWali;
        this.gajiWali = gajiWali;
        this.kelasSiswacom = kelasSiswacom;
        this.ekskulSiswacom = ekskulSiswacom;
        this.mapelSiswacom = mapelSiswacom;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "SISWA_ID", unique = true, nullable = false)
    public Integer getSiswaId() {
        return siswaId;
    }

    public void setSiswaId(Integer siswaId) {
        this.siswaId = siswaId;
    }

    @Column(name = "NIS", unique = true, nullable = false, length = 20)
    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    @Column(name = "NAMA", unique = true, nullable = false, length = 100)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Column(name = "TEMPAT_LAHIR", nullable = false, length = 50)
    public String getTempat_l() {
        return tempat_l;
    }

    public void setTempat_l(String tempat_l) {
        this.tempat_l = tempat_l;
    }

    @Column(name = "TANGGAL_LAHIR", nullable = false, length = 20)
    public String getTanggal_l() {
        return tanggal_l;
    }

    public void setTanggal_l(String tanggal_l) {
        this.tanggal_l = tanggal_l;
    }

    @Column(name = "JENIS_KELAMIN", nullable = false, length = 20)
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }


    @Column(name = "AGAMA", nullable = false, length = 20)
    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    @Column(name = "ANAK_KE", nullable = false, length = 20)
    public String getAnak_ke() {
        return anak_ke;
    }

    public void setAnak_ke(String anak_ke) {
        this.anak_ke = anak_ke;
    }

    @Column(name = "STATUS_KELUARGA", nullable = false, length = 30)
    public String getStatinKeluarga() {
        return statinKeluarga;
    }

    public void setStatinKeluarga(String statinKeluarga) {
        this.statinKeluarga = statinKeluarga;
    }

    @Column(name = "ALAMAT", nullable = false, length = 200)
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Column(name = "TELEPON", nullable = false, length = 20)
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Column(name = "DIKELAS", nullable = false, length = 10)
    public String getDikelas() {
        return dikelas;
    }

    public void setDikelas(String dikelas) {
        this.dikelas = dikelas;
    }

    @Column(name = "PADA_TANGGAL", nullable = false, length = 20)
    public String getPadatgl() {
        return padatgl;
    }

    public void setPadatgl(String padatgl) {
        this.padatgl = padatgl;
    }

    @Column(name = "SEMESTER", nullable = false, length = 20)
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Column(name = "SEKOLAH_ASAL", nullable = false, length = 120)
    public String getSkol_asal() {
        return skol_asal;
    }

    public void setSkol_asal(String skol_asal) {
        this.skol_asal = skol_asal;
    }

//    @Column(name = "ALMSEKOLAH_ASAL", nullable = false, length = 200)
//    public String getAlmskol_asal() {
//        return almskol_asal;
//    }
//
//    public void setAlmskol_asal(String almskol_asal) {
//        this.almskol_asal = almskol_asal;
//    }
//
//    @Column(name = "IJAZAH_TAHUN", nullable = false, length = 10)
//    public String getIjazahtahun() {
//        return ijazahtahun;
//    }
//
//    public void setIjazahtahun(String ijazahtahun) {
//        this.ijazahtahun = ijazahtahun;
//    }
//
//    @Column(name = "IJAZAH_NO", nullable = false, length = 30)
//    public String getIjazahno() {
//        return ijazahno;
//    }
//
//    public void setIjazahno(String ijazahno) {
//        this.ijazahno = ijazahno;
//    }
//
//    @Column(name = "SKHUN_TAHUN", nullable = false, length = 10)
//    public String getSkhuntahun() {
//        return skhuntahun;
//    }
//
//    public void setSkhuntahun(String skhuntahun) {
//        this.skhuntahun = skhuntahun;
//    }
//
//    @Column(name = "SKHUN_NO", nullable = false, length = 30)
//    public String getSkhunno() {
//        return skhunno;
//    }
//
//    public void setSkhunno(String skhunno) {
//        this.skhunno = skhunno;
//    }

    @Column(name = "NAMA_AYAH", nullable = false, length = 100)
    public String getNamaayah() {
        return namaayah;
    }

    public void setNamaayah(String namaayah) {
        this.namaayah = namaayah;
    }

    @Column(name = "NAMA_IBU", nullable = false, length = 120)
    public String getNamaibu() {
        return namaibu;
    }

    public void setNamaibu(String namaibu) {
        this.namaibu = namaibu;
    }

    @Column(name = "ALAMAT_ORTU", nullable = false, length = 200)
    public String getAlamatortu() {
        return alamatortu;
    }

    public void setAlamatortu(String alamatortu) {
        this.alamatortu = alamatortu;
    }

    @Column(name = "TELEPON_ORTU", nullable = false, length = 20)
    public String getTelepon_ortu() {
        return telepon_ortu;
    }

    public void setTelepon_ortu(String telepon_ortu) {
        this.telepon_ortu = telepon_ortu;
    }

    @Column(name = "KERJA_AYAH", nullable = false, length = 120)
    public String getKerjaayah() {
        return kerjaayah;
    }

    public void setKerjaayah(String kerjaayah) {
        this.kerjaayah = kerjaayah;
    }

    @Column(name = "KERJA_IBU", nullable = false, length = 120)
    public String getKerjaibu() {
        return kerjaibu;
    }

    public void setKerjaibu(String kerjaibu) {
        this.kerjaibu = kerjaibu;
    }

    @Column(name = "GAJI_ORTU", nullable = false)
    public Integer getGaji_ortu() {
        return gaji_ortu;
    }

    public void setGaji_ortu(Integer gaji_ortu) {
        this.gaji_ortu = gaji_ortu;
    }

    @Column(name = "NAMA_WALI", nullable = false, length = 100)
    public String getNamawali() {
        return namawali;
    }

    public void setNamawali(String namawali) {
        this.namawali = namawali;
    }

    @Column(name = "ALAMAT_WALI", nullable = false, length = 200)
    public String getAlamatWali() {
        return alamatWali;
    }

    public void setAlamatWali(String alamatWali) {
        this.alamatWali = alamatWali;
    }

    @Column(name = "TELEPON_WALI", nullable = false, length = 20)
    public String getTeleponWali() {
        return teleponWali;
    }

    public void setTeleponWali(String teleponWali) {
        this.teleponWali = teleponWali;
    }

    @Column(name = "KERJA_WALI", nullable = false, length = 100)
    public String getKerjaWali() {
        return kerjaWali;
    }

    public void setKerjaWali(String kerjaWali) {
        this.kerjaWali = kerjaWali;
    }

    @Column(name = "GAJI_WALI", nullable = false)
    public Integer getGajiWali() {
        return gajiWali;
    }

    public void setGajiWali(Integer gajiWali) {
        this.gajiWali = gajiWali;
    }
    
    

    
//=============================================================================//
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.siswa", cascade = CascadeType.ALL)
    public Set<KelasSiswa> getKelasSiswacom() {
        return kelasSiswacom;
    }

    public void setKelasSiswacom(Set<KelasSiswa> kelasSiswacom) {
        this.kelasSiswacom = kelasSiswacom;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.siswa", cascade = CascadeType.ALL)
    public Set<EkskulSiswa> getEkskulSiswacom() {
        return ekskulSiswacom;
    }

    public void setEkskulSiswacom(Set<EkskulSiswa> ekskulSiswacom) {
        this.ekskulSiswacom = ekskulSiswacom;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.siswa", cascade = CascadeType.ALL)
    public Set<MapelSiswa> getMapelSiswacom() {
        return mapelSiswacom;
    }

    public void setMapelSiswacom(Set<MapelSiswa> mapelSiswacom) {
        this.mapelSiswacom = mapelSiswacom;
    }
    
}
