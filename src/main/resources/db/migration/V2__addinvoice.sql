CREATE TABLE IF NOT EXISTS invoice(
    id SERIAL,
    code VARCHAR(100) NOT NULL,
    create_at DATE NOT NULL,
    total DECIMAL(8,2),
    client_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (client_id) REFERENCES client(id),
    UNIQUE (code)
    );