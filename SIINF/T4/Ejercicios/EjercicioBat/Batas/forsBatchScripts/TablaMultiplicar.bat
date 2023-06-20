@echo off
cls
setlocal enabledelayedexpansion

rem En la variable num guardo que tabla de multiplicar quiero ver
set /p num=Quieres ver la tabla de multiplicar del numero...
cls

echo TABLA DEL %num%
echo ===============
echo .

for /L %%a in (1,1,10) do (
  set /a result=%num%*%%a
  echo %num% * %%a = !result!
)