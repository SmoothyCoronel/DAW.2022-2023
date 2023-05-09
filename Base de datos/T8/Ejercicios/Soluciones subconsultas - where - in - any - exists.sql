-- --------------------------------------------------
--   SUB CONSULTAS - ventadb,tiendadb,empleadodb   --
--   operadores básicos.                           --
-- --------------------------------------------------

/*
1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER
JOIN).
*/
select * from producto;
select * from fabricante;
select codigo from fabricante where nombre='lenovo';

select nombre, precio, codigo_fabricante from producto
   where codigo_fabricante=
        (select codigo from fabricante where nombre='lenovo');
/*
2. Devuelve todos los datos de los productos que tienen el mismo precio que
el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
*/
select * from producto;
update producto set precio=59.99 where codigo=9;

select max(precio) from producto
where codigo_fabricante=
	(select codigo from fabricante where nombre='Lenovo');

select * from producto
   where precio=(select max(precio) from producto
where codigo_fabricante=
	(select codigo from fabricante where nombre='Lenovo'));
/*
3. Lista el nombre del producto más caro del fabricante Lenovo.
*/

select nombre, precio, codigo_fabricante from producto where 
precio=(select max(precio) from producto where codigo_fabricante=
	   (select codigo from fabricante where nombre='Lenovo'))
and
codigo_fabricante=(select codigo from fabricante where nombre='Lenovo');

/*
4. Lista el nombre del producto más barato del fabricante Hewlett-Packard.
*/
select nombre, precio, codigo_fabricante from producto where 
precio=(select min(precio) from producto where codigo_fabricante=
	   (select codigo from fabricante where nombre='Hewlett-Packard'))
and
codigo_fabricante=(select codigo from fabricante where nombre='Hewlett-Packard');
/*
5. Devuelve todos los productos de la base de datos que tienen un precio
mayor o igual al producto más caro del fabricante Lenovo.
*/
select nombre, precio, codigo_fabricante from producto where 
precio>=(select max(precio) from producto where codigo_fabricante=
	   (select codigo from fabricante where nombre='Lenovo'));

/*
6. Lista todos los productos del fabricante Asus que tienen un precio superior
al precio medio de todos sus productos.
*/
select * from producto where codigo_fabricante=1;
select codigo from fabricante where nombre='asus';

select * from producto where
  precio>=(select avg(precio) from producto where codigo_fabricante=
                (select codigo from fabricante where nombre='asus'))
and
  codigo_fabricante=(select codigo from fabricante where nombre='asus');
/*
1. Devuelve un listado con todos los empleados que tiene el departamento
de Sistemas. (Sin utilizar INNER JOIN).
*/
select * from empleado
  where codigo_departamento=
       (select codigo from departamento where nombre='sistemas');
       
describe empleado;
select concat_ws(', ',concat_ws(' ',e.apellido1,e.apellido2),e.nombre) Empleado,
       concat_ws(', ',concat_ws(' ',j.apellido1,j.apellido2),j.nombre) Jefe,
       d.nombre
     from empleado e left 
          join empleado j on e.codigo_jefe=j.codigo
          join departamento d on e.codigo_departamento=d.codigo
order by 3;
/*
2. Devuelve el nombre del departamento con mayor presupuesto y la
cantidad que tiene asignada.
*/
select max(presupuesto) from departamento;

select nombre, presupuesto from departamento
   where presupuesto=(select max(presupuesto) from departamento);
   
select nombre, presupuesto from departamento
order by presupuesto desc limit 1;

/*
3. Devuelve el nombre del departamento con menor presupuesto y la
cantidad que tiene asignada.
*/
select nombre, presupuesto from departamento
   where presupuesto=(select min(presupuesto) from departamento);

select nombre, presupuesto from departamento
order by presupuesto  limit 1;
/*
1. Devuelve un listado con todos los pedidos que ha realizado Adela Salas
Díaz. (Sin utilizar INNER JOIN).
*/
select * from cliente;
select * from pedido;

