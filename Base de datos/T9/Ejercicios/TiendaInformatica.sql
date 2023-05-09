
/*Realizar el siguiente mantenimiento de la base de datos de tienda informática.*/
/*1. Queremos disponer en una tabla nueva de los siguientes datos: nombre_fabricante (todos, incluidos los que no proporcionan ningún producto),
 nombre_producto y precio. Nota: Una vez creada la tabla nueva se han de insertar todos los registros en una única operación de inserción.*/
  CREATE TABLE IF NOT EXISTS fabricante_productos (
 nombre_fabricante VARCHAR(100) NOT NULL  ,
 nombre_producto VARCHAR(100) NOT NULL, 
 precio DOUBLE NOT NULL
);
insert into fabricante_productos select f.nombre, p.nombre, p.precio
from fabricante f  left join producto p on p.codigo = f.codigo ; 
 
/*2. Eliminar el fabricante Xiaomi. ¿Es posible eliminarlo? Si no fuese posible, ¿qué cambios debería realizar para que fuese posible borrarlo?*/
/*Se podría realizar de dos formas. Teniendo en cuenta que no es posible eliminarlo de normal*/
/*Primera forma*/
set SQL_SAFE_UPDATES=0;
delete from fabricante where nombre = "Xiaomi";

/*Segunda forma*/
show create table producto;
alter table producto drop foreign key producto_ibfk_1;
alter table producto drop key codigo_fabricante;
delete from fabricante where nombre='Xiaomi';

/*3. Actualizar el código del fabricante Lenovo al valor 20. ¿Es posible actualizarlo? Si no fuese posible, realiza los cambios necesarios para la cambiarlo*/
select * from fabricante;
update fabricante set codigo = 20 where nombre = "Lenovo";

/*No se puede eliminar, fallo por clave foranea */
show create table producto;
alter table producto drop foreign key producto_ibfk_1;
alter table producto drop key codigo_fabricante;

alter table producto add foreign key (codigo_fabricante)
references fabricante(codigo)
on delete cascade
on update cascade;

update fabrica set codigo=20 where codigo=2;

/*4. Incrementar los precios de todos los productos en 5 €.*/
set SQL_SAFE_UPDATES=0;
update producto set precio = precio+5;

/*5. Eliminar todas las impresoras que tienen un precio menor de 200 €.*/
select * from producto;
delete  from producto where precio < 200 && nombre like 'impresora%';
