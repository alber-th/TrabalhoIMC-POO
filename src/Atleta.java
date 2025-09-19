/**
 * Classe Atleta que demonstra os conceitos de HERANÇA e POLIMORFISMO
 * Herda da classe Pessoa e sobrescreve o método calcularIMC()
 * 
 * @author Seu Nome
 * @version 1.0
 */
public class Atleta extends Pessoa { // HERANÇA: extends Pessoa
    // Atributo específico da classe Atleta
    private String esportePraticado;

    /**
     * Construtor da classe Atleta
     * @param nome Nome do atleta
     * @param peso Peso em kg
     * @param altura Altura em metros
     * @param esportePraticado Esporte que o atleta pratica
     */
    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura); // Chama o construtor da classe pai (Pessoa)
        this.esportePraticado = esportePraticado;
    }

    // ENCAPSULAMENTO: Métodos get e set para o novo atributo
    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    /**
     * POLIMORFISMO: Sobrescreve o método calcularIMC() da classe Pessoa
     * Para atletas de alto rendimento, o IMC é reduzido em 5%
     * @return O valor do IMC ajustado para atletas
     */
    @Override
    public double calcularIMC() {
        // Calcula o IMC normal usando o método da classe pai
        double imcNormal = super.calcularIMC();

        // Aplica a redução de 5% para atletas de alto rendimento
        double imcAjustado = imcNormal * 0.95; // Reduz 5%

        return imcAjustado;
    }

    /**
     * Sobrescreve o método exibirInformacoes() para incluir o esporte
     */
    @Override
    public void exibirInformacoes() {
        System.out.println("=== ATLETA ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Altura: " + getAltura() + " m");
        System.out.println("Esporte: " + esportePraticado);

        // Mostra o IMC normal (sem ajuste) e o IMC do atleta (com ajuste)
        double imcNormal = super.calcularIMC();
        double imcAtleta = calcularIMC();

        System.out.printf("IMC Normal: %.2f\n", imcNormal);
        System.out.printf("IMC Atleta (ajustado -5%%): %.2f\n", imcAtleta);
        System.out.println("Classificação: " + classificarIMC());
    }

    /**
     * Método específico para atletas
     * @return Informação sobre o ajuste do IMC
     */
    public String explicarAjusteIMC() {
        return "Como atleta de alto rendimento, o IMC foi reduzido em 5% devido à maior massa muscular.";
    }
}