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
public class Ex4C {
    public static void main(String[] args) {
        int k=0, m=10;
        for(int i=0; i<10; i++){
            if(i>0){
                for(int j=0; j<=k; j++){
                    System.out.print(" ");
                }
                k++;
            }
            for(int l=0; l<m; l++){
                System.out.print("*");
            }
            System.out.println("");
            m--;
        }
    }
}
