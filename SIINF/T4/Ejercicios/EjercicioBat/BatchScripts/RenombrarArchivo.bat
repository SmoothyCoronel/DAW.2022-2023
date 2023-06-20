@echo off
REM renombrar_XYZ.bat - Renombra un archivo agregando el nombre del usuario actual

if "%~1"=="" (
  echo No se ha especificado ningún archivo como parámetro.
  echo Uso: renombrar_XYZ.bat <archivo>
  pause > nul
  exit /b
)

set "archivo=%~1"

REM Verificar si el archivo existe
if not exist "%archivo%" (
  echo El archivo "%archivo%" no existe.
  pause > nul
  exit /b
)

REM Obtener el nombre del usuario actual
for /f "delims=" %%U in ('whoami') do set "usuario=%%U"
set "usuario=%usuario:*\=%"

REM Renombrar el archivo
set "nuevo_nombre=%usuario%_%archivo%"
ren "%archivo%" "%nuevo_nombre%"

echo El archivo ha sido renombrado a "%nuevo_nombre%".

pause > nul
