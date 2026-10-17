# Gerenciador de Produtos

Projeto em Java que modela um produto com controle de estoque, aplicando orientação a objetos e testando casos-limite.

## Funcionalidades
- Classe `Produto` com nome, preço e quantidade em estoque
- Encapsulamento: atributos privados, com getters e setters
- Estoque que só é alterado por métodos de comportamento
- Adição de estoque, aceitando apenas quantidades maiores que zero
- Venda, validando quantidade positiva e estoque suficiente
- Exibição de um resumo com nome, preço e estoque

## Testes no `Main`
O `Main.java` executa uma sequência de cenários e mostra o resultado no terminal:
- **Positivos:** adicionar estoque e vender dentro do limite
- **Negativos:** venda acima do estoque, quantidades negativas
- **Extremos:** quantidade zero, venda de todo o estoque, valor máximo de `int`
- **Setters:** alteração de nome e preço

## Como executar
```bash
javac *.java
java Main
```

## Tecnologias
Java