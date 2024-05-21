package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem{
    private int numChar;

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String msg) {
        return new MsgTexto();
    }
}
