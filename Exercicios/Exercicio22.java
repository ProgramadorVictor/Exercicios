/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio22;
import java.util.Scanner;

/**
 *
 * @author Telly
 */
public class Exercicio22 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int cont = 0;
        double[]lados = new double[3];
        while(cont < 3){
            System.out.println("Digite o lado:"+"("+(cont+1)+")");
            lados[cont] = in.nextDouble();
            cont++;
        }
        System.out.println("");
        cont = 0;
        while(cont < lados.length){
            System.out.println(lados[cont]);
            cont++;
        }
        
    }
}
