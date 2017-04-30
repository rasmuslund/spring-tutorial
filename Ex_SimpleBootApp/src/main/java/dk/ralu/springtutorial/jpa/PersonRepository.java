package dk.ralu.springtutorial.jpa;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(String lastName);

}
