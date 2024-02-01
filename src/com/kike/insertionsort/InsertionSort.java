package com.kike.insertionsort;

public class InsertionSort {

    // Función para ordenar un array utilizando el algoritmo de Insertion Sort
    public static void insertionSort(int arr[]) {
        int n = arr.length;

        // Iteramos a través de todos los elementos del array
        for (int i = 1; i < n; i++) {
            // Tomamos el elemento actual para comparar
            int elementoActual = arr[i];
            int j = i - 1;

            // Movemos los elementos del array que son mayores que la clave
            // hacia adelante para crear espacio para el elemento clave
            while (j >= 0 && arr[j] > elementoActual) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Colocamos la clave en su posición correcta en el array ordenado
            arr[j + 1] = elementoActual;
        }
    }

    // Función de utilidad para imprimir un array
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Método principal para probar el algoritmo
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        int n = arr.length;

        System.out.println("Array original:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Array ordenado:");
        printArray(arr);
    }
}
