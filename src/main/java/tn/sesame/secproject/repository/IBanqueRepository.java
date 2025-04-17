package tn.sesame.secproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.sesame.secproject.entities.Banque;

import java.util.List;

public interface IBanqueRepository extends JpaRepository<Banque, Integer> {
    List<Banque> findByNomAndSiege(String nom, String siege);
}
