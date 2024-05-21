package edu.fatec.lp2.exercicio2;

public class Main {
    public static void main(String[] args) {
        Supermercado sup = new Supermercado();
        sup.setNome("Shibata");

        Produto p = new Produto(sup);
        p.setNome("Arroz");
        p.setPreco(15.00);
        p.setDescricao("Arroz Marca Fantastico");
        p.setDescontoMaximo(40);
        p.setUnidade("300");

        Produto g = new Produto(sup);
        g.setNome("Suco");
        g.setPreco(7.00);
        g.setDescricao("Suco de Uva 1.5L");
        g.setDescontoMaximo(50);
        g.setUnidade("900");

        ItemCompra item = new ItemCompra(p, 10);
        item.setQuantidade(2);

        ItemCompra item2 = new ItemCompra(g, 25);
        item2.setQuantidade(4);

        ListaCompra lista = new ListaCompra(20);
        lista.incluir(item);
        lista.incluir(item2);

        System.out.println("Preço Total: "+ lista.calcularPreco());
    }
}
