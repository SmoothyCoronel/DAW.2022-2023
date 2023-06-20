@echo off
REM mayor_o_igual_XYZ.bat - Compara dos números y muestra el resultado

if "%~1"=="" (
  echo No se han especificado dos números como parámetros.
  echo Uso: mayor_o_igual_XYZ.bat <num1> <num2>
  pause > nul
  exit /b
)

set "num1=%~1"
set "num2=%~2"

REM Comparar los números
if %num1% GTR %num2% (
  echo El %num1% es mayor que %num2%.
) else if %num1% LSS %num2% (
  echo El %num1% es menor que %num2%.
) else (
  echo El %num1% es igual a %num2%.
)

pause > nul