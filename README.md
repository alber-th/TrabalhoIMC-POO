# Trabalho de Programação Orientada a Objetos (POO)
## Calculadora de IMC - Demonstração dos Pilares da POO

### 📋 Descrição do Projeto
Este projeto implementa uma calculadora de IMC (Índice de Massa Corporal) demonstrando os três pilares fundamentais da Programação Orientada a Objetos:

1. **Encapsulamento** - Proteção de dados através de atributos privados
2. **Herança** - Reutilização de código através da classe Atleta que herda de Pessoa
3. **Polimorfismo** - Comportamentos diferentes para o mesmo método

### 🏗️ Estrutura do Projeto
```
TrabalhoIMC_POO/
├── src/
│   ├── Pessoa.java          # Classe base
│   ├── Atleta.java          # Classe filha (herda de Pessoa)
│   └── CalculadoraIMC.java  # Classe principal
└── README.md                # Este arquivo

```

### 🔧 Como Compilar e Executar Geral

#### Pré-requisitos:
- Java Development Kit (JDK) 8 ou superior
- Terminal/Prompt de comando

#### Passos:

1. **Navegue até a pasta do projeto:**
   ```bash
   cd TrabalhoIMC_POO
   ```

2. **Compile os arquivos Java:**
   ```bash
   javac src/*.java
   ```

3. **Execute o programa:**
   ```bash
   java -cp src CalculadoraIMC
   ```

### 📊 Exemplo de Saída
O programa criará exemplos de pessoas comuns e atletas, mostrando:
- Cálculo do IMC normal
- Cálculo do IMC ajustado para atletas (-5%)
- Demonstração de polimorfismo com array de objetos
- Explicação dos conceitos de POO aplicados

### 🎯 Objetivos Alcançados
- ✅ Classe Pessoa com encapsulamento
- ✅ Método calcularIMC() na classe base
- ✅ Classe Atleta herdando de Pessoa
- ✅ Atributo esportePraticado em Atleta
- ✅ Sobrescrita do método calcularIMC() com redução de 5%
- ✅ Demonstração de polimorfismo
- ✅ Controle de acesso nos atributos
- ✅ Comentários explicativos no código



#
