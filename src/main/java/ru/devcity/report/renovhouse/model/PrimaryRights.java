package ru.devcity.report.renovhouse.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "primary_rights")
//помещения перв
public class PrimaryRights implements Serializable{
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

    public PrimaryRights() {
    }

    public PrimaryRights(Long unom, String kadNom, String kadNomPrava, String explikazia, BigDecimal sqrOForm, String vidPrava, String nameSubject) {
        this.unom = unom;
        this.kadNom = kadNom;
        this.kadNomPrava = kadNomPrava;
        this.explikazia = explikazia;
        this.sqrOForm = sqrOForm;
        this.vidPrava = vidPrava;
        this.nameSubject = nameSubject;
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
}
