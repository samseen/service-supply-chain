CREATE TABLE IF NOT EXISTS users
(
    id          BIGSERIAL PRIMARY KEY,
    first_name  VARCHAR,
    last_name   VARCHAR,
    email       VARCHAR,
    user_name   VARCHAR NOT NULL,
    password    VARCHAR NOT NULL,
    role        VARCHAR NOT NULL,
    created_by  VARCHAR,
    updated_by  VARCHAR,
    created_on  TIMESTAMP NOT NULL DEFAULT NOW(),
    updated_on  TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE INDEX users_idx_first_name ON users (first_name);
CREATE INDEX users_idx_last_name ON users (last_name);
CREATE INDEX users_idx_email ON users (email);
CREATE INDEX users_idx_user_name ON users (user_name);
CREATE INDEX users_idx_role ON users (role);
CREATE INDEX users_idx_created_at ON users (created_on);