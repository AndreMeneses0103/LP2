package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem{
    private int duracao;

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String msg) {
        return new MsgAudio();
    }
}
