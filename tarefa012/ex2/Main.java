package ex2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contato c1 = new Contato("Artur Rocha Lapot", "artur_lapot@discente.ufg.br");
        Contato c2 = new Contato("Henrique Martins", "henrique_martins@discente.ufg.br");
        Contato c3 = new Contato("João da Silva", "joao_da_silva@discente.ufg.br");
        Contato c4 = new Contato("Zé Gomes", "ze_gomes@discente.ufg.br");

        agenda.save(c1);
        agenda.save(c2);
        agenda.save(c3);
        agenda.save(c4);

        printaContatos(agenda);

        System.out.println("-----------------------------");

        agenda.deleteByNome("João da Silva");

        printaContatos(agenda);
    }

    public static void printaContatos(Agenda agenda){
        List<Contato> contatos = agenda.findAll();

        contatos.forEach(contato -> {
            System.out.println("Nome: " + contato.getNome() + " , Email: " + contato.getEmail());
        });
    }

}
