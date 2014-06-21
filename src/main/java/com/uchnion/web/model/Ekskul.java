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
@Table(name = "ekskul")
public class Ekskul implements Serializable{
    
    private Integer ekskulId;
    private String kodeEkskul;
    private String namaEkskul;
    private Set<EkskulSiswa> ekskulSiswacom = new HashSet<EkskulSiswa>(0);

    public Ekskul() {
    }

    public Ekskul(String kodeEkskul, String namaEkskul) {
        this.kodeEkskul = kodeEkskul;
        this.namaEkskul = namaEkskul;
    }

    public Ekskul(String kodeEkskul, String namaEkskul, Set<EkskulSiswa> ekskulSiswacom) {
        this.kodeEkskul = kodeEkskul;
        this.namaEkskul = namaEkskul;
        this.ekskulSiswacom = ekskulSiswacom;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "EKSKUL_ID", unique = true, nullable = false)
    public Integer getEkskulId() {
        return ekskulId;
    }

    public void setEkskulId(Integer ekskulId) {
        this.ekskulId = ekskulId;
    }

    @Column(name = "KEDE_EKSKUL", nullable = false, length = 20)
    public String getKodeEkskul() {
        return kodeEkskul;
    }

    public void setKodeEkskul(String kodeEkskul) {
        this.kodeEkskul = kodeEkskul;
    }

    @Column(name = "NAMA_EKSKUL", nullable = false, length = 40)
    public String getNamaEkskul() {
        return namaEkskul;
    }

    public void setNamaEkskul(String namaEkskul) {
        this.namaEkskul = namaEkskul;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.ekskul", cascade = CascadeType.ALL)
    public Set<EkskulSiswa> getEkskulSiswacom() {
        return ekskulSiswacom;
    }

    public void setEkskulSiswacom(Set<EkskulSiswa> ekskulSiswacom) {
        this.ekskulSiswacom = ekskulSiswacom;
    }
    
}
