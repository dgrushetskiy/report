package ru.report.renhouse.service.impl;

import com.google.common.collect.Lists;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.report.renhouse.model.House;
import ru.report.renhouse.repository.HouseRepository;
import ru.report.renhouse.service.HouseService;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseRepository houseRepository;
    @Override
    public void add(House house) {
        houseRepository.save(house);
    }

    @Override
    public void update(House house) {
        houseRepository.save(house);
    }

    @Override
    public void delete(House house) {
        houseRepository.delete(house);
    }

    @Override
    public ObservableList<House> findAll() {
        return FXCollections.observableArrayList(Lists.newArrayList(houseRepository.findAll()));
    }

    @Override
    public ObservableList<House> findMr(String mr) {
        return FXCollections.observableArrayList(Lists.newArrayList(houseRepository.findByMrContainingIgnoreCase(mr)));
    }

    @Override
    public ObservableList<House> findAdress(String adress) {
        return FXCollections.observableArrayList(Lists.newArrayList(houseRepository.findByAdressContainingIgnoreCase(adress)));
    }

    @Override
    public Page findAll(int from, int count) {
        return houseRepository.findAll(new PageRequest(from, count, Sort.Direction.ASC, "mr"));
    }

    @Override
    public Page findAll(int from, int count, String... text) {
        return houseRepository.findByMrContainingIgnoreCase(text[0], new PageRequest(from, count, Sort.Direction.ASC, "mr"));
    }

    @Override
    public Page findAllMr(int from, int count) {
        return houseRepository.findAll(new PageRequest(from, count, Sort.Direction.ASC, "mr"));
    }

    @Override
    public Page findAllMr(int from, int count, String... mr) {
        return houseRepository.findByMrContainingIgnoreCase(mr[0], new PageRequest(from, count, Sort.Direction.ASC, "mr"));
    }

    @Override
    public Page findAllAdress(int from, int count) {
        return houseRepository.findAll(new PageRequest(from, count, Sort.Direction.ASC,"adress"));
    }

    @Override
    public Page findAllAdress(int from, int count, String... adress) {
        return houseRepository.findByAdressContainingIgnoreCase(adress[0], new PageRequest(from, count, Sort.Direction.ASC,"adress"));
    }
}
