@echo off
echo Calculadora
echo 1. Sumar dos números
echo 2. Restar dos números
echo 3. Multiplicar dos números
set /p opcion = "Seleccione una opcion (1-3):"

set /p numero1 = "Ingrese el primer numero: "
set /p numero2 = "Ingrese el segundo numero: "

if "%opcion%" == "1"(
    set /a resultado = numero1 + numero2
    echo La suma de los numeros(%numero1% y %numero2%) es: %resultado%
) else if "%opcion%" == "2"(
    set /a resultado= numero1 - numero2
    echo La resta de los numeros(%numero1% y %numero2%) es: %resultado%
) else if "%opcion%" == "3"(
    set /a resultado = numero1*numero2
    echo La multiplicacion de %numero1% por %numero2% es: %resultado%
) else (
    echo Opcion valida
)