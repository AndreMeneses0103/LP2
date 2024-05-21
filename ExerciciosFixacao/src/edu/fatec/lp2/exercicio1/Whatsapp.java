package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;

public class Whatsapp {
    private ArrayList<Contatinho> contatos;
    private ArrayList<Mensagem> mensagens;

    public Whatsapp(ArrayList<Contatinho> contatos, ArrayList<Mensagem> mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public void listarContatos(){
        for(Contatinho contato: contatos){
            System.out.println("Contato: "+contato);
        }
    }

    public void listarMensagens(){
        for(Mensagem msg: mensagens){
            System.out.println("Mensagem: "+msg);
        }
    }

    public ArrayList<Contatinho> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contatinho> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}
