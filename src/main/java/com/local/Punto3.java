package com.local;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistema = true;
        boolean mayus = false;
        boolean minus = false;
        boolean simbolo = false;
        int opc;
        do{
            System.out.println("=== GENERAR CLAVE ===");
            System.out.println("Ingrese longitud 8-16 o (0) para Salir: ");
            int len = entrada.nextInt();
            if(len >= 8 && len <= 16){
                char[] clave = new char[len];
                System.out.println("Letras mayusculas: 0. No | 1. Si");
                opc = entrada.nextInt();
                if(opc >= 0 && opc <= 1){
                    mayus = (opc == 1);
                    System.out.println("Letras minusculas: 0. No | 1. Si");
                    opc = entrada.nextInt();
                    if(opc >= 0 && opc <= 1){
                        minus = (opc == 1);
                        System.out.println("Simbolos: 0. No | 1. Si");
                        opc = entrada.nextInt();
                        if(opc >= 0 && opc <= 1){
                            simbolo = (opc == 1);
                            if(!mayus && !minus && !simbolo){
                                System.out.println("No es posible generar una clave");
                            } else {
                                for (int i = 0; i < clave.length; i++) {
                                    int rand =  (int) (Math.random() * 3);
                                    switch (rand) {
                                        case 0:
                                            //  Random minusculas
                                            if(minus){
                                                rand =  (int) (Math.random() * 26);
                                                char letra = (char) (97 + rand);
                                                clave[i] = letra;
                                                break;
                                            }
                                        case 1:
                                            // Random mayusculas
                                            if(mayus){
                                                rand =  (int) (Math.random() * 26);
                                                char letra = (char) (65 + rand);
                                                clave[i] = letra;
                                                break;
                                            }
                                        case 2:
                                            // Random mayusculas
                                            if(simbolo){
                                                char[] simbolos = {33, 64, 35, 36, 37, 94, 38, 42};
                                                rand =  (int) (Math.random() * simbolos.length);
                                                clave[i] = simbolos[rand]; 
                                                break;
                                            }
                                        default:
                                            if(minus){
                                                rand =  (int) (Math.random() * 26);
                                                char letra = (char) (97 + rand);
                                                clave[i] = letra;
                                                break;
                                            }
                                            if(mayus){
                                                rand =  (int) (Math.random() * 26);
                                                char letra = (char) (65 + rand);
                                                clave[i] = letra;
                                                break;
                                            }
                                            break;
                                    }
                            }
                                System.out.println(String.valueOf(clave));
                            }
                        } else {
                            System.out.println("Ingrese una opcion valida.");
                        }
                    } else {
                        System.out.println("Ingrese una opcion valida.");
                    }
                } else {
                    System.out.println("Ingrese una opcion valida.");
                }
            } else if(len == 0){
                sistema = false;
                break;
            } else {
                System.out.println("Ingrese una longitud valida.");
            }
        }while(sistema);
        entrada.close();
    }
}
