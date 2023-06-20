@echo off
cls

echo Contenido del directorio de documentos:
dir "%USERPROFILE%\Documentos"

echo.
echo Creando directorio Lotes_XYZ en el directorio de documentos..
mkdir "%USERPROFILE%\Documentos\LOTES_XYZ"

echo.
echo Directorio LOTES_XYZ creado exitosamente.

pause > nul