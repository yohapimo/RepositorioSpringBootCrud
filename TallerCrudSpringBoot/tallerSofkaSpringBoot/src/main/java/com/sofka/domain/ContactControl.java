package com.sofka.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @Data Anotación para el acceso directo de los datos.
 * @Entity Indica un objeto y se vinculara a la tabla.
 *
 * @author Yon Hawer Piñeros
 */
@Data
@Entity
@Table(name = "contact_control")
public class ContactControl implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contact")
    private Long id;

    @Column(name = "full_name")
    private String name;

    @Column(name = "phone_number")
    private String number;

    @Column(name = "email")
    private String email;

    @Column(name = "birth_date")
    private Date date;

}
