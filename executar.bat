@echo off
echo ================================================
echo     TRABALHO POO - CALCULADORA DE IMC
echo ================================================
echo.
echo Compilando arquivos Java...
javac src/*.java

if errorlevel 1 (
    echo ERRO na compilacao!
    pause
    exit
)

echo Compilacao bem-sucedida!
echo.
echo Executando programa...
echo ================================================
java -cp src CalculadoraIMC
echo ================================================
echo.
echo Programa finalizado!
pause
