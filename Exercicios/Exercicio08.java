/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio08;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String name = in.next();
        System.out.println("Digite a altura: ");
        double altura = in.nextDouble();
        System.out.println("Digite a base: ");
        double base = in.nextDouble();
        double conta = altura*base/2;
        System.out.println("A area do triangulo é " + conta);
    }
}
