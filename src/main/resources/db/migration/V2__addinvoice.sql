CREATE TABLE IF NOT EXISTS invoice(
    id SERIAL,
    client_id INT ,
    code VARCHAR(100),
    create_at DATE,
    total DOUBLE,
    PRIMARY KEY (id),
    FOREIGN KEY (client_id) REFERENCES client(id),
    UNIQUE (code)
    );