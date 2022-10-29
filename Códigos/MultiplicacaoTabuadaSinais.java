/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplicacaotabuadasinais;

import java.util.Scanner;

/**
 *
 * @author Telly
 */
public class MultiplicacaoTabuadaSinais {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
                //INPUT DO USUARIO
        System.out.println("Número: ");
        int numero = in.nextInt();
        System.out.println("Multiplicador: ");
        int multiplicador = in.nextInt();
        System.out.println("Tabuada: (Tamanho)");
        int tabuada = in.nextInt();
        if(tabuada > 0){
                //PROBLEMA DE SINAIS E CODIGO
        System.out.println("================");
        int troca = 0;
        int i = 0, aux = 0;
        if(numero < 0 && multiplicador < 0){ //1
            troca = numero;
            numero = troca-numero-numero;
            troca = multiplicador;
            multiplicador = troca-multiplicador-multiplicador;
                    while(i < multiplicador){ 
                    aux = numero+aux;
                    i++;
                }
                System.out.println("Entrou no 1");
                System.out.println("+"+aux);
            } else if(numero < 0 && multiplicador > 0){ //2
                troca = numero;
                numero = numero-troca-numero;
                    while(i < multiplicador){ 
                    aux = numero+aux;
                    i++;
                    }
                System.out.println("Entrou no 2");
                System.out.println("-"+aux);
            } else if(numero > 0 && multiplicador < 0){ //3
                troca = multiplicador;
                multiplicador = troca-multiplicador-multiplicador;
                    while(i < multiplicador){ 
                    aux = numero+aux;
                    i++;
                }
                System.out.println("Entrou no 3");
                System.out.println("-"+aux);
            } else{// numero > 0 && multiplicador >0 //4
                    while(i < multiplicador){ 
                    aux = numero+aux;
                    i++;
                    }
                System.out.println("Entrou no 4");
                System.out.println("+"+aux);
            }
        
        System.out.println("================");   
        aux = 0; i = 0;
        System.out.println("WHILE");
        while(i < tabuada){
            aux = numero+aux;
            i++;
            System.out.println(numero+"x"+i+"="+aux);
        }
        System.out.println("================");  
        aux = 0; i = 0;
        System.out.println("FOR");
        for(i = 1; i<=tabuada; i++){
            aux = numero+aux;
            System.out.println(numero+"x"+i+"="+aux);
        }
      }else{
            System.out.println("Tabuada é negativo, então não vai rodar!");
        } 
    }
}
