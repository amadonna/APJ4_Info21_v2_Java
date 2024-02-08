package ru.arnaliev.school21.info21_v2_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arnaliev.school21.info21_v2_java.model.Tasks;

import java.util.List;

public interface TasksRepository extends JpaRepository<Tasks, String> {
    List<Tasks> findAll();
}
