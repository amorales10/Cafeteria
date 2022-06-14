-- Database: Cafeteria

-- DROP DATABASE IF EXISTS "Cafeteria";

CREATE DATABASE "Cafeteria"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Colombia.1252'
    LC_CTYPE = 'Spanish_Colombia.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
	Create Table Referencias(
	id_refe serial,
	nombre_refe varchar(50) not null,
	primary key (id_refe))
	
	Select * from Referencias;
	
	Create Table Categorias(
	id_cate serial,
	nombre_cate varchar(50) not null,
	primary key (id_cate))
	
	Select * from Categorias;
	
	Create Table Productos(
	id_prod serial,
	nombre_prod varchar(50) not null,
	precio_prod int not null,
	peso_prod int not null,
	stock_prod int not null,
	fecha_creacion_prod Timestamp not null,
	primary key (id_prod),
	id_refe INT REFERENCES Referencias(id_refe) ON DELETE RESTRICT,
	id_cate INT REFERENCES Categorias(id_cate) ON DELETE RESTRICT
	)
	
	Select*from Productos
	
	Create Table Ventas(
	id_ventas serial,
	Cantidad_venta int not null,
	total_venta int not null,
	fecha_venta Timestamp not null,
	primary key (id_ventas),
	id_prod int
	)
	
	Select*from Ventas
	
	INSERT INTO categorias(
	nombre_cate)
	VALUES ('Comidas');
	INSERT INTO categorias(
	nombre_cate)
	VALUES ('Bebidas');
	
	
	select id_prod, nombre_prod, stock_prod 
	from productos where stock_prod = (select max(stock_prod) from productos) Order By nombre_prod ASC
	
	
	select ventas.id_prod, nombre_prod, cantidad_venta 
	from ventas join productos on ventas.id_prod=productos.id_prod 
	where cantidad_venta = (select max(cantidad_venta) from ventas) Order By nombre_prod ASC
	