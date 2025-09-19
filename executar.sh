#!/bin/bash
echo "================================================"
echo "     TRABALHO POO - CALCULADORA DE IMC"
echo "================================================"
echo
echo "Compilando arquivos Java..."
javac src/*.java

if [ $? -ne 0 ]; then
    echo "ERRO na compilação!"
    exit 1
fi

echo "Compilação bem-sucedida!"
echo
echo "Executando programa..."
echo "================================================"
java -cp src CalculadoraIMC
echo "================================================"
echo
echo "Programa finalizado!"
