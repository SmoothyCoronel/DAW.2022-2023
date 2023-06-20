REM Para extraer las distintas partes de la fecha utilizamos el siguiente ejemplo (dentro de un archivo BAT):

for /F "tokens=1-3 delims=/:" %%a in (%date%) do (
  echo Hoy es %%a del mes %%b del año %%c
)

REM Hoy es 20 del mes 06 del año 2023