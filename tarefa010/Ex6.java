package br.ufg.inf;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        System.out.println("Antecessor:" + (numero - 1));
        System.out.println("Sucessor:" + (numero + 1));
    }

}
