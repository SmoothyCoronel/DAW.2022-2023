/*Mantenimiento de la base de datos de Jardinería*/
/*Para realizar el mantenimiento de la base de datos de jardinería se requieren las siguientes actividades:*/

/*1. Eliminar los clientes que no hayan realizado ningún pedido.*/
set SQL_SAFE_UPDATES=0;
select * from pedido;
    select codigo_cliente, nombre_cliente from cliente where codigo_cliente not in (select distinct codigo_cliente from pedido);
    delete from cliente where codigo_cliente not in (select distinct codigo_cliente from pedido);
    
/*2. Incrementar en un 20% el precio de los productos que no tengan pedidos.*/
set SQL_SAFE_UPDATES=0;
update producto set precio_venta = precio_venta + ((precio_venta*20)/100) where codigo_producto = (select codigo_producto from detalle_pedido where
codigo_pedido is null);

select * from detalle_pedido;
/*3. Borrar los pagos del cliente con menor límite de crédito.*/
select * from cliente where limite_credito = (select min(limite_credito) from cliente);
select * from pago where codigo_cliente = 16;
delete from pago where codigo_cliente=(select codigo_cliente from cliente where limite_credito = (select min(limite_credito) from cliente));

/*4. Modificar la tabla detalle_pedido para incorporar un campo numérico llamado total_linea que contendrá el valor resultante de la siguiente expresión:
total_linea = precio_unidad*cantidad * (1 + (iva/100))
El IVA en los productos de jardinería es 21%.*/
alter table detalle_pedido add column total_linea decimal (15,2);
update detalle_pedido set total_linea = precio_unidad * cantidad * (1+(21/100));

/*5. Añadir una oficina con sede en Granada y asignarle tres empleados representantes de ventas.*/
select * from oficina;
insert into oficina (codigo_oficina, ciudad, pais, region, codigo_postal, telefono, linea_direccion1) values
('BCN-ES', 'Granada', 'España', 'Andalucia', '235145', '+34 345 1231', 'Avd cometa 20');