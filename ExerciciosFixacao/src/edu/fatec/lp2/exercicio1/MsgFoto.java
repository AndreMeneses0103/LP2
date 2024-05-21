package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem{
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String msg) {
        return new MsgFoto();
    }
}
