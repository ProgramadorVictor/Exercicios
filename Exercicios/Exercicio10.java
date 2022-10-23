/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio10;

import java.util.Scanner;

/**
 *
 * @author Telly
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0, divisao = 0;
        System.out.println("Digite um número: ");
        numero = in.nextInt();
        if(numero % 2 == 0){
            System.out.println("Par");
        }
        if(numero %2 != 0){
            System.out.println("Impar");
        }
    }
}
