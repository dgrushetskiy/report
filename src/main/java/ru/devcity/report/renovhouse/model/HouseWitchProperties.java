package ru.devcity.report.renovhouse.model;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Класс, аналогичный классу {@link House} за тем исключением,
 * что поля из себя представляют JavaFX Property. Это может пригодиться.
 *
 * JPA с ним работает аналогично классу {@link House}.
 */
public class HouseWitchProperties {

    private LongProperty id = new SimpleLongProperty();
    @Column
    private LongProperty unom = new SimpleLongProperty();
    @Column
    private StringProperty ao = new SimpleStringProperty();
    @Column
    private StringProperty mr = new SimpleStringProperty();
    @Column
    private StringProperty adress = new SimpleStringProperty();
    @Column
    private StringProperty kadNom = new SimpleStringProperty();

    public HouseWitchProperties() {
    }

    public HouseWitchProperties(LongProperty id, LongProperty unom, StringProperty ao, StringProperty mr, StringProperty adress, StringProperty kadNom) {
        this.id = id;
        this.unom = unom;
        this.ao = ao;
        this.mr = mr;
        this.adress = adress;
        this.kadNom = kadNom;
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

    public String getAo() {
        return ao.get();
    }

    public StringProperty aoProperty() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao.set(ao);
    }

    public String getMr() {
        return mr.get();
    }

    public StringProperty mrProperty() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr.set(mr);
    }

    public String getAdress() {
        return adress.get();
    }

    public StringProperty adressProperty() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
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
}
