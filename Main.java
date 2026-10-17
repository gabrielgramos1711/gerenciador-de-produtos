public class Main {

    public static void main(String[] args) {
        Produto p = new Produto("Teclado Mecânico", 249.90);

        System.out.println("=== Estado inicial (estoque deve ser 0) ===");
        p.exibirResumo();

        System.out.println("\n=== CASOS POSITIVOS ===");
        p.adicionarEstoque(10);          // estoque = 10
        p.vender(4);                     // estoque = 6
        p.exibirResumo();

        System.out.println("\n=== CASOS NEGATIVOS ===");
        p.vender(50);                    // maior que o estoque
        p.adicionarEstoque(-5);          // quantidade negativa
        p.vender(-2);                    // venda negativa
        p.exibirResumo();                // estoque continua 6

        System.out.println("\n=== CASOS EXTREMOS ===");
        p.adicionarEstoque(0);           // zero não é permitido
        p.vender(0);                     // venda de zero é inválida
        p.vender(6);                     // vende exatamente todo o estoque -> 0
        p.vender(1);                     // estoque zerado, deve falhar
        p.adicionarEstoque(Integer.MAX_VALUE); // valor muito alto
        p.exibirResumo();

        System.out.println("\n=== Testando Setters ===");
        p.setNome("Teclado Gamer");
        p.setPreco(299.99);
        p.exibirResumo();
    }
}