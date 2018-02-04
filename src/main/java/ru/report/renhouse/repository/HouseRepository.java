package ru.report.renhouse.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.report.renhouse.model.House;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

    List<House> findByMrContainingIgnoreCase(String mr);

    Page<House> findByMrContainingIgnoreCase(String mr, Pageable pageable);

    List<House> findByAdressContainingIgnoreCase(String adress);

    Page<House> findByAdressContainingIgnoreCase(String adress, Pageable pageable);

}
