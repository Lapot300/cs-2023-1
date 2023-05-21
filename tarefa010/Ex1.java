package br.ufg.inf;

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anos = sc.nextInt();
        int meses = sc.nextInt();
        int dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println(totalDias);
    }
}