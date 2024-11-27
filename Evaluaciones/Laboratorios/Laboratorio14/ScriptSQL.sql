DROP SCHEMA IF EXISTS laboratorio14;
CREATE SCHEMA laboratorio14;
USE laboratorio14;
DROP TABLE IF EXISTS videojuego;
DROP TABLE IF EXISTS genero;
CREATE TABLE genero(
	id_genero INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    activo TINYINT,
    PRIMARY KEY(id_genero)
)ENGINE=InnoDB;
CREATE TABLE videojuego(
	id_videojuego INT AUTO_INCREMENT,
    fid_genero INT,
    nombre VARCHAR(1000),
    fecha_lanzamiento DATE,
    costo_desarrollo DECIMAL(12,2),
    foto LONGBLOB,
    clasificacion ENUM('EVERYONE','TEEN','MATURE','ADULTSONLY'),
    activo TINYINT,
    PRIMARY KEY(id_videojuego),
    FOREIGN KEY(fid_genero) REFERENCES genero(id_genero)
)ENGINE=InnoDB;
-- Insertando registros de generos
INSERT INTO genero(nombre,activo) VALUES('ACCION',1);
INSERT INTO genero(nombre,activo) VALUES('ARCADE',1);
INSERT INTO genero(nombre,activo) VALUES('SHOOTER',1);
INSERT INTO genero(nombre,activo) VALUES('ESTRATEGIA',1);
INSERT INTO genero(nombre,activo) VALUES('SIMULACIÓN',1);
INSERT INTO genero(nombre,activo) VALUES('DEPORTE',1);
INSERT INTO genero(nombre,activo) VALUES('AVENTURA',1);
INSERT INTO genero(nombre,activo) VALUES('ROL',1);
INSERT INTO genero(nombre,activo) VALUES('PELEA',1);
-- Eliminando Procedimientos Almacenados
DROP PROCEDURE IF EXISTS LISTAR_GENEROS_TODOS;
DROP PROCEDURE IF EXISTS INSERTAR_VIDEOJUEGO;
DROP PROCEDURE IF EXISTS LISTAR_VIDEOJUEGOS_POR_NOMBRE;
DROP PROCEDURE IF EXISTS OBTENER_VIDEOJUEGO_POR_ID;
-- Creando Procedimientos Almacenados
DELIMITER $
CREATE PROCEDURE LISTAR_GENEROS_TODOS()
BEGIN
	SELECT id_genero, nombre FROM genero WHERE activo = 1;
END$
CREATE PROCEDURE INSERTAR_VIDEOJUEGO(
	OUT _id_videojuego INT,
    IN _fid_genero INT,
    IN _nombre VARCHAR(1000),
    IN _fecha_lanzamiento DATE,
    IN _costo_desarrollo DECIMAL(12,2),
    IN _foto LONGBLOB,
    IN _clasificacion ENUM('EVERYONE','TEEN','MATURE','ADULTSONLY')
)
BEGIN
	INSERT INTO videojuego(fid_genero,nombre,fecha_lanzamiento,costo_desarrollo,foto,clasificacion,activo) VALUES(_fid_genero,_nombre,_fecha_lanzamiento,_costo_desarrollo,_foto,_clasificacion,1);
    SET _id_videojuego = @@last_insert_id;
END$
CREATE PROCEDURE LISTAR_VIDEOJUEGOS_POR_NOMBRE(
	IN _nombre VARCHAR(1000)
)
BEGIN
	SELECT v.id_videojuego, v.nombre AS nombre_videojuego, g.id_genero, g.nombre AS nombre_genero, v.clasificacion FROM videojuego v INNER JOIN genero g ON v.fid_genero = g.id_genero WHERE v.activo = 1 AND v.nombre LIKE CONCAT('%',v.nombre,'%'); 
END$
CREATE PROCEDURE OBTENER_VIDEOJUEGO_POR_ID(
	IN _id_videojuego INT
)
BEGIN
	SELECT v.id_videojuego, v.nombre AS nombre_videojuego, v.fecha_lanzamiento, v.costo_desarrollo, v.foto, v.clasificacion, g.id_genero, g.nombre AS nombre_genero FROM videojuego v INNER JOIN genero g ON v.fid_genero = g.id_genero WHERE v.id_videojuego = _id_videojuego; 
END$