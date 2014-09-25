CREATE TABLE assure (
  id              INTEGER     NOT NULL PRIMARY KEY AUTO_INCREMENT,
  first_name      VARCHAR(50),
  last_name       VARCHAR(50)  NOT NULL,
  date_of_birth   DATE
);

CREATE TABLE contrat (
  id              INTEGER     NOT NULL PRIMARY KEY AUTO_INCREMENT,
  assure_id       INTEGER     NOT NULL,
  franchise       INTEGER     NOT NULL,
  limite_max      INTEGER     NOT NULL,

  CONSTRAINT fk_contrat_assure     FOREIGN KEY (assure_id)   REFERENCES assure(id)
);

CREATE TABLE element_contrat (
  id              INTEGER     NOT NULL PRIMARY KEY AUTO_INCREMENT,
  conditions       VARCHAR(200) NOT NULL
);

CREATE TABLE element_contrat_to_contrat (
  contrat_id            INTEGER        NOT NULL,
  element_contrat_id    INTEGER        NOT NULL,

  PRIMARY KEY(contrat_id, element_contrat_id),
  CONSTRAINT fk_ec2c_contrat                FOREIGN KEY (contrat_id)            REFERENCES contrat (id)                 ON DELETE CASCADE,
  CONSTRAINT fk_ec2c_element_contrat       FOREIGN KEY (element_contrat_id)     REFERENCES element_contrat (id)         ON DELETE CASCADE
);