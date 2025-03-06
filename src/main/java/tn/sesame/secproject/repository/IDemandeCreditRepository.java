package tn.sesame.secproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.DemandeCredit;

@Repository
public interface IDemandeCreditRepository extends CrudRepository<DemandeCredit , Integer> {
}