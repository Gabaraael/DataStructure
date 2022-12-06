package dateStructure;

import java.util.Random;
import java.util.Scanner;

public class main {
    private static final Random r = new Random();

    public static void main(String... args) {
        String choice;

        do {
            exibeMenu();
            choice = new Scanner(System.in).nextLine().toLowerCase();
            switch (choice) {
                case ("a"):
                    System.out.println("------- BubbleSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + bubbleSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + bubbleSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + bubbleSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + bubbleSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + bubbleSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + bubbleSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + bubbleSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + bubbleSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + bubbleSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + bubbleSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + bubbleSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + bubbleSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("b"):
                    System.out.println("------- SelectionSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + selectionSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + selectionSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + selectionSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + selectionSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + selectionSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + selectionSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + selectionSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + selectionSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + selectionSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + selectionSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + selectionSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + selectionSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("c"):
                    System.out.println("------- InsertionSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + insertionSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + insertionSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + insertionSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + insertionSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + insertionSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + insertionSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + insertionSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + insertionSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + insertionSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + insertionSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + insertionSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + insertionSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("d"):
                    System.out.println("------- MergeSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + mergeSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + mergeSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + mergeSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + mergeSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + mergeSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + mergeSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + mergeSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + mergeSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + mergeSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + mergeSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + mergeSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + mergeSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("e"):
                    System.out.println("------- QuickSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + quickSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + quickSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + quickSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + quickSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + quickSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + quickSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + quickSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + quickSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + quickSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + quickSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + quickSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + quickSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("f"):
                    System.out.println("------- RadixSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + radixSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + radixSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + radixSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + radixSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + radixSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + radixSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + radixSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + radixSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + radixSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + radixSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + radixSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + radixSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("g"):
                    System.out.println("------- ShellSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + shellSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + shellSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + shellSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + shellSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + shellSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + shellSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + shellSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + shellSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + shellSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + shellSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + shellSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + shellSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("h"):
                    System.out.println("------- CountSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + countSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + countSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + countSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + countSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + countSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + countSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + countSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + countSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + countSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + countSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + countSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + countSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("i"):
                    System.out.println("------- HeapSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + heapSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + heapSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + heapSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + heapSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + heapSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + heapSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + heapSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + heapSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + heapSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + heapSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + heapSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + heapSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("j"):
                    System.out.println("------- BogoSort ------- ");
                    System.out.println("Melhor Caso - 1000 --------> " + bogoSort(vectorOrdainedAsc(1000)) + " segundos");
                    System.out.println("Melhor Caso - 10000 -------> " + bogoSort(vectorOrdainedAsc(10000)) + " segundos");
                    System.out.println("Melhor Caso - 50000 -------> " + bogoSort(vectorOrdainedAsc(50000)) + " segundos");
                    System.out.println("Melhor Caso - 1000000 -----> " + bogoSort(vectorOrdainedAsc(1000000)) + " segundos");

                    System.out.println("Caso médio  - 1000 --------> " + bogoSort(vectorRandom(1000)) + " segundos");
                    System.out.println("Caso médio  - 10000 -------> " + bogoSort(vectorRandom(10000)) + " segundos");
                    System.out.println("Caso médio  - 50000 -------> " + bogoSort(vectorRandom(50000)) + " segundos");
                    System.out.println("Caso médio  - 1000000 -----> " + bogoSort(vectorRandom(1000000)) + " segundos");

                    System.out.println("Pior Caso  - 1000 --------> " + bogoSort(vectorOrdainedDesc(1000)) + " segundos");
                    System.out.println("Pior Pior  - 10000 -------> " + bogoSort(vectorOrdainedDesc(10000)) + " segundos");
                    System.out.println("Pior Caso  - 50000 -------> " + bogoSort(vectorOrdainedDesc(50000)) + " segundos");
                    System.out.println("Pior Caso  - 1000000 -----> " + bogoSort(vectorOrdainedDesc(1000000)) + " segundos");
                    break;
                case ("k"):
                    System.out.println("Encerrando");
                    break;
            }
        } while (!choice.equals("k"));
    }

    static double bogoSort(Integer[] a)
    {
        Long time = System.nanoTime();
        while (isSorted(a) == false)
            shuffle(a);
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    private static void shuffle(Integer[] a)
    {
        for (int i = 0; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }

    private static void swap(Integer[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean isSorted(Integer[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    private static void heapify(Integer arr[], int size, int index){
            int  maximum = index;
            int leftChild = 2*index + 1;
            int rightChild = 2*index + 2;
            int swapper;

            if(leftChild < size && arr[leftChild] > arr[maximum]){
                maximum = leftChild;
            }
            if(rightChild < size && arr[rightChild] > arr[maximum]){
                maximum = rightChild;
            }

            if(maximum != index){
                swapper = arr[index];
                arr[index] = arr[maximum];
                arr[maximum] = swapper;
                heapify(arr,size,maximum);
            }
        }

       private static double heapSort(Integer array[]){
            Long time = System.nanoTime();
            int size = array.length;
            int swapper;

            int index = (size/2) - 1;
            while(index >=0){
                heapify(array,size,index);
                index--;
            }

            for(index = size -1; index > 0; index--){
                swapper = array[0];
                array[0] = array[index];
                array[index] = swapper;
                heapify(array,index, 0);
            }
           return ((System.nanoTime() - time) * Math.pow(10, -9));
        }


        static double countSort(Integer[] array) {
        Long time = System.nanoTime();
        int size = array.length;
        int[] output = new int[size + 1];

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    static Double shellSort(Integer[] vet) {
        Long time = System.nanoTime();
        int size = vet.length;
        int i , j , value;
        int gap = 1;
        while(gap < size) {
            gap = 3*gap+1;
        }
        while ( gap > 1) {
            gap /= 3;
            for(i = gap; i < size; i++) {
                value = vet[i];
                j = i - gap;
                while (j >= 0 && value < vet[j]) {
                    vet [j + gap] = vet[j];
                    j -= gap;
                }
                vet [j + gap] = value;
            }
        }
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

        private static void countingSort(Integer array[], int size, int place) {
            int[] output = new int[size + 1];
            int max = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            int[] count = new int[max + 1];

            for (int i = 0; i < max; ++i)
                count[i] = 0;

            for (int i = 0; i < size; i++)
                count[(array[i] / place) % 10]++;

            for (int i = 1; i < 10; i++)
                count[i] += count[i - 1];

            for (int i = size - 1; i >= 0; i--) {
                output[count[(array[i] / place) % 10] - 1] = array[i];
                count[(array[i] / place) % 10]--;
            }

            for (int i = 0; i < size; i++)
                array[i] = output[i];
        }
        private static int getMax(Integer array[], int n) {
            int max = array[0];
            for (int i = 1; i < n; i++)
                if (array[i] > max)
                    max = array[i];
            return max;
        }

        private static Double radixSort(Integer array[]) {
            Long time = System.nanoTime();
            int size = array.length;
            int max = getMax(array, size);

            for (int place = 1; max / place > 0; place *= 10)
                countingSort(array, size, place);

            return ((System.nanoTime() - time) * Math.pow(10, -9));
        }

    public static double quickSort(Integer[] a){
        Long time = System.nanoTime();
        sort(a, 0, a.length - 1);
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    public static int pivot(Integer[] a, int lo, int hi){
        int mid = (lo+hi)/2;
        int pivot = a[lo] + a[hi] + a[mid] - Math.min(Math.min(a[lo], a[hi]), a[mid]) - Math.max(Math.max(a[lo], a[hi]), a[mid]);

        if(pivot == a[lo])
            return lo;
        else if(pivot == a[hi])
            return hi;
        return mid;
    }

    public static int partition(Integer[] a, int lo, int hi){

        int k = pivot(a, lo, hi);
        swapPart(a, lo, k);
        //System.out.println(a);
        int j = hi + 1;
        int i = lo;
        while(true){

            while(a[lo] < a[--j])
                if(j==lo)   break;

            while(a[++i] < a[lo])
                if(i==hi) break;

            if(i >= j)  break;
            swap(a, i, j);
        }
        swapPart(a, lo, j);
        return j;
    }

    public static void sort(Integer[] a, int lo, int hi){
        if(hi<=lo)  return;
        int p = partition(a, lo, hi);
        sort(a, lo, p-1);
        sort(a, p+1, hi);
    }

    public static void swapPart(Integer[] a, int b, int c){
        int swap = a[b];
        a[b] = a[c];
        a[c] = swap;
    }



    private static double mergeSort(Integer[] vetor) {
        Long time = System.nanoTime();
        int tamanho = vetor.length;
        int elementos = 1;
        int inicio, meio, fim;

        while (elementos < tamanho) {
            inicio = 0;
            while (inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                if (fim > tamanho) fim = tamanho;

                intercala(vetor, inicio, meio, fim);
                inicio = fim;
            }

            elementos = elementos * 2;
        }
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    private static void intercala(Integer[] vetor, int inicio, int meio, int fim) {
        int novoVetor[] = new int[fim - inicio];
        int i = inicio;
        int m = meio;
        int pos = 0;
        while (i < meio && m < fim) {
            if (vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }
        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }

    private static Double insertionSort(Integer array[]) {
        int length = array.length;
        Long time = System.nanoTime();
        for (int j = 1; j < length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    private static Double selectionSort(Integer vector[]) {
        int length = vector.length;
        Long time = System.nanoTime();

        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++)
                if (vector[j] < vector[min]) min = j;

            Integer temp = vector[min];
            vector[min] = vector[i];
            vector[i] = temp;
        }
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    private static double bubbleSort(Integer[] vector) {
        int length = vector.length;
        int temp;
        Boolean ordained;
        Long time = System.nanoTime();
        for (int i = 0; i < length; i++) {
            ordained = true;
            for (int j = 1; j < (length - i); j++) {
                if (vector[j - 1] > vector[j]) {
                    temp = vector[j - 1];
                    vector[j - 1] = vector[j];
                    vector[j] = temp;
                    ordained = false;
                }
            }
            if (ordained == true) {
                return ((System.nanoTime() - time) * Math.pow(10, -9));
            }
        }
        return ((System.nanoTime() - time) * Math.pow(10, -9));
    }

    private static Integer[] vectorOrdainedAsc(Integer index) {
        Integer[] vector = new Integer[index];
        for (int i = 0; i < index; i++) {
            vector[i] = i;
        }
        return vector;
    }

    private static Integer[] vectorOrdainedDesc(Integer index) {
        Integer[] vector = new Integer[index];
        for (int i = 0; i < index; i++) {
            vector[i] = index - i;
        }
        return vector;
    }

    private static Integer[] vectorRandom(Integer index) {
        Integer[] vector = new Integer[index];
        for (int i = 0; i < index; i++) {
            vector[i] = r.nextInt(1000000);
        }
        return vector;
    }

    private static void exibeMenu() {
        System.out.println("1. Elabore o menu com as seguintes opções:");
        System.out.println("    a. Ordenar utilizando BubbleSort (melhorado)");
        System.out.println("    b. Ordenar utilizando SelectionSort");
        System.out.println("    c. Ordenar utilizando InsertionSort");
        System.out.println("    d. Ordenar utilizando MergeSort");
        System.out.println("    e. Ordenar utilizando QuickSort");
        System.out.println("    f. Ordenar utilizando RadixSort");
        System.out.println("    g. Ordenar utilizando ShellSort");
        System.out.println("    h. Ordenar utilizando CountSort");
        System.out.println("    i. Ordenar utilizando HeapSort");
        System.out.println("    j. Ordenar utilizando BogoSort");
        System.out.println("    k - sair");
    }
}


