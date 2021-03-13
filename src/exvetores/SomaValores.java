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
public class SomaValores {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int vetor[] = new int[10];
        
        for(int i=0; i<vetor.length; i++){
            System.out.printf("Informe %do. valor de %d: \n", i+1, vetor.length);
            vetor[i] = entrada.nextInt();
        }
        int soma=0;
        int maior=vetor[0];
        int menor=vetor[0];
        for(int j=0; j<vetor.length; j++){
            if(vetor[j] > maior){
                maior=vetor[j];
            } else if(vetor[j] < menor){
                menor=vetor[j];
            }
            soma+=vetor[j];
        }
        for(int k=0; k<vetor.length; k++){
            if(vetor[k] == maior){
                System.out.printf("v[%d] = %d <--- maior valor\n", k, vetor[k]);
            } else if(vetor[k] == menor){
                System.out.printf("v[%d] = %d <--- menor valor\n", k, vetor[k]);
            }
            else{
                System.out.printf("v[%d] = %d\n", k, vetor[k]);
            }
        }
        System.out.println("");
        System.out.println("Soma = " + soma);
    }
}
