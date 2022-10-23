/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio20;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int menor = 0, maior = 1, proximo = 0, resp = 0;
        System.out.println("Digite o número: ");
        resp = in.nextInt();
        while(resp >= proximo){
            proximo = maior+menor;
            menor = maior;
            maior = proximo; 
            }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Proximo: "+proximo);
        if(resp == menor){
            System.out.println("O numero "+resp+" é fibonacci");
        }
   
    }
}
