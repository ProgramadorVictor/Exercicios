/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio16;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String resp = "s";
        double tempC = 0;
        
        do{
            System.out.println("Qual a temperatura em C: ");
            tempC = in.nextDouble();
            double converter = tempC*9/5 +32;
            System.out.println("Quer rodar novamente (S/n)");
            resp = in.next();
        } while(resp.equals("s"));    }
}
