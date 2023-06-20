@echo off

set "nombre_completo=Felipe"
set "fecha_nacimiento=2021-06-11"

REM Crear el archivo con el nombre y fecha de nacimiento
echo Nombre completo: %nombre_completo% > "%nombre_completo%_%fecha_nacimiento%.txt"
echo Fecha de nacimiento: %fecha_nacimiento% >> "%nombre_completo%_%fecha_nacimiento%.txt"

REM Copiar contenido al archivo identidad.txt
copy "%nombre_completo%_%fecha_nacimiento%.txt" "identidad.txt"

REM Eliminar el archivo original
del "%nombre_completo%_%fecha_nacimiento%.txt"

echo El archivo se ha creado, copiado y eliminado correctamente