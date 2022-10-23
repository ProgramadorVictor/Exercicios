/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio24;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio24 {
    public static double media(double x, double y){
        return (x+y)/2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular a média");
        double num = input("Digite um número:",in);
        double num2 = input("Digite outro número: ",in);
        double calculo = media(num, num2);
        System.out.println("A media de "+num+ " + "+num2+" é " +calculo);
    }
    public static double input (String texto, Scanner in){
        System.out.println(texto);
        double media = in.nextInt();
        return media;
    }
}
