@echo off

type nul > archivo1.txt
echo Archivo vacio creado con exito.

cd 

set /p "ruta = Escriba la ruta destino de archivo1.txt"
move archivo1.txt  %ruta%\archivo1.txt

echo ****************************************
echo * Eliminar archivo1.txt o anadir texto *
echo ****************************************
echo 1 Eliminar archivo1.txt 
echo 2 Anadir texto a archivo1.txt 

set /p opcion=Ingrese el nmero de la opcion deseada:
if %opcion% == "1"(
    rm archivo1.txt
) else if %opcion% == "2"(
    set texto=Texto que deseas anadir al archivo.

    echo %texto% >> %ruta%\archivo1.txt
) else (
    echo Opcion invalida. Ingrese un numero valido.
)
endlocal
    


