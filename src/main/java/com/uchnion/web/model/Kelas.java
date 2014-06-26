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

/**
 *
 * @author Marojahan
 */
@Entity
@Table(name = "kelas")
public class Kelas implements Serializable{
    
    private Integer kelasId;
    private String kodekKelas;
    private String namaKelas;
    private String jurusan;
    private Set<KelasSiswa> kelasSiswacom = new HashSet<KelasSiswa>(0);

    public Kelas() {
    }

    public Kelas(String kodekKelas, String namaKelas) {
        this.kodekKelas = kodekKelas;
        this.namaKelas = namaKelas;
    }

    public Kelas(String kodekKelas, String namaKelas, Set <KelasSiswa>kelasSiswacom) {
        this.kodekKelas = kodekKelas;
        this.namaKelas = namaKelas;
        this.kelasSiswacom = kelasSiswacom;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "KELAS_ID", unique = true, nullable = false)
    public Integer getKelasId() {
        return kelasId;
    }

    public void setKelasId(Integer kelasId) {
        this.kelasId = kelasId;
    }

    @Column(name = "KODE_KELAS", nullable = false, length = 20)
    public String getKodekKelas() {
        return kodekKelas;
    }

    public void setKodekKelas(String kodekKelas) {
        this.kodekKelas = kodekKelas;
    }

    @Column(name = "NAMA_KELAS", nullable = false, length = 10)
    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    @Column(name = "JURUSAN", nullable = false, length = 10)
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.kelas", cascade = CascadeType.ALL)
    public Set<KelasSiswa> getKelasSiswacom() {
        return kelasSiswacom;
    }

    public void setKelasSiswacom(Set<KelasSiswa> kelasSiswacom) {
        this.kelasSiswacom = kelasSiswacom;
    }
    
    
}
