package ru.arnaliev.school21.info21_v2_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arnaliev.school21.info21_v2_java.model.Checks;

import java.util.List;
@Repository
public interface ChecksRepository extends JpaRepository<Checks, Long> {
    List<Checks> findAll();
}
