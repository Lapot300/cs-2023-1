package br.ufg.inf;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex6 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ex6.class.getName());

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        logger.log(Level.INFO, "Antecessor: {0}", (numero - 1));
        logger.log(Level.INFO, "Sucessor: {0}", (numero + 1));
    }

}
