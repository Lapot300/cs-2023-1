package br.ufg.inf;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salarioMinimo = sc.nextFloat();

        float salarioUsuario = sc.nextFloat();

        System.out.println(salarioUsuario/salarioMinimo);
    }
}
