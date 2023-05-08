

USE joseantdb;

CREATE TABLE IF NOT EXISTS cliente
(
 codcliente INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
 dni VARCHAR(9) NOT NULL,
 nombre VARCHAR(25) NOT NULL,
 direccion VARCHAR(40) NOT NULL,
 telefono VARCHAR(9) NULL
);

CREATE TABLE IF NOT EXISTS reserva
(
 numreserva INTEGER AUTO_INCREMENT PRIMARY KEY,
 codcliente INTEGER NOT NULL,
 fechainicio DATE NOT NULL,
 fechafin DATE NOT NULL,
 total INTEGER DEFAULT 0,
 FOREIGN KEY (codcliente) REFERENCES cliente(codcliente)
);

CREATE TABLE IF NOT EXISTS coche
(
 matricula VARCHAR(7) NOT NULL PRIMARY KEY,
 modelo VARCHAR(20) NOT NULL,
 color VARCHAR(20) NOT NULL,
 marca VARCHAR(15) NOT NULL,
 preciohora INTEGER DEFAULT 100
);

CREATE TABLE IF NOT EXISTS reservacoche
(
 numreserva INTEGER NOT NULL,
 matricula VARCHAR(7) NOT NULL,
 gasolina INTEGER DEFAULT 0,
 PRIMARY KEY (numreserva, matricula),
 FOREIGN KEY (numreserva) REFERENCES reserva(numreserva),
 FOREIGN KEY (matricula) REFERENCES coche(matricula)
);

CREATE TABLE IF NOT EXISTS aval
(
 aval INTEGER NOT NULL,
 avalado INTEGER NOT NULL,
 PRIMARY KEY (aval, avalado),
 FOREIGN KEY (aval) REFERENCES cliente (codcliente),
 FOREIGN KEY (avalado) REFERENCES cliente (codcliente)
);

