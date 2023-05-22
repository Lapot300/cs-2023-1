package ex1;

public class Cachorro extends Animal{

    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Som do cachorro");
    }

    public void correr() {
        System.out.println("Cachorro correndo");
    }

}
