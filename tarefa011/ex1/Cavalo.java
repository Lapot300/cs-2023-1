package ex1;

public class Cavalo extends Animal{

    public Cavalo(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Som do cavalo");
    }

    public void correr() {
        System.out.println("Cavalo correndo");
    }

}
