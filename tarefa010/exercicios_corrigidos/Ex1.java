package br.ufg.inf;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1{
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ex1.class.getName());

        Scanner sc = new Scanner(System.in);

        int anos = sc.nextInt();
        int meses = sc.nextInt();
        int dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        String resultado = String.valueOf(totalDias);

        logger.log(Level.INFO, resultado);
    }
}