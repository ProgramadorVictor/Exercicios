/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio11;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ta gostando de programar? (S/n)");
        String resp = in.next();
        if(resp.equals("Sim")){
            System.out.println("Bom!");
        }
        if(resp.equals("S")){
            System.out.println("Bom!");
        }
        if(resp.equals("sim")){
            System.out.println("Bom!");
        }
        if(resp.equals("s")){
            System.out.println("Bom!");
        } else{
            System.out.println("Que bosta!");
        }
    }
}
