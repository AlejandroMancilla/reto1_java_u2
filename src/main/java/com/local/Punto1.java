package com.local;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistema = true;
        do{
            System.out.println("=== SUMA DE MULTIPLOS 3-5 ===");
            System.out.println("Ingrese un numero entero positivo o (0) para Salir: ");
            int n = entrada.nextInt();
            if(n == 0){
                sistema = false;
                break;
            }
            int suma = 0;
            for (int i = 0; i < n; i++) {
                if(i % 3 == 0 || i % 5 == 0){
                    suma += i;
                }
            }
            System.out.println("La suma de los numeros entre 0 - " + n + " es " + suma);
        }while(sistema);
        entrada.close();
    }
}