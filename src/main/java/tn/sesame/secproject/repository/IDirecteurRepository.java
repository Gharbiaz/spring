package tn.sesame.secproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.Directeur;

@Repository
public interface IDirecteurRepository extends CrudRepository<Directeur, Integer> {
}