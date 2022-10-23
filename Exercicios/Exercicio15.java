/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio15;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um número:");
        int maximo = in.nextInt();
        int cont = 1;
        do{
            System.out.println(cont);
            cont++;
        } while(cont<=maximo);
    }
}
