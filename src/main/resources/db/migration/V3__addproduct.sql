CREATE TABLE IF NOT EXISTS product(
    id SERIAL,
    descripcion VARCHAR(100) NOT NULL,
    brand VARCHAR(50) NOT NULL,
    stock INT NOT NULL,
    PRIMARY KEY (id)
    );