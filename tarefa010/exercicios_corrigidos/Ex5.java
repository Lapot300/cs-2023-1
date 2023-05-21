package br.ufg.inf;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex5 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ex5.class.getName());

        Scanner sc = new Scanner(System.in);

        float salarioMinimo = sc.nextFloat();

        float salarioUsuario = sc.nextFloat();

        logger.log(Level.INFO, "{0}", String.valueOf(salarioUsuario/salarioMinimo));
    }
}
