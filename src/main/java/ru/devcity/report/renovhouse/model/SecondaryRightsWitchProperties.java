package ru.devcity.report.renovhouse.model;

import javafx.beans.property.*;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Класс, аналогичный классу {@link SecondaryRights} за тем исключением,
 * что поля из себя представляют JavaFX Property. Это может пригодиться.
 *
 * JPA с ним работает аналогично классу {@link SecondaryRights}.
 */
public class SecondaryRightsWitchProperties {

    private LongProperty id = new SimpleLongProperty();
    @Column
    private StringProperty kadNom = new SimpleStringProperty();
    @Column
    private StringProperty kadNomPrava = new SimpleStringProperty();
    @Column
    ObjectProperty<BigDecimal> sqrOForm = new SimpleObjectProperty<BigDecimal>(this,"sqrOForm");
    @Column
    private StringProperty vidPrava = new SimpleStringProperty();
    @Column
    private StringProperty vidPravaRed = new SimpleStringProperty();
    @Column
    private StringProperty nameSubject = new SimpleStringProperty();
    @Column
    private StringProperty numDogovor = new SimpleStringProperty();
    @Column
    private ObjectProperty<Date> dateDogovor = new SimpleObjectProperty<>(this, "dataEgrp");;
    @Column(name = "end_date_dog")
    private Date dateEndDogovor;
    @Column(name = "num_egrp", length = 100)
    private String numEGRP;
    @Column(name = "date_egrp")
    private Date dateEgrp;
    @Column(name = "note", length = 512)
    private String note;
}
