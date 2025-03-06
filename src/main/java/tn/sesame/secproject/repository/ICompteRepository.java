package tn.sesame.secproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.Compte;

@Repository
public interface ICompteRepository extends CrudRepository<Compte, Integer> {
}