package br.ufg.inf;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("Média aritmética dos números 8,9 e 7 ");
        int media1 = ((8+9+7)/3);
        System.out.println(media1);

        System.out.println("Média aritmética dos números 4,5 e 6 ");
        int media2 = ((4+5+6)/3);
        System.out.println(media2);

        System.out.println("Soma das duas médias");
        System.out.println(media1 + media2);

        System.out.println("Média das médias");
        System.out.println((media1 + media2) / 2);
    }
}
