package br.ufg.inf;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Ex2.class.getName());

        logger.log(Level.INFO,"Média aritmética dos números 8,9 e 7 ");
        int media1 = ((8+9+7)/3);
        String imprime = String.valueOf(media1);
        logger.log(Level.INFO, imprime);

        logger.log(Level.INFO,"Média aritmética dos números 4,5 e 6 ");
        int media2 = ((4+5+6)/3);
        imprime = String.valueOf(media2);
        logger.log(Level.INFO, imprime);

        logger.log(Level.INFO,"Soma das duas médias");
        imprime = String.valueOf(media1 + media2);
        logger.log(Level.INFO, imprime);

        logger.log(Level.INFO,"Média das médias");
        imprime = String.valueOf((media1+media2)/2);
        logger.log(Level.INFO, imprime);
    }
}
