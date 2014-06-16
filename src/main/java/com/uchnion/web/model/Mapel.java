package com.uchnion.web.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "MAPEL")
public class Mapel implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "KODEMAPEL", nullable = false, length = 20)
    private Integer mapelid;
    
    
    @NotNull
    @Column(name = "KODEMAPEL", nullable = false, length = 20)
    private String kodemapel;

    @Column(nullable = false, length = 40)
    @NotNull
    private String namamapel;

    @Column(nullable = false)
    @NotNull
    private int kkm;

    // Getter and Setter methods
    
    public String getKodemapel() {
        return kodemapel;
    }

    public void setKodemapel(String kodemapel) {
        this.kodemapel = kodemapel;
    }

    public String getNamamapel() {
        return namamapel;
    }

    public void setNamamapel(String namamapel) {
        this.namamapel = namamapel;
    }

    public int getKkm() {
        return kkm;
    }

    public void setKkm(int kkm) {
        this.kkm = kkm;
    }

    public Integer getMapelid() {
        return mapelid;
    }

    public void setMapelid(Integer mapelid) {
        this.mapelid = mapelid;
    }

    
}
