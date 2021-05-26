package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {

        int vetor[] = {3, 5, 6, 2, 1, 4};
        int aux;
        boolean control;

        for (int i = 0; i < vetor.length; ++i) {
            for (int j = 0; j < (vetor.length - 1); ++j) {

                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "");
        }
    }

}
