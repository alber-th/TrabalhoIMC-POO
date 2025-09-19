
public class CalculadoraIMC {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("    CALCULADORA DE IMC - TRABALHO POO");
        System.out.println("==============================================\n");

        // Criando uma pessoa comum
        System.out.println("1. Criando uma PESSOA COMUM:");
        System.out.println("-----------------------------");
        Pessoa pessoa = new Pessoa("Maria Silva", 65.0, 1.65);
        pessoa.exibirInformacoes();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Criando um atleta
        System.out.println("2. Criando um ATLETA:");
        System.out.println("----------------------");
        Atleta atleta = new Atleta("João Santos", 80.0, 1.75, "Natação");
        atleta.exibirInformacoes();
        System.out.println("\nExplicação: " + atleta.explicarAjusteIMC());

        System.out.println("\n" + "=".repeat(50) + "\n");

        // DEMONSTRANDO POLIMORFISMO
        System.out.println("3. DEMONSTRAÇÃO DE POLIMORFISMO:");
        System.out.println("---------------------------------");
        System.out.println("Usando uma referência do tipo Pessoa para armazenar objetos diferentes:");
        System.out.println();

        // Array de Pessoas (demonstra polimorfismo)
        Pessoa[] pessoas = {
            new Pessoa("Ana Costa", 55.0, 1.60),
            new Atleta("Carlos Lima", 75.0, 1.80, "Futebol"),
            new Pessoa("Pedro Oliveira", 90.0, 1.70),
            new Atleta("Sofia Martins", 60.0, 1.68, "Corrida")
        };

        // POLIMORFISMO com o método correto chamado automaticamente
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            // Aqui acontece o POLIMORFISMO!
            // Se for Pessoa, usa calcularIMC() da classe Pessoa
            // Se for Atleta, usa calcularIMC() da classe Atleta (sobrescrito)
            pessoas[i].exibirInformacoes();

            // Verificando o tipo específico do objeto
            if (pessoas[i] instanceof Atleta) {
                System.out.println("✓ Este é um atleta - IMC foi ajustado!");
            } else {
                System.out.println("✓ Esta é uma pessoa comum - IMC normal");
            }

            System.out.println("-".repeat(30));
        }

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Demonstração dos conceitos de POO
        System.out.println("4. CONCEITOS DE POO APLICADOS:");
        System.out.println("-------------------------------");
        System.out.println("✓ ENCAPSULAMENTO:");
        System.out.println("  - Atributos privados (nome, peso, altura)");
        System.out.println("  - Acesso controlado através de métodos get/set");
        System.out.println("  - Validação no método setPeso()");
        System.out.println();

        System.out.println("✓ HERANÇA:");
        System.out.println("  - Atleta herda de Pessoa (extends)");
        System.out.println("  - Reutiliza código da classe pai");
        System.out.println("  - Adiciona comportamento específico");
        System.out.println();

        System.out.println("✓ POLIMORFISMO:");
        System.out.println("  - Método calcularIMC() comporta-se diferente");
        System.out.println("  - Pessoa: IMC normal");
        System.out.println("  - Atleta: IMC reduzido em 5%");
        System.out.println("  - Mesmo método, comportamentos diferentes!");

        System.out.println("\n==============================================");
        System.out.println("         TRABALHO CONCLUÍDO COM SUCESSO!");
        System.out.println("==============================================");
    }
}