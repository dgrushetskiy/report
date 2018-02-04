package ru.report.renhouse.service;

import javafx.collections.ObservableList;
import org.springframework.data.domain.Page;
import ru.report.renhouse.model.House;

public interface HouseService {
    //CRUD
    void add(House house);

    void update(House house);

    void delete(House house);

    ObservableList<House> findAll();

    ObservableList<House> findMr(String mr);

    ObservableList<House> findAdress(String adress);

    Page findAll(int from, int count);

    Page findAll(int from, int count, String... text);

    Page findAllMr(int from, int count);

    Page findAllMr(int from, int count, String... mr);

    Page findAllAdress(int from, int count);

    Page findAllAdress(int from, int count, String... adress);
}
