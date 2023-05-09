/*Para realizar el mantenimiento de la base de datos de una empresa se requieren las siguientes acciones:*/

/*1. Añadir un nuevo departamento indicando solo su nombre y presupuesto.*/
select * from departamento;
insert into departamento (nombre,presupuesto) values ('Administracion','4000');

/*2. Añadir un nuevo empleado asociado al departamento añadido en el punto anterior. Solo disponemos de: 
nif, nombre, apellido1, apellido2 y codigo_departamento.*/
select * from empleado;
insert into empleado (nif,nombre,apellido1,apellido2,codigo_departamento)  values ('32447002p','Daniel','Diaz','Ruiz','11');

/*3. Realizar una copia de seguridad de la tabla departamento. Para ello se creará una nueva tabla: departamento_backup con la misma estructura que la tabla
 departamento. Una vez creada se copiaran todos los datos de departamento a departamento_backup.*/
 CREATE TABLE departamento_backup LIKE departamento;
INSERT INTO departamento_backup SELECT * FROM departamento;

/*4. Incrementar en 5000 € los presupuestos de los departamentos que dispongan de menos de 2000 €. La cantidad disponible es el presupuesto menos el gasto.*/
set SQL_SAFE_UPDATES=0;
update departamento set gastos = gastos+50000 where presupuesto < 20000;
select * from departamento;