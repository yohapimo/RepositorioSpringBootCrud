package com.sofka.dao;

import com.sofka.domain.ContactControl;
import org.springframework.data.repository.CrudRepository;

/**
 * Dao interfaz de la aplicación para la comunicación entre la aplicación y los
 * datos.
 *
 * @author Yon Hawer Piñeros
 */
public interface ContactControlDao extends CrudRepository<ContactControl, Long> {

}
