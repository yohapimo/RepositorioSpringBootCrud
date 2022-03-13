package com.sofka.controller;

import com.sofka.domain.ContactControl;
import com.sofka.service.ContactControlService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase controlador.
 *
 * Creamos los métodos GET, POST, PUT, DELETE y anotaciones especiales para el
 * funcionamiento de la aplicación.
 *
 * @version 01.01.01 2022-03-12
 *
 * @author Yon Hawer Piñeros - yon.pineros@gmail.com
 *
 * @since Clase presente desde la versión 01
 */
/**
 * @RestController anotación permite a SpringBoot reconocer el servicio, y
 * evitar datos redundanes.
 *
 * @CrossOrigin Se usa para la seguridad de la información y poder habiliar la
 * página para la información.
 */
@Slf4j
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ContactControlController {

    /**
     * @Autowired Anotación para inyectar automaticamente dependencias.
     */
    @Autowired
    private ContactControlService contactControlService;

    /**
     * Las anotaciones con @Mapping es donde establecemos nuestra ruta, Pueden
     * ser listar, crear, actualizar, borrar, o pathc.
     *
     * @return
     */
    @GetMapping(path = "/contacts")
    public List<ContactControl> list() {
        return contactControlService.list();

    }

    @PostMapping(path = "/contact")
    public ResponseEntity<ContactControl> create(ContactControl contact_control) {

        log.info("Contacto a crear: {}", contact_control);
        contactControlService.save(contact_control);
        return new ResponseEntity<ContactControl>(contact_control, HttpStatus.CREATED);

    }

    @DeleteMapping(path = "/contact/{id}")
    public ResponseEntity<ContactControl> delete(ContactControl contact_control) {
        log.info("Contacto a borrar: {}", contact_control);
        contactControlService.delete(contact_control);
        return new ResponseEntity<ContactControl>(contact_control, HttpStatus.OK);

    }

    @PutMapping(path = "/contact/{id}")
    public ResponseEntity<ContactControl> update(ContactControl contact_control, @PathVariable("id") Long id) {
        log.info("Contacto a modificar: {}", contact_control);
        contactControlService.update(id, contact_control);
        return new ResponseEntity<>(contact_control, HttpStatus.OK);

    }

}
