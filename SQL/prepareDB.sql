CREATE TABLE assure (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  first_name      VARCHAR2(50),
  last_name       VARCHAR2(50)  NOT NULL,
  date_of_birth   DATE
);

CREATE TABLE contrat (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  assure_id       NUMBER(7)     NOT NULL,
  franchise       INTEGER     NOT NULL,
  limite_max      INTEGER     NOT NULL,

  CONSTRAINT fk_contrat_assure     FOREIGN KEY (assure_id)   REFERENCES assure(id)
);

CREATE TABLE element_contrat (
  id              NUMBER(7)     NOT NULL PRIMARY KEY,
  condition       VARCHAR2(400) NOT NULL
);

CREATE TABLE element_contrat_to_contrat (
  contrat_id            NUMBER(7)        NOT NULL,
  element_contrat_id    NUMBER(7)        NOT NULL,

  PRIMARY KEY(contrat_id, element_contrat_id),
  CONSTRAINT fk_ec2c_contrat                FOREIGN KEY (contrat_id)            REFERENCES contrat (id)                 ON DELETE CASCADE,
  CONSTRAINT fk_ec2c_element_contrat       FOREIGN KEY (element_contrat_id)     REFERENCES element_contrat (id)         ON DELETE CASCADE
);