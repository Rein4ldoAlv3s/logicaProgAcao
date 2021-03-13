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
public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notas[] = new int[20];
        int notas1=0, notas2=0, notas3=0, notas4=0, notas5=0;
        System.out.println("Informe notas entre 1 a 5");
        for(int i=0; i<notas.length; i++){
            do {                
                System.out.printf("%d° nota: ", i+1);
                notas[i] = entrada.nextInt();
            } while (notas[i] < 0 || notas[i] > 5);
            
            if(notas[i] == 1){
                notas1++;
            }else if(notas[i] == 2){
                notas2++;
            }else if(notas[i] == 3){
                notas3++;
            }else if(notas[i] == 4){
                notas4++;
            }else {
                notas5++;
            }
        }
        System.out.println("Quantidade de notas 1: " + notas1);
        System.out.println("Quantidade de notas 2: " + notas2);
        System.out.println("Quantidade de notas 3: " + notas3);
        System.out.println("Quantidade de notas 4: " + notas4);
        System.out.println("Quantidade de notas 5: " + notas5);
        float porc4 = (float) (notas4/20.0*100);
        float porc5 = (float) (notas5/20.0*100);
        System.out.printf("Porcentagem de notas 4: %.2f %%\n", porc4);
        System.out.printf("Porcentagem de notas 5: %.2f %%\n", porc5);
        
    }
}
