package tn.sesame.secproject.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.sesame.secproject.entities.Admin;
@Repository
public interface IAdminRepository extends CrudRepository<Admin, Integer> {
}