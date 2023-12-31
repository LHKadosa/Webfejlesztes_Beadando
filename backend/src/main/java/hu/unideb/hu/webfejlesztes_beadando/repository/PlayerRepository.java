package hu.unideb.hu.webfejlesztes_beadando.repository;

import hu.unideb.hu.webfejlesztes_beadando.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
