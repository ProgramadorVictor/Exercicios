/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio14;

import java.util.Scanner;

/**
 *
 * @author Telly
 */
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String resp = "";
        boolean testeLoop = false;
        do{
        System.out.println("Digite a idade: ");
        int idade = in.nextInt();
        if (idade >=65){
            System.out.println(idade+"(Velho)");
        } else if(idade >=21){
            System.out.println(idade+"(Adulto)");
        } else{
            System.out.println("Outros");
        }
            System.out.println("Quer rodar novamente: (Sim/Não)");
            resp = in.next();
            if(resp.equals("Sim")){
                testeLoop = true;
            } else{
                testeLoop = false;
            }
        }while(testeLoop);
    }
}
