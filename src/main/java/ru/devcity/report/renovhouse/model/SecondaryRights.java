//package ru.devcity.report.renovhouse.model;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.Date;
//
//@Entity
//@Table(name = "secondary_rights")
////Вторичные права
//public class SecondaryRights implements Serializable{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
//    @Column(name = "kad_nom", length = 100)
//    private String kadNom;
//    @Column(name = "kad_num_prava", length = 100)
//    private String kadNomPrava;
//    @Column(name = "s_oform")
//    private BigDecimal sqrOForm;
//    @Column(name = "vid_prava", length = 100)
//    private String vidPrava;
//    @Column(name = "vid_prava", length = 100)
//    private String vidPravaRed;
//    @Column(name = "name_subject", length = 100)
//    private String nameSubject;
//    @Column(name = "num_dog", length = 100)
//    private String numDogovor;
//    @Column(name = "date_dog")
//    private Date dateDogovor;
//    @Column(name = "end_date_dog")
//    private Date dateEndDogovor;
//    @Column(name = "num_egrp", length = 100)
//    private String numEGRP;
//    @Column(name = "date_egrp")
//    private Date dateEgrp;
//    @Column(name = "note", length = 512)
//    private String note;
//
//    public SecondaryRights() {
//    }
//
//    public SecondaryRights(String kadNom, String kadNomPrava, BigDecimal sqrOForm, String vidPrava, String vidPravaRed, String nameSubject, String numDogovor, Date dateDogovor, Date dateEndDogovor, String numEGRP, Date dateEgrp, String note) {
//        this.kadNom = kadNom;
//        this.kadNomPrava = kadNomPrava;
//        this.sqrOForm = sqrOForm;
//        this.vidPrava = vidPrava;
//        this.vidPravaRed = vidPravaRed;
//        this.nameSubject = nameSubject;
//        this.numDogovor = numDogovor;
//        this.dateDogovor = dateDogovor;
//        this.dateEndDogovor = dateEndDogovor;
//        this.numEGRP = numEGRP;
//        this.dateEgrp = dateEgrp;
//        this.note = note;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getKadNom() {
//        return kadNom;
//    }
//
//    public void setKadNom(String kadNom) {
//        this.kadNom = kadNom;
//    }
//
//    public String getKadNomPrava() {
//        return kadNomPrava;
//    }
//
//    public void setKadNomPrava(String kadNomPrava) {
//        this.kadNomPrava = kadNomPrava;
//    }
//
//    public BigDecimal getSqrOForm() {
//        return sqrOForm;
//    }
//
//    public void setSqrOForm(BigDecimal sqrOForm) {
//        this.sqrOForm = sqrOForm;
//    }
//
//    public String getVidPrava() {
//        return vidPrava;
//    }
//
//    public void setVidPrava(String vidPrava) {
//        this.vidPrava = vidPrava;
//    }
//
//    public String getVidPravaRed() {
//        return vidPravaRed;
//    }
//
//    public void setVidPravaRed(String vidPravaRed) {
//        this.vidPravaRed = vidPravaRed;
//    }
//
//    public String getNameSubject() {
//        return nameSubject;
//    }
//
//    public void setNameSubject(String nameSubject) {
//        this.nameSubject = nameSubject;
//    }
//
//    public String getNumDogovor() {
//        return numDogovor;
//    }
//
//    public void setNumDogovor(String numDogovor) {
//        this.numDogovor = numDogovor;
//    }
//
//    public Date getDateDogovor() {
//        return dateDogovor;
//    }
//
//    public void setDateDogovor(Date dateDogovor) {
//        this.dateDogovor = dateDogovor;
//    }
//
//    public Date getDateEndDogovor() {
//        return dateEndDogovor;
//    }
//
//    public void setDateEndDogovor(Date dateEndDogovor) {
//        this.dateEndDogovor = dateEndDogovor;
//    }
//
//    public String getNumEGRP() {
//        return numEGRP;
//    }
//
//    public void setNumEGRP(String numEGRP) {
//        this.numEGRP = numEGRP;
//    }
//
//    public Date getDateEgrp() {
//        return dateEgrp;
//    }
//
//    public void setDateEgrp(Date dateEgrp) {
//        this.dateEgrp = dateEgrp;
//    }
//
//    public String getNote() {
//        return note;
//    }
//
//    public void setNote(String note) {
//        this.note = note;
//    }
//}
