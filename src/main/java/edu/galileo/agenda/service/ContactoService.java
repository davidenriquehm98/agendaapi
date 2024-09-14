

package edu.galileo.agenda.service;

import edu.galileo.agenda.model.Contacto;
import edu.galileo.agenda.model.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;
    public Contacto add(Contacto contacto) {
        return this.contactoRepository.save(contacto);
    }

    public List<Contacto> list() {
        return this.contactoRepository.findAll();
    }
}
