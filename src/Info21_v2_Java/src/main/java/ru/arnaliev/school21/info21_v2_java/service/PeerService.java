package ru.arnaliev.school21.info21_v2_java.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arnaliev.school21.info21_v2_java.model.Peer;
import ru.arnaliev.school21.info21_v2_java.repositories.PeerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PeerService {
    PeerRepository repository;

    @Autowired
    public PeerService(PeerRepository repository) {
        this.repository = repository;
    }

    public List<Peer> findAll() {
        return repository.findAll();
    }

    public void save(Peer peer) {
        log.info("Saving new {}", peer);
        repository.save(peer);
    }

    public void delete(String nickname) {
        repository.deleteById(nickname);
    }

    public Peer findByNickname(String nickname) {
        return repository.findById(nickname).orElse(null);
    }
}
