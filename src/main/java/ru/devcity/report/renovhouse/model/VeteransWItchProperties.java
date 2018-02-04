package ru.devcity.report.renovhouse.model;

import javafx.beans.property.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Класс, аналогичный классу {@link Veterans} за тем исключением,
 * что поля из себя представляют JavaFX Property. Это может пригодиться.
 *
 * JPA с ним работает аналогично классу {@link Veterans}.
 */
public class VeteransWItchProperties {

    private LongProperty id = new SimpleLongProperty();
    @Column
    private LongProperty unom = new SimpleLongProperty();
    @Column
    private StringProperty adressFull = new SimpleStringProperty();
    @Column
    private ObjectProperty<BigDecimal> plPom = new SimpleObjectProperty<BigDecimal>(this,"plPom");
    @Column
    private StringProperty pravoObl = new SimpleStringProperty();
    @Column
    private StringProperty documents = new SimpleStringProperty();

    public VeteransWItchProperties() {
    }

    public VeteransWItchProperties(LongProperty id, LongProperty unom, StringProperty adressFull, ObjectProperty<BigDecimal> plPom, StringProperty pravoObl, StringProperty documents) {
        this.id = id;
        this.unom = unom;
        this.adressFull = adressFull;
        this.plPom = plPom;
        this.pravoObl = pravoObl;
        this.documents = documents;
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

    public String getAdressFull() {
        return adressFull.get();
    }

    public StringProperty adressFullProperty() {
        return adressFull;
    }

    public void setAdressFull(String adressFull) {
        this.adressFull.set(adressFull);
    }

    public BigDecimal getPlPom() {
        return plPom.get();
    }

    public ObjectProperty<BigDecimal> plPomProperty() {
        return plPom;
    }

    public void setPlPom(BigDecimal plPom) {
        this.plPom.set(plPom);
    }

    public String getPravoObl() {
        return pravoObl.get();
    }

    public StringProperty pravoOblProperty() {
        return pravoObl;
    }

    public void setPravoObl(String pravoObl) {
        this.pravoObl.set(pravoObl);
    }

    public String getDocuments() {
        return documents.get();
    }

    public StringProperty documentsProperty() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents.set(documents);
    }
}
