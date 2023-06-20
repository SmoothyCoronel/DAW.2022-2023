@echo off
REM edad_XYZ.bat - Solicita la edad y proporciona una respuesta

set /p edad=Ingresa tu edad: 

if %edad% LSS 10 (
  echo Eres muy joven.

) else if %edad% LEQ 30 (
  echo Que mala edad tienes.

) else (
  echo Que bien te veo.
)

pause > nul

