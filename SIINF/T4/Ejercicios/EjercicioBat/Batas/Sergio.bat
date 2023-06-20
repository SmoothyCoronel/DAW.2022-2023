@echo off

REM Redirigir a un directorio específico
set "directorio=C:\Users\Felipe\Desktop"
cd /d %directorio%

REM Crear archivo con los nombres de los días de la semana
echo Lunes > dias_semana.txt
echo Martes >> dias_semana.txt
echo Miércoles >> dias_semana.txt
echo Jueves >> dias_semana.txt
echo Viernes >> dias_semana.txt
echo Sábado >> dias_semana.txt
echo Domingo >> dias_semana.txt

REM Mostrar contenido del archivo
type dias_semana.txt

REM Abrir el explorador de archivos
explorer %directorio%

REM Pausar para que puedas ver el resultado antes de que la ventana se cierre
pause