package ru.devcity.report.renovhouse.model;

import javafx.beans.property.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Класс, аналогичный классу {@link ShareHolder} за тем исключением,
 * что поля из себя представляют JavaFX Property. Это может пригодиться.
 *
 * JPA с ним работает аналогично классу {@link ShareHolder}.
 */
public class ShareHolderWitchProperties {

    private LongProperty id = new SimpleLongProperty();
    @Column
    private LongProperty unom = new SimpleLongProperty();
    @Column
    private StringProperty kadNom = new SimpleStringProperty();
    @Column
    private StringProperty kadNomPrava = new SimpleStringProperty();
    @Column
    private StringProperty explikazia = new SimpleStringProperty();
    @Column
    private ObjectProperty<BigDecimal> sqrOForm = new SimpleObjectProperty<BigDecimal>(this,"sqrOForm");;
    @Column
    private StringProperty vidPrava = new SimpleStringProperty();
    @Column
    private StringProperty nameSubject = new SimpleStringProperty();
    @Column
    private StringProperty numEGRP = new SimpleStringProperty();
    @Column
    private ObjectProperty<Date> dataEgrp = new SimpleObjectProperty<>(this, "dataEgrp");

    public ShareHolderWitchProperties() {
    }

    public ShareHolderWitchProperties(LongProperty id, LongProperty unom, StringProperty kadNom, StringProperty kadNomPrava, StringProperty explikazia, ObjectProperty<BigDecimal> sqrOForm, StringProperty vidPrava, StringProperty nameSubject, StringProperty numEGRP, ObjectProperty<Date> dataEgrp) {
        this.id = id;
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

    @Id
    @GeneratedValue
    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public long getUnom() {
        return unom.get();
    }

    public LongProperty unomProperty() {
        return unom;
    }

    public void setUnom(long unom) {
        this.unom.set(unom);
    }

    public String getKadNom() {
        return kadNom.get();
    }

    public StringProperty kadNomProperty() {
        return kadNom;
    }

    public void setKadNom(String kadNom) {
        this.kadNom.set(kadNom);
    }

    public String getKadNomPrava() {
        return kadNomPrava.get();
    }

    public StringProperty kadNomPravaProperty() {
        return kadNomPrava;
    }

    public void setKadNomPrava(String kadNomPrava) {
        this.kadNomPrava.set(kadNomPrava);
    }

    public String getExplikazia() {
        return explikazia.get();
    }

    public StringProperty explikaziaProperty() {
        return explikazia;
    }

    public void setExplikazia(String explikazia) {
        this.explikazia.set(explikazia);
    }

    public BigDecimal getSqrOForm() {
        return sqrOForm.get();
    }

    public ObjectProperty<BigDecimal> sqrOFormProperty() {
        return sqrOForm;
    }

    public void setSqrOForm(BigDecimal sqrOForm) {
        this.sqrOForm.set(sqrOForm);
    }

    public String getVidPrava() {
        return vidPrava.get();
    }

    public StringProperty vidPravaProperty() {
        return vidPrava;
    }

    public void setVidPrava(String vidPrava) {
        this.vidPrava.set(vidPrava);
    }

    public String getNameSubject() {
        return nameSubject.get();
    }

    public StringProperty nameSubjectProperty() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject.set(nameSubject);
    }

    public String getNumEGRP() {
        return numEGRP.get();
    }

    public StringProperty numEGRPProperty() {
        return numEGRP;
    }

    public void setNumEGRP(String numEGRP) {
        this.numEGRP.set(numEGRP);
    }

    public Date getDataEgrp() {
        return dataEgrp.get();
    }

    public ObjectProperty<Date> dataEgrpProperty() {
        return dataEgrp;
    }

    public void setDataEgrp(Date dataEgrp) {
        this.dataEgrp.set(dataEgrp);
    }
}
