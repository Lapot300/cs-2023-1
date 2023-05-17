package br.ufg.inf;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldo = sc.nextFloat();

        System.out.println("Valor com reajuste: " + (1.15F * saldo));
    }

}
