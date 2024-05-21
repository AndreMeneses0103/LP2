package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel{
    private ItemCompra[] itensCompra;
    private int qtdeMax;

    private int qtdeAtual;

    public ListaCompra(int qtdeMax) {
        this.itensCompra = new ItemCompra[qtdeMax];
        this.qtdeMax = qtdeMax;
        this.qtdeAtual = 0;
    }

    public void incluir(ItemCompra item){
        if(qtdeAtual < qtdeMax){
            itensCompra[qtdeAtual] = item;
            qtdeAtual++;
        }else{
            System.out.println("Máximo de compras atingido.");
        }
    }

    @Override
    public double calcularPreco() {
        double precototal = 0;
        for(int x = 0; x < qtdeAtual; x++){
            precototal += (itensCompra[x].getProduto().getPreco() - itensCompra[x].calcularPreco())*itensCompra[x].getQuantidade();
        }
        return precototal;
    }
}
