package ru.devcity.report.renovhouse.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.devcity.report.renovhouse.model.House;

import java.util.List;

@Transactional(propagation = Propagation.MANDATORY)
public interface HouseRepository extends CrudRepository<House, Long> {

    List<House> findAll();
}
