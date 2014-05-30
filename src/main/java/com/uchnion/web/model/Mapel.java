package com.uchnion.web.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MAPEL")
public class Mapel implements Serializable {

    private static final long serialVersionID = 1L;

    @Id
    @Column(name = "KODEMAPEL", nullable = false, length = 20)
    private String kodemapel;

    @Column(nullable = false, length = 40)
    private String namamapel;

    @Column(nullable = false)
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

}
