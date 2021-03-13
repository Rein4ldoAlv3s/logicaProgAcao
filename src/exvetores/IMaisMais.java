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
public class IMaisMais {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        System.out.println("Valor original: " + result);    //0
        result = num++; // Primeiro atribui, depois incrementa
        System.out.println("Valor de num após o incremento: " + num);   //11
        System.out.println("Valor de result após o incremento: " + result); //10
        num = 10; result = 0;
        result = ++num; // Primeiro incrementa, depois atribui
        System.out.println("Valor de num após o incremento: " + num); //11
        System.out.println("Valor de result após o incremento: " + result); //11
    }
}
