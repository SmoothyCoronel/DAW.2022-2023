@echo off
REM Si queremos usar como delimitadores los simbolos de puntuacion, como el punto, la coma, el punto y coma, etc...:
echo Archivo que muestra el texto del archivo hasta los delimitadores
set /p archivo1 = "Introduzca el nombre del archivo: "

for /F "delims=.,;:" %%a in (%archivo1%) do (
  echo %%a
)