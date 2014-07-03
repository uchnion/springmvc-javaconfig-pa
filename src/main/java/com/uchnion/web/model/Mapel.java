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
@Table(name = "mapel")
public class Mapel implements Serializable{
    
    private Integer mapelId;
    private String kodemapel;
    private String namamapel;
    private int kkm;
    
    private String semester;
    private Set<MapelSiswa> mapelSiswacom = new HashSet<MapelSiswa>(0);

    public Mapel() {
    }

    public Mapel(String kodemapel, String namamapel, int kkm,String semester) {
        this.kodemapel = kodemapel;
        this.namamapel = namamapel;
        this.kkm = kkm;
        this.semester= semester;
        
    }

    public Mapel(String kodemapel, String namamapel, int kkm,String semester,Set<MapelSiswa>mapelSiswacom) {
        this.kodemapel = kodemapel;
        this.namamapel = namamapel;
        this.kkm = kkm;
        this.semester= semester;
        this.mapelSiswacom = mapelSiswacom;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "MAPEL_ID", unique = true, nullable = false)
    
    public Integer getMapelId() {
        return mapelId;
    }

    public void setMapelId(Integer mapelId) {
        this.mapelId = mapelId;
    }

    @Column(name = "KODE_MAPEL", nullable = false, length = 20)
    public String getKodemapel() {
        return kodemapel;
    }

    public void setKodemapel(String kodemapel) {
        this.kodemapel = kodemapel;
    }

    @Column(name = "NAMA_MAPEL",nullable = false, length = 40)
    public String getNamamapel() {
        return namamapel;
    }

    public void setNamamapel(String namamapel) {
        this.namamapel = namamapel;
    }

    @Column(name = "KKM",nullable = false)
    public int getKkm() {
        return kkm;
    }

    @Column(name = "SEMESTER",nullable = false, length = 10)
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    

    public void setKkm(int kkm) {
        this.kkm = kkm;
    }

    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.mapel", cascade = CascadeType.ALL)
    public Set<MapelSiswa> getMapelSiswacom() {
        return mapelSiswacom;
    }

    public void setMapelSiswacom(Set<MapelSiswa> mapelSiswacom) {
        this.mapelSiswacom = mapelSiswacom;
    }
    
}
