/*Para realizar el mantenimiento de la base de datos de una empresa se requieren las siguientes acciones:*/

/*1. Añadir un nuevo departamento indicando solo su nombre y presupuesto.*/
select * from departamento;
insert into departamento (nombre, presupuesto) values ("Jaime", 2500);
/*2. Añadir un nuevo empleado asociado al departamento añadido en el punto anterior. Solo disponemos de: nif, nombre, apellido1,
 apellido2 y codigo_departamento.*/
select * from empleado;
insert into empleado (nif, nombre, apellido1, apellido2, codigo_departamento) values ("20132409z", "Jaime", "Alarcón", "Campos","10");

/*3. Realizar una copia de seguridad de la tabla departamento. Para ello se creará una nueva tabla: departamento_backup con la misma 
estructura que la tabla departamento. Una vez creada se copiaran todos los datos de departamento a departamento_backup.*/
drop table if exists departamento_backup;
CREATE TABLE departamento_backup (
  codigo int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(30) NOT NULL,
  presupuesto int(11) DEFAULT '0',
  gastos int(11) DEFAULT '1500',
  PRIMARY KEY (codigo)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

insert into departamento_backup select * from departamento;
select * from departamento_backup;

/*4. Incrementar en 5000 € los presupuestos de los departamentos que dispongan de menos de 2000 €. La cantidad disponible es el presupuesto
 menos el gasto.*/
 show create table empleado;
 alter table empleado drop foreign key empleado_ibfk_1;
 alter table empleado drop key codigo_departamento;
 
 alter table empleado add foreign key (codigo_departamento)
 references departamento(codigo)
 on delete cascade
 on update cascade;
update departamento set gastos = gastos + 50000 where presupuesto < 20000;

 