select * from pedido where
   id_cliente=
    (select id from cliente where nombre='Adela' and apellido1='Salas' and apellido2='Díaz');
/*
2. Devuelve el número de pedidos en los que ha participado el comercial
Daniel Sáez Vega. (Sin utilizar INNER JOIN)
*/
select count(id) from pedido where
   id_comercial=
    (select id from comercial where nombre='Daniel' and apellido1='Sáez' and apellido2='Vega');

/*
3. Devuelve los datos del cliente que realizó el pedido más caro en el año
2019. (Sin utilizar INNER JOIN)
*/
select * from pedido;
select * from pedido where fecha like '2019%';

select * from cliente where id=
(select id_cliente from pedido where total=
   (select max(total) from pedido where year(fecha)='2019')
);

/*
4. Devuelve la fecha y la cantidad del pedido de menor valor realizado por el
cliente Pepe Ruiz Santana.
*/
select * from cliente;
select min(total) from pedido where id_cliente=
       (select id from cliente where nombre='pepe' and apellido1='ruiz' and apellido2='santana');

select * from pedido where id_cliente=8;
insert into pedido (total,fecha,id_cliente,id_comercial) values (110.5, '2016-05-01',8,2);
select * from pedido 
  where total=
      (select min(total) from pedido where id_cliente=
         (select id from cliente where nombre='pepe' and apellido1='ruiz' and apellido2='santana')
       )
  and
     id_cliente=  
       (select id from cliente where nombre='pepe' and apellido1='ruiz' and apellido2='santana');

select * from pedido 
  where id_cliente=
        (select id from cliente where nombre='pepe' and apellido1='ruiz' and apellido2='santana')
  group by id_cliente having total=min(total);
/*
5. Devuelve un listado con los datos de los clientes y los pedidos, de todos
los clientes que han realizado un pedido durante el año 2017 con un valor
mayor o igual al valor medio de los pedidos realizados durante ese mismo
año.
*/
select * from pedido where year(fecha)='2017';
select avg(total) from pedido where year(fecha)='2017';

select * from pedido p join cliente c on c.id=p.id_cliente
   where p.total>=
     (select avg(total) from pedido where year(fecha)='2017')
and 
   year(fecha)='2017';
   
-- ----------------------------
-- JARDINERIA                --
-- ----------------------------
/*
1. Devuelve el nombre del cliente con mayor límite de crédito.
*/
SELECT * from cliente;
select nombre_cliente, limite_credito from cliente order by limite_credito desc;
select nombre_cliente from cliente
  where limite_credito=(select max(limite_credito) from cliente);
/*
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
*/
describe producto;
select max(precio_venta) from producto;
select codigo_producto, nombre, gama from producto
  where precio_venta=
      (select max(precio_venta) from producto);

/*
3. Devuelve el nombre del producto del que se han vendido más unidades.
(Tenga en cuenta que tendrá que calcular cuál es el número total de
unidades que se han vendido de cada producto a partir de los datos de la
tabla detalle_pedido. Una vez que sepa cuál es el código del producto,
puede obtener su nombre fácilmente.)
*/

/*
4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya
realizado. (Sin utilizar INNER JOIN).
*/
select * from cliente;
select * from pago;
select codigo_cliente, nombre_cliente, limite_credito from cliente;
select codigo_cliente, sum(total) from pago
    group by codigo_cliente;
    
select c.codigo_cliente, c.nombre_cliente, c.limite_credito from cliente c
   where limite_credito>=
        (select sum(p.total) from pago p where c.codigo_cliente=p.codigo_cliente);

/*
5. Devuelve el producto que más unidades tiene en stock.
*/

/*
6. Devuelve el producto que menos unidades tiene en stock.
*/

/*
7. Devuelve el nombre, los apellidos y el email de los empleados que están a
cargo de Alberto Soria.
Subconsultas con ALL y ANY - tiendadb.
*/

