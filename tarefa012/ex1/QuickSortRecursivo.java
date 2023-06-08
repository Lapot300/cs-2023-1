package ex1;

public class QuickSortRecursivo {

    static void ordena(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    static void quickSort(int[] vetor, int inicio, int fim) {
        if (fim > inicio) {
            int pivo = particiona(vetor, inicio, fim);
            quickSort(vetor, inicio, pivo - 1);
            quickSort(vetor, pivo + 1, fim);
        }
    }

    static int particiona(int[] vetor, int inicio, int fim) {
        int pivo, esq, dir = fim;
        esq = inicio + 1;
        pivo = vetor[inicio];

        while (esq <= dir) {
            while (esq <= dir && vetor[esq] <= pivo) {
                esq++;
            }

            while (dir >= esq && vetor[dir] > pivo) {
                dir--;
            }
            if (esq < dir) {
                troca(vetor, dir, esq);
                esq++;
                dir--;
            }
        }

        troca(vetor, inicio, dir);
        return dir;
    }

    static void troca(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}