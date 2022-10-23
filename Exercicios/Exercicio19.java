/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio19;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio19 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num, cont = 0, div = 1;
        System.out.println("Digite o número: ");
        num = in.nextInt();
        while(div <= num){
            if(num % div == 0){
                cont++;
            }
            div++;
        }
        if(cont == 2){
            System.out.println("Primo");
        } else{
            System.out.println("Não é primo");
        }
        
    }
}
