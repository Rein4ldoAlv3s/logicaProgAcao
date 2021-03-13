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
public class Ex4D {
    public static void main(String[] args) {
        int k=9, n=1;
        for(int i=0; i<10; i++){
            for(int j=0; j<k; j++){
                System.out.print(" ");
            }
            k--;
            for(int m=0; m<n; m++){
                System.out.print("*");
            }
            System.out.println("");
            n++;
        }
    }
    
}
