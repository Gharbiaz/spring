package tn.sesame.secproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.Client;

import java.util.Date;
import java.util.List;

@Repository
public interface IClientRepository extends CrudRepository<Client, Integer> {
    //public List<Client> findByAgeGreaterThan (int age);
    //public List<Client> findByDateOfBirthBetween (Date from, Date to);
  //  public List<Client> findByDateOfBirthAfter(Date to);
}