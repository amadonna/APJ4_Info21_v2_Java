package ru.arnaliev.school21.info21_v2_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.arnaliev.school21.info21_v2_java.model.Peer;

import java.util.List;
@Repository
public interface PeerRepository extends JpaRepository<Peer, String> {
    List<Peer> findAll();
}
