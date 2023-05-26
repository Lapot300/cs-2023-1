package ex1;

public class QuickSortIterativo {

    static int particiona(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];

        int i = (inicio - 1);
        for (int j = inicio; j <= fim - 1; j++) {
            if (vetor[j] <= pivot) {
                i++;

                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }
    static void quickSort(int[] vetor, int inicio, int fim) {
        int[] pilha = new int[fim - inicio + 1];

        int top = -1;

        pilha[++top] = inicio;
        pilha[++top] = fim;

        while (top >= 0) {
            fim = pilha[top--];
            inicio = pilha[top--];

            int p = particiona(vetor, inicio, fim);

            if (p - 1 > inicio) {
                pilha[++top] = inicio;
                pilha[++top] = p - 1;
            }

            if (p + 1 < fim) {
                pilha[++top] = p + 1;
                pilha[++top] = fim;
            }
        }
    }

}
