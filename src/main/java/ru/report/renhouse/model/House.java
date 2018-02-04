package ru.report.renhouse.model;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "house")
@NoArgsConstructor
@AllArgsConstructor
public class House {

    private LongProperty id = new SimpleLongProperty();

    private LongProperty unom = new SimpleLongProperty();

    private StringProperty ao = new SimpleStringProperty();

    private StringProperty mr = new SimpleStringProperty();

    private StringProperty adress = new SimpleStringProperty();

    private StringProperty kadNom = new SimpleStringProperty();


    public House(LongProperty unom, StringProperty mr, StringProperty adress) {
        this.unom = unom;
        this.mr = mr;
        this.adress = adress;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    public long getId() {
        return id.get();
    }

    public LongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }
    @Column(name = "unom")
    public long getUnom() {
        return unom.get();
    }

    public LongProperty unomProperty() {
        return unom;
    }

    public void setUnom(long unom) {
        this.unom.set(unom);
    }
    @Column(name = "ao",length = 10)
    public String getAo() {
        return ao.get();
    }

    public StringProperty aoProperty() {
        return ao;
    }

    public void setAo(String ao) {
        this.ao.set(ao);
    }
    @Column(name = "mr", length = 20)
    public String getMr() {
        return mr.get();
    }

    public StringProperty mrProperty() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr.set(mr);
    }
    @Column(name = "adress")
    public String getAdress() {
        return adress.get();
    }

    public StringProperty adressProperty() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
    }
    @Column(name = "kad_nom")
    public String getKadNom() {
        return kadNom.get();
    }

    public StringProperty kadNomProperty() {
        return kadNom;
    }

    public void setKadNom(String kadNom) {
        this.kadNom.set(kadNom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(id, house.id) &&
                Objects.equals(unom, house.unom) &&
                Objects.equals(ao, house.ao) &&
                Objects.equals(mr, house.mr) &&
                Objects.equals(adress, house.adress) &&
                Objects.equals(kadNom, house.kadNom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, unom, ao, mr, adress, kadNom);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", unom=" + unom +
                ", ao=" + ao +
                ", mr=" + mr +
                ", adress=" + adress +
                ", kadNom=" + kadNom +
                '}';
    }
}
