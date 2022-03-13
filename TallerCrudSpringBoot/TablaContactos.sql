DROP SCHEMA IF EXISTS sofka_contacts;
CREATE SCHEMA sofka_contacts DEFAULT CHARACTER SET utf8 ;
USE sofka_contacts;

CREATE TABLE contact_control(
  id_contact INT NOT NULL AUTO_INCREMENT,
  full_name VARCHAR(45) NOT NULL,
  phone_number VARCHAR(15) NOT NULL,
  email VARCHAR(25) NOT NULL,
  birth_date DATE NULL,
  PRIMARY KEY (id_contact),
  UNIQUE INDEX email_UNIQUE (email ASC) VISIBLE);

INSERT INTO contact_control (full_name, phone_number, email, birth_date)
VALUES ('contacto 1', '1111111111', 'contact1@gmail.com', '1980-05-11');

INSERT INTO contact_control (full_name, phone_number,email, birth_date)
VALUES ('contacto 2', '2222222222', 'contact2@gmail.com', '1985-07-30');

INSERT INTO contact_control (full_name, phone_number,email, birth_date)
VALUES ('contacto 3', '3333333333', 'contact3@gmail.com', '1990-09-30');