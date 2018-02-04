package ru.devcity.report.renovhouse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devcity.report.renovhouse.model.House;
import ru.devcity.report.renovhouse.repository.HouseRepository;
import ru.devcity.report.renovhouse.service.HouseService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    @Autowired
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }
}
