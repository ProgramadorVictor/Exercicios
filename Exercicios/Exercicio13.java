/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio13;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int cont = 0;
        do{
        System.out.println("Digite a idade: ");
        int idade = in.nextInt();
        if (idade >=65){
            System.out.println(idade+" É um idoso");
        } else if(idade >=21){
            System.out.println(idade+" É um adulto");
        } else if (idade >= 12){
            System.out.println(idade+" É um adolescente");
        } else if (idade >= 3){
            System.out.println(idade+" É uma criança");
        }else{
            System.out.println(idade+" É um bebê");
        }
        cont++;
        }while(cont<3);
    }
}
