package com.local;

public class Punto4 {
    public static void main(String[] args) {
/*
El codigo proporcionado es el algoritmo de fibonnaci
realizado en python, el algoritmo de fibonnaci consiste en la suma de los dos anteriores valores ejemplo de secuencia: 0,1,1,2,3,5,8,13
*/

        // ALGORITMO EQUIVALENTE
        int a = 0, b = 1, temp;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }

    }
}
