public class Produto {

    // Atributos privados (encapsulamento)
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor: estoque sempre inicia em 0
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Apenas Getter: o estoque só muda via métodos de comportamento
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Métodos de comportamento
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0 || quantidade > this.quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente para a venda.");
        } else {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidade(s).");
        }
    }

    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Em estoque: " + quantidadeEmEstoque);
    }
}