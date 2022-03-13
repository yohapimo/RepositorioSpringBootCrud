package com.sofka.service;

import com.sofka.domain.ContactControl;
import java.util.List;

/**
 * Interfaz para validar los servicios y control de peticiones.
 *
 * @author Yon Hawer Piñeros
 */
public interface IContactControlService {

    public List<ContactControl> list();

    public ContactControl save(ContactControl contact_control);

    public ContactControl update(Long id, ContactControl contact_control);

    public void delete(ContactControl contact_control);

    public ContactControl findUser(ContactControl contact_control);

}
