package ru.devcity.report.renovhouse.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "veterans")
//таблица с данными по ветеранам
public class Veterans extends Build{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "unom")
    private Long unom;
    @Column(name = "adress_full")
    private String adressFull;
    @Column(name = "pl_pom")
    private BigDecimal plPom;
    @Column(name = "pravoobl")
    private String pravoObl;
    @Column(name = "document", length = 1024)
    private String document;

    public Veterans() {
    }


    public Veterans(Long unom, String adressFull, BigDecimal plPom, String pravoObl, String document) {
        this.unom = unom;
        this.adressFull = adressFull;
        this.plPom = plPom;
        this.pravoObl = pravoObl;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUnom() {
        return unom;
    }

    public void setUnom(Long unom) {
        this.unom = unom;
    }

    public String getAdressFull() {
        return adressFull;
    }

    public void setAdressFull(String adressFull) {
        this.adressFull = adressFull;
    }

    public BigDecimal getPlPom() {
        return plPom;
    }

    public void setPlPom(BigDecimal plPom) {
        this.plPom = plPom;
    }

    public String getPravoObl() {
        return pravoObl;
    }

    public void setPravoObl(String pravoObl) {
        this.pravoObl = pravoObl;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
