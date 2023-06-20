@echo off
REM copiar_XYZ.bat - Copia dos archivos de la carpeta lotes en Documentos
echo Primer archivo a copiar:
set /p archivo1 = "Introduzca el archivo: "

echo Segundo archivo a copiar:
set /p archivo2 = "Introduzca el archivo: "

REM Verificar si se han pasado dos archivos como pàrámetros
if "%archivo1%"=="" (
    echo No se han especificado los dos archivos a copiar como parámetros
    pause > nul
    exit /b
) 
if "%archivo2%"=="" (
    echo No se han especificado los dos archivos a copiar como parámetros
    pause > nul
    exit /b
)

REM Obtener la ruta  del directorio de Documentos
set "rutaDocumentos=%USERPROFILE%\Documentos\Lotes"

REM Crear el directorio de lotes si no existe
if not exists "%rutaDocumentos%" (
    mkdir "%rutaDocumentos%"
)

REM Copiar los archivos a la carpeta Lotes
copy "%archivo1%" "%rutaDocuemntos%\"
copy "%archivo2%" "%rutaDocuemntos%\"

REM Mostra mensaje de exito
echo Los dos archivos se han copiado directamente a %rutaDocumentos%

REM Esperar la presión de una tecla
pause > nul