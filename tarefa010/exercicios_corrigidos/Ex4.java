package br.ufg.inf;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex4 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ex4.class.getName());

        Scanner sc = new Scanner(System.in);

        Peca p1 = new Peca();
        Peca p2 = new Peca();

        float ipi = sc.nextFloat();

        p1.codigo = sc.nextInt();
        p1.valor = sc.nextFloat();
        p1.quantidade = sc.nextInt();

        p2.codigo = sc.nextInt();
        p2.valor = sc.nextFloat();
        p2.quantidade = sc.nextInt();

        String resultado = String.valueOf(((p1.valor * p1.quantidade + p2.valor * p2.quantidade) * (ipi/100 + 1)));

        logger.log(Level.INFO, "Valor: {0}", resultado);
    }

}
class Peca{
    Integer codigo;
    Float valor;
    Integer quantidade;
}