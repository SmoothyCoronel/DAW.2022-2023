@echo off
REM mostrar_XYZ.bat - Muestra el contenido de un archivo
echo Vamos a elegir el archivo para el programa
set /p archivo = "Introduzca la dirección del archivo"

REM Verificar si se ha pasado un archivo como parámetro
if "%archivo%"=="" (
    echo No se ha especificado un archivo como parametro
    pause > nul
    exit /b
)

REM Verificar si el archivo existe
if not exist "%archivo%" (
  echo El archivo "%archivo%" no existe.
  pause > nul
  exit /b
)

REM Mostrar el contenido del archivo
type "%archivo%"

REM Esperar la presión de una tecla
pause > nul
