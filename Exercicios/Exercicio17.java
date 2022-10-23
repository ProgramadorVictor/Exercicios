/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio17;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String resp = "";
        boolean testeLoop = false;
        do{
        System.out.println("Digite a temperatura em C: ");
        double temperaturaC = in.nextDouble();
        double converter = temperaturaC*1.8+32;
        System.out.println("Temperatura em fahrenheit é "+converter);
        System.out.println("Quer rodar novamente (S/n)");
        resp = in.next();
        if(resp.equals("S")){
            testeLoop = true;
        } else{
            testeLoop = false;
        }
      }while(testeLoop);
    }
}
