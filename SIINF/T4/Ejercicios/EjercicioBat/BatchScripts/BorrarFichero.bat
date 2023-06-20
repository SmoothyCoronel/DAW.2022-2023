@echo off
REM borrar_XYZ.bat - Borra un archivo especificado como parámetro
echo Archivo a eliminar:
set /p archivo1 = "Introduzca el archivo: "

REM Verificar si se ha especificado un archivo como parámetro
if "%archivo1%"=="" (
  echo No se ha especificado un archivo como parámetro.
  echo Uso: borrar_XYZ.bat <nombre_archivo>
  pause > nul
  exit /b
)

REM Verificar si el archivo existe
if not exist "%archivo1%" (
  echo El archivo "%archivo1%" no existe.
  pause > nul
  exit /b
)

REM Borrar el archivo
del "%archivo1%"

REM Mostrar mensaje de éxito
echo El archivo "%archivo1%" ha sido borrado correctamente.

pause > nul
