CREATE TABLE IF NOT EXISTS permissions
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR
);

INSERT INTO permissions VALUES ('SYSTEM_ADMIN');
INSERT INTO permissions VALUES ('MOBILIZER');
INSERT INTO permissions VALUES ('DISTRIBUTOR');