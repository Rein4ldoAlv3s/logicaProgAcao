/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exvetores;

import java.util.Scanner;

/**
 *
 * @author naldo
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        
        int j=0;
        System.out.println("Informe números maiores ou igual a 10 e 100 distintos:");
        for(int i=0; i<numeros.length; i++){
            numeros[i] = entrada.nextInt();
            while(numeros[i]<10 || numeros[i]>100){
                System.out.println("Entrada inválida. Informe um número >=10 e <=100");
                numeros[i] = entrada.nextInt();
            }
            if(i>0){
                while(j<i){
                    if(numeros[i] == numeros[j] || numeros[i]<10 || numeros[i]>100){
                        System.out.println("Informe um número distinto dos anteriores e >=10 e <=100");
                            numeros[i] = entrada.nextInt();
                            j=0;
                    } else {
                        j++;
                    }
                }
                j=0;
            }
        }
        System.out.print("Os números inseridos são: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+ " ");
        }
        System.out.println("");
    }
    
}
