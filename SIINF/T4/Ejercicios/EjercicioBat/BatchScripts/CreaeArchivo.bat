@echo off
REM Creacion de un archivo
echo echo. >> nuevo_archivo.bat
set opcion = "nuevo_archivo"

REM Verificar si se ha pasado un archivo como parámetro
if "%~1"=="" (
  echo No se ha especificado un archivo como parámetro.
  pause > nul
  exit /b
)

REM Verificar si el archivo existe
if not exist "%~1" (
  echo No existe el archivo "%~1" pasado como parámetro.
  pause > nul
  exit /b
)

REM Mostrar el contenido del archivo
type "%~1"

REM Esperar la presión de una tecla
pause > nul