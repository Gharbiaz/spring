package tn.sesame.secproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.Client;

@Repository
public interface IClientRepository extends CrudRepository<Client, Integer> {
}