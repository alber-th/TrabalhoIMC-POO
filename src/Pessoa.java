/**
 * Classe base Pessoa que demonstra o conceito de ENCAPSULAMENTO
 * Todos os atributos são privados e acessados através get/set
 * 
 * @author Seu Nome
 * @version 1.0
 */
public class Pessoa {
    // ENCAPSULAMENTO: Atributos privados para proteger os dados
    private String nome;
    private double peso;  // em quilogramas
    private double altura; // em metros

    /**
     * Construtor da classe Pessoa
     * @param nome Nome da pessoa
     * @param peso Peso em kg
     * @param altura Altura em metros
     */
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    //GET para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    //SET para modificar os atributos privados
    // CONTROLE DE ACESSO no peso (não pode ser negativo)
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: O peso deve ser maior que zero!");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que zero!");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que calcula o IMC
     * Este método será SOBRESCRITO na classe Atleta
     * @return O valor do IMC calculado
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    /**
     * Exibir informações da pessoa
     */
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f\n", calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
    }

    /**
     * Auxiliar para classificar o IMC
     * @return String com a classificação do IMC
     */
    protected String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}