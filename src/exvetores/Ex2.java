/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exvetores;

/**
 *
 * @author naldo
 */
public class Ex2 {
    public static void main(String[] args) {
        int V1[] = new int[50];
        int V2[] = new int[50];
        for(int i=0; i<V1.length; i++){
            V1[i] = i+1;
        }
        
        int soma=0;
        for(int i=0; i<V1.length; i++){
            for(int j=1; j<=V1[i]; j++){
                if(V1[i]%j==0){
                    soma++;
                }
            }
            if(soma==2){
                V2[i]=V1[i];
                V1[i]=0;
            }
            soma=0;
        }
        
        System.out.println("Vetor V1");
        for(int i=0; i<V1.length; i++){
            if(V1[i] != 0){
                System.out.printf("V1[%d] = %d\n", i, V1[i]);
            }
        }
        System.out.println("Vetor V2");
        for(int i=0; i<50; i++){
            if(V2[i] != 0){
                System.out.printf("V2[%d] = %d\n", i ,V2[i]);
            }
        }
        
    }
}
