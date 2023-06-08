package ex1;

public class Preguica extends Animal{

    public Preguica(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Som da preguiça");
    }

    public void subirEmArvore(){
        System.out.println("Subindo em arvore");
    }

}
