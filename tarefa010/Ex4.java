package br.ufg.inf;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Peca p1 = new Peca();
        Peca p2 = new Peca();

        float IPI = sc.nextFloat();

        p1.codigo = sc.nextInt();
        p1.valor = sc.nextFloat();
        p1.quantidade = sc.nextInt();

        p2.codigo = sc.nextInt();
        p2.valor = sc.nextFloat();
        p2.quantidade = sc.nextInt();

        System.out.println("Valor: " + ((p1.valor * p1.quantidade + p2.valor * p2.quantidade) * (IPI/100 + 1)));
    }

}
class Peca{
    Integer codigo;
    Float valor;
    Integer quantidade;
}