package ru.devcity.report.renovhouse.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "house")
//Дом
public class House implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "unom")
    private BigDecimal unom;
    @Column(name = "ao",length = 10)
    private String ao;
    @Column(name = "mr", length = 20)
    private String mr;
    @Column(name = "adress")
    private String adress;
    @Column(name = "kad_nom")
    private String kadNom;

    public House() {
    }

    public House(BigDecimal unom, String mr, String adress) {
        this.unom = unom;
        this.mr = mr;
        this.adress = adress;
    }

        public House(BigDecimal unom, String ao, String mr, String adress, String kadNom) {
        this.unom = unom;
        this.ao = ao;
        this.mr = mr;
        this.adress = adress;
        this.kadNom = kadNom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getUnom() {
        return unom;
    }

    public void setUnom(BigDecimal unom) {
        this.unom = unom;
    }

    public String getAo() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao = ao;
    }

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getKadNom() {
        return kadNom;
    }

    public void setKadNom(String kadNom) {
        this.kadNom = kadNom;
    }
}
