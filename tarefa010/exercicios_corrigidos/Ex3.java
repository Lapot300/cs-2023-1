package br.ufg.inf;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex3 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ex3.class.getName());

        Scanner sc = new Scanner(System.in);

        float saldo = sc.nextFloat();

        logger.log(Level.INFO, "Valor com reajuste: {0}", (1.15F * saldo));
    }

}
