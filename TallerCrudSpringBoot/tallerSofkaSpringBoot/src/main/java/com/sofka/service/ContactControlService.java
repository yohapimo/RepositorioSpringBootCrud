package com.sofka.service;

import com.sofka.dao.ContactControlDao;
import com.sofka.domain.ContactControl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * La capa de servicios consumimos los datos e implementamos las validaciones
 * necesarias.
 *
 * @author Yon Hawer Piñeros
 */
@Service
public class ContactControlService implements IContactControlService {

    @Autowired
    private ContactControlDao contactcontrolDao;

    @Override
    @Transactional(readOnly = true)
    public List<ContactControl> list() {
        List<ContactControl> contacts = null;
        try {
            contacts = (List<ContactControl>) contactcontrolDao.findAll();
        } catch (Exception exc) {
            throw exc;
        }
        return contacts;
    }

    @Override
    @Transactional
    public ContactControl save(ContactControl contact_control) {
        return contactcontrolDao.save(contact_control);
    }

    @Override
    @Transactional
    public ContactControl update(Long id, ContactControl contact_control) {
        contact_control.setId(id);
        return contactcontrolDao.save(contact_control);
    }

    @Override
    @Transactional
    public void delete(ContactControl contact_control) {
        contactcontrolDao.delete(contact_control);

    }

    @Override
    @Transactional(readOnly = true)
    public ContactControl findUser(ContactControl contact_control) {
        Optional<ContactControl> user = contactcontrolDao.findById(contact_control.getId());
        return contact_control;
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Optional<ContactControl> findUser(ContactControl contact_control) {
//        return contactcontrolDao.findById(contact_control.getId());
//    }
}
