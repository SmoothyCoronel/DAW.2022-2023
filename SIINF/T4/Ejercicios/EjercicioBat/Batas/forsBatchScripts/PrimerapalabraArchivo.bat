@echo off
REM Recorrer un archivo y mostrar solo la primera palabra de cada linea:
echo Archivo que muestra las primeras palabras de cada linea escrita en este
set /p archivo1 = "Introduzca el nombre del archivo: "

for /F %%x in (%archivo1%) do (
  echo %%x
)