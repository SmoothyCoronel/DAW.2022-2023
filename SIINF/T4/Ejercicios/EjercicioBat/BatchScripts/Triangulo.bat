@echo off
REM triángulo_XYZ.bat - Dibuja un triángulo con el texto especificado

set/p %~1= Escriba palabra:

if "%~1"=="" (
  echo No se ha especificado un texto como parámetro.
  pause > nul
  exit /b
)

set "texto=%~1"

REM Obtener la longitud del texto
for %%A in ("%texto%") do set "longitud=%%~zA"

REM Dibujar el triángulo
setlocal enabledelayedexpansion
for /l %%i in (1,1,%longitud%) do (
  set "linea=!texto:~0,%%i!"
  echo !linea!
)
for /l %%i in (%longitud%,-1,1) do (
  set "linea=!texto:~0,%%i!"
  echo !linea!
)
endlocal

pause > nul
