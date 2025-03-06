package tn.sesame.secproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.Agence;

@Repository
public interface IAgenceRepository extends CrudRepository<Agence, Integer> {
}