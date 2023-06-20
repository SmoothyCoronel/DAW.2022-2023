@echo off

if "%-3"=="" (
    echo No se han especificado tres palabras como parámetros.
    pause > nulexit /b
)

set "palabra1=%-1"
set "palabra2=%-2"
set "palabra3=%-3"

setLocal enabledelayedexpansion

set "palabras=!palabra1!,!palabra2!,!palabra3!"

for /f "delims=," %%i in ('echo !palabras! ^| sort') do (
  echo %%i
)

endlocal

pause > nul