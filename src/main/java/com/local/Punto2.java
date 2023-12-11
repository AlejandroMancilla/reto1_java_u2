package com.local;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistema = true;
        do{
            System.out.println("=== VALIDAR CLAVE ===");
            System.out.println("Ingrese una clave o (S) para Salir: ");
            String n = entrada.nextLine();
            if(n.toLowerCase().equals("s")){
                sistema = false;
                break;
            } 
            char[] clave = n.toCharArray();
            boolean mayus = false;
            boolean minus = false;
            boolean num = false;
            boolean charEspecial = false;

            if(n.length() >= 8){
                for (int i = 0; i < clave.length; i++) {
                    if(clave[i] >= 65 && clave[i] <= 90){
                        mayus = true;
                    }
                    if(clave[i] >= 97 && clave[i] <= 122){
                        minus = true;
                    }
                    if(clave[i] >= 48 && clave[i] <= 57){
                        num = true;
                    }
                    if(clave[i] == 33
                    || clave[i] == 64
                    || clave[i] == 35
                    || clave[i] == 36
                    || clave[i] == 37
                    || clave[i] == 94
                    || clave[i] == 38
                    || clave[i] == 42
                    ){
                        charEspecial = true;
                    }
                }

                if(!mayus) System.out.println("No posee mayuscula");
                if(!minus) System.out.println("No posee minusculas"); 
                if(!num) System.out.println("No posee numeros"); 
                if(!charEspecial) System.out.println("No posee un caracter especial: !, @, #, $, %, ^, &, *"); 
                if(mayus && minus && num && charEspecial) System.out.println("Clave valida");
            } else {
                System.out.println("Longitud invalida > 8 caracteres.");
            }
        }while(sistema);
        entrada.close();
    }
}
