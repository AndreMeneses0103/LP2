package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contatinho> contatos = new ArrayList<>();

        Contatinho cont = new Contatinho();
        cont.setNome("Bia");
        cont.setCelular("12 99999-9999");

        Contatinho cont2 = new Contatinho();
        cont.setNome("Filipe");
        cont.setCelular("12 11111-1111");

        contatos.add(cont);
        contatos.add(cont2);

        ArrayList<Mensagem> mensagens = new ArrayList<>();

        Mensagem msg1 = new MsgTexto();
        msg1.setHoraEnvio("12:00");
        msg1.setDestinatario(cont);
        msg1.setConteudo("Fala ai, beleza?");
        msg1.sendMessage("Fala ai, beleza?");

        Mensagem msg2 = new MsgFoto();
        msg2.setHoraEnvio("2:00");
        msg2.setDestinatario(cont2);
        msg2.setConteudo("Como vão as coisas?");
        msg2.sendMessage("Como vão as coisas?");

        mensagens.add(msg1);
        mensagens.add(msg2);

        Whatsapp wp = new Whatsapp(contatos, mensagens);
        wp.listarContatos();
        System.out.println("--------------");
        wp.listarMensagens();
    }
}