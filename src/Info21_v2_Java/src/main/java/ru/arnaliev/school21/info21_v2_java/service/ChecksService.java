package ru.arnaliev.school21.info21_v2_java.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arnaliev.school21.info21_v2_java.model.Checks;
import ru.arnaliev.school21.info21_v2_java.repositories.ChecksRepository;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class ChecksService {
    private final ChecksRepository repository;
    @Autowired
    public ChecksService(ChecksRepository repository) {
        this.repository = repository;
    }

    public List<Checks> findAll() {
        return repository.findAll();
    }

    public void save(Checks checks) {
        repository.save(checks);
    }

    public void delete(Long id) {
        repository.delete(Objects.requireNonNull(repository.findById(id).orElse(null)));
    }
}
