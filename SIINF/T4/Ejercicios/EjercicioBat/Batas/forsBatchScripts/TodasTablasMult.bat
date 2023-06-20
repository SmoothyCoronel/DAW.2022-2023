@echo off
cls
setlocal enabledelayedexpansion

for /L %%i in (1,1,10) do (

echo TABLA DEL %%i
echo ===============
echo .

    for /L %%a in (1,1,10) do (
      set /a result=%%i*%%a
      echo %%i * %%a = !result!

    )
    pause
    cls
)