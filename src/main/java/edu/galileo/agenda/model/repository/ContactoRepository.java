
package edu.galileo.agenda.model.repository;

import edu.galileo.agenda.model.Contacto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
    List<Contacto> findAll();
}
