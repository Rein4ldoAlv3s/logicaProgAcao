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
public class Ex4B {
    public static void main(String[] args) {
        int k=10;
        for(int i=0; i<10; i++){
            for(int j=0; j<k; j++){
                System.out.print("*");
            }
            k--;
            System.out.println("");
        }
    }
}
