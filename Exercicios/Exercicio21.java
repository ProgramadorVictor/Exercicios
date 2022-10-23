/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio21;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio21 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int cont = 0;
        String[]alunos = new String[3];
        while(cont<3){
            System.out.println("Digite o nome: ");
            alunos[cont] = in.next();
            cont++;
        }
        System.out.println("");
        cont = 0;
        while(cont<3){
            System.out.println(alunos[cont]);;
            cont++;
        }

    }
}
