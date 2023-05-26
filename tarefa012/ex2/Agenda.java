package ex2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public void save(Contato contato){
        contatos.add(contato);
    }

    public Contato findByNomeOrEmail(String valor){
        Contato contato = new Contato();

        for (Contato c: contatos) {
            if(c.getEmail().equals(valor)  || c.getNome().equals(valor) ){
                contato =  c;
            }
        }

        return contato;
    }

    public void deleteByNome(String nome){

        //Sem usar forEach, pois ele não permite remover um elemento da lista

        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equals(nome)){
                contatos.remove(contatos.get(i));
            }
        }
    }

    public List<Contato> findAll(){

        List<Contato> contatosList = new ArrayList<>();

        for (Contato c: contatos) {
            contatosList.add(c);
        }

        return contatosList;
    }

}
