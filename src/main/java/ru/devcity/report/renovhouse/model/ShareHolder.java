package ru.devcity.report.renovhouse.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "share_holder")
//Долевая собственность
public class ShareHolder implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "unom")
    private Long unom;
    @Column(name = "kad_nom", length = 100)
    private String kadNom;
    @Column(name = "kad_num_prava", length = 100)
    private String kadNomPrava;
    @Column(name = "explikazia", length = 512)
    private String explikazia;
    @Column(name = "s_oform")
    private BigDecimal sqrOForm;
    @Column(name = "vid_prava", length = 100)
    private String vidPrava;
    @Column(name = "name_subject", length = 100)
    private String nameSubject;
    @Column(name = "num_egrp", length = 100)
    private String numEGRP;
    @Column(name = "date_egrp")
    private Date dataEgrp;

    public ShareHolder() {
    }

    public ShareHolder(Long unom, String kadNom, String kadNomPrava, String explikazia, BigDecimal sqrOForm, String vidPrava, String nameSubject, String numEGRP, Date dataEgrp) {
        this.unom = unom;
        this.kadNom = kadNom;
        this.kadNomPrava = kadNomPrava;
        this.explikazia = explikazia;
        this.sqrOForm = sqrOForm;
        this.vidPrava = vidPrava;
        this.nameSubject = nameSubject;
        this.numEGRP = numEGRP;
        this.dataEgrp = dataEgrp;
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

    public String getKadNom() {
        return kadNom;
    }

    public void setKadNom(String kadNom) {
        this.kadNom = kadNom;
    }

    public String getKadNomPrava() {
        return kadNomPrava;
    }

    public void setKadNomPrava(String kadNomPrava) {
        this.kadNomPrava = kadNomPrava;
    }

    public String getExplikazia() {
        return explikazia;
    }

    public void setExplikazia(String explikazia) {
        this.explikazia = explikazia;
    }

    public BigDecimal getSqrOForm() {
        return sqrOForm;
    }

    public void setSqrOForm(BigDecimal sqrOForm) {
        this.sqrOForm = sqrOForm;
    }

    public String getVidPrava() {
        return vidPrava;
    }

    public void setVidPrava(String vidPrava) {
        this.vidPrava = vidPrava;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getNumEGRP() {
        return numEGRP;
    }

    public void setNumEGRP(String numEGRP) {
        this.numEGRP = numEGRP;
    }

    public Date getDataEgrp() {
        return dataEgrp;
    }

    public void setDataEgrp(Date dataEgrp) {
        this.dataEgrp = dataEgrp;
    }
}
