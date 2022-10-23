/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio12;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double a, b, c;
        System.out.println("Digite o valor do: (A)");
        a = in.nextDouble();
        System.out.println("Digite o valor do: (B)");
        b = in.nextDouble();
        System.out.println("Digite o valor do: (C)");
        c = in.nextDouble();
        if(b+c>a && a+c>b && b+a>c){
            System.out.println("==============================================");
            System.out.println("É um triângulo");
            System.out.println("==============================================");
            if(a == b & c == a){
                System.out.println("Equilatero");
            } else if(a == b || b == c || c == a){
                System.out.println("Isosceles");
            } else{
                System.out.println("Escaleno");
            }
            double maior = 0,menor = 0,menor2 = 0;
            if(a >= b && a >= c){
                maior = a;
                menor = b;
                menor2 = c;
            }
            if(b >= a && b >=c){
                maior = b;
                menor = a;
                menor2 = c;
            }
            if(c >= a && c>=b){
                maior = c;
                menor = a;
                menor2 = b;
            }
            
            if(maior*maior == menor*menor + menor2*menor2){
                System.out.println("Retângulo");
            }
        } else{
            System.out.println("==============================================");
            System.out.println("Não é um triângulo");
        }
    }
}
