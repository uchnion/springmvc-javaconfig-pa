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
@Table(name = "AKUN")
public class Akun implements Serializable {

    public static final long serialVersionID = 1L;

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "AKUNID", nullable = false)
    private Integer akunid;

    @NotNull
    @Column(name = "USERAKUN", nullable = false, length = 20)
    private String userakun;

    @Column(name = "PASSAKUN", nullable = false, length = 20)
    @NotNull
    private String passakun;

//    getter and setter
    public Integer getAkunid() {
        return akunid;
    }

    public void setAkunid(Integer akunid) {
        this.akunid = akunid;
    }

    public String getUserakun() {
        return userakun;
    }

    public void setUserakun(String userakun) {
        this.userakun = userakun;
    }

    public String getPassakun() {
        return passakun;
    }

    public void setPassakun(String passakun) {
        this.passakun = passakun;
    }
    
}
