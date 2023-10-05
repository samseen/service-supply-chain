CREATE TABLE IF NOT EXISTS tokens
(
    id          BIGSERIAL PRIMARY KEY,
    token       VARCHAR,
    tokenType   VARCHAR,
    expired     BOOLEAN,
    revoked     BOOLEAN
);