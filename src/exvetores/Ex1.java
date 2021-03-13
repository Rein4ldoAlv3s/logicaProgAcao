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
public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int notas[] = new int[20];
        int soma09=0, soma19=0, soma29=0, soma39=0, soma49=0, soma59=0,
            soma69=0, soma79=0, soma89=0, soma99=0, soma100=0;
        
        for(int i=0; i<notas.length; i++){
            do {
                if(notas[i]>100 || notas[i]<0){
                    System.out.println("Nota inválida");
                }
                System.out.printf("%d° nota: ", i+1);
                notas[i] = entrada.nextInt();
            } while (notas[i]>100 || notas[i]<0);
            
            if(notas[i] <= 9){
                soma09++;
            } else if(notas[i] <= 19){
                soma19++;
            } else if(notas[i] <= 29){
                soma29++;
            } else if(notas[i] <= 39){
                soma39++;
            } else if(notas[i] <= 49){
                soma49++;
            } else if(notas[i] <= 59){
                soma59++;
            } else if(notas[i] <= 69){
                soma69++;
            } else if(notas[i] <= 79){
                soma79++;
            } else if(notas[i] <= 89){
                soma89++;
            } else if(notas[i] <= 99){
                soma99++;
            } else {
                soma100++;
            }
        }
        System.out.println("***Quantidade de notas***");
        System.out.printf("00–09: %d\n10-19: %d\n20-29: %d\n30-39: %d\n"
                + "40-49: %d\n50-59: %d\n60-69: %d\n70-79: %d\n80-89: %d\n"
                + "90-99: %d\n100: %d\n", soma09, soma19, soma29, soma39, soma49, soma59,
            soma69, soma79, soma89, soma99, soma100);
        
    }
}