/*
1. Devuelve el producto más caro que existe en la tabla producto sin hacer
uso de MAX, ORDER BY ni LIMIT.
*/
select * from producto;
select distinct precio from producto;
select precio from producto 
   where precio>= ALL (select distinct precio from producto);
   
select nombre, precio from producto 
   where precio = 
   (select precio from producto 
         where precio>= ALL (select distinct precio from producto));

/*
2. Devuelve el producto más barato que existe en la tabla producto sin
hacer uso de MIN, ORDER BY ni LIMIT.
3. Devuelve los nombres de los fabricantes que tienen productos
asociados. (Utilizando ALL o ANY).
4. Devuelve los nombres de los fabricantes que no tienen productos
asociados. (Utilizando ALL o ANY).
Subconsultas con IN y NOT IN – tiendadb.
1. Devuelve los nombres de los fabricantes que tienen productos
asociados. (Utilizando IN o NOT IN).
2. Devuelve los nombres de los fabricantes que no tienen productos
asociados. (Utilizando IN o NOT IN).
Subconsultas con ALL y ANY – empleadodb.
1. Devuelve el nombre del departamento con mayor presupuesto y la
cantidad que tiene asignada. Sin hacer uso de MAX, ORDER BY ni LIMIT.
2. Devuelve el nombre del departamento con menor presupuesto y la
cantidad que tiene asignada. Sin hacer uso de MIN, ORDER BY ni LIMIT.
3. Devuelve los nombres de los departamentos que tienen empleados
asociados. (Utilizando ALL o ANY).
4. Devuelve los nombres de los departamentos que no tienen empleados
asociados. (Utilizando ALL o ANY).
Subconsultas con IN y NOT IN – empleadodb.
1. Devuelve los nombres de los departamentos que tienen empleados
asociados. (Utilizando IN o NOT IN).
2. Devuelve los nombres de los departamentos que no tienen empleados
asociados. (Utilizando IN o NOT IN).
Subconsultas con ALL y ANY – ventadb.
1. Devuelve el pedido más caro que existe en la tabla pedido si hacer uso de
MAX, ORDER BY ni LIMIT.
2. Devuelve un listado de los clientes que no han realizado ningún pedido.
(Utilizando ANY o ALL).
3. Devuelve un listado de los comerciales que no han realizado ningún
pedido. (Utilizando ANY o ALL).
Subconsultas con IN y NOT IN – ventadb.
1. Devuelve un listado de los clientes que no han realizado ningún pedido.
(Utilizando IN o NOT IN).
2. Devuelve un listado de los comerciales que no han realizado ningún
pedido. (Utilizando IN o NOT IN).
Subconsultas con EXISTS y NOT EXISTS.
Tienda de informática
1. Devuelve los nombres de los fabricantes que tienen productos asociados.
(Utilizando EXISTS o NOT EXISTS).
2. Devuelve los nombres de los fabricantes que no tienen productos
asociados. (Utilizando EXISTS o NOT EXISTS).
Gestión de empleados
1. Devuelve los nombres de los departamentos que tienen empleados
asociados. (Utilizando EXISTS o NOT EXISTS).
2. Devuelve los nombres de los departamentos que tienen empleados
asociados. (Utilizando EXISTS o NOT EXISTS).
Gestión de ventas
1. Devuelve un listado de los clientes que no han realizado ningún pedido.
(Utilizando EXISTS o NOT EXISTS).
2. Devuelve un listado de los comerciales que no han realizado ningún
pedido. (Utilizando EXISTS o NOT EXISTS).
Jardinería
1. Devuelve un listado que muestre solamente los clientes que no han
realizado ningún pago.
2. Devuelve un listado que muestre solamente los clientes que sí han
realizado ningún pago.
3. Devuelve un listado de los productos que nunca han aparecido en un
pedido.
4. Devuelve un listado de los productos que han aparecido en un pedido
alguna vez
*/