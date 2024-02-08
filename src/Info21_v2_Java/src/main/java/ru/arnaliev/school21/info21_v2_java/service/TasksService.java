package ru.arnaliev.school21.info21_v2_java.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arnaliev.school21.info21_v2_java.model.Peer;
import ru.arnaliev.school21.info21_v2_java.model.Tasks;
import ru.arnaliev.school21.info21_v2_java.repositories.PeerRepository;
import ru.arnaliev.school21.info21_v2_java.repositories.TasksRepository;

import java.util.List;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@Service
@RequiredArgsConstructor
@Slf4j
public class TasksService {
    TasksRepository repository;

    @Autowired
    public TasksService(TasksRepository repository) {
        this.repository = repository;
    }

    public List<Tasks> findAll() {
        return repository.findAll();
    }

    public void save(Tasks task) {
        log.info("Saving new {}", task);
        repository.save(task);
    }

    public void delete(String nickname) {
        repository.deleteById(nickname);
    }

    public Tasks findByNickname(String nickname) {
        return repository.findById(nickname).orElse(null);
    }
}
