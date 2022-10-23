/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio18;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o número: ");
        int numero = in.nextInt();
        System.out.println("Digite o multiplicador: ");
        int multiplicador = in.nextInt();
        int cont = 1;
        int aux = numero;
        while(cont < multiplicador){
            numero = numero+multiplicador;
            cont++;
        }
        if(numero < 0){
            
        }
        if(multiplicador < 0){
            
        }
        
        System.out.println(aux+" x "+multiplicador+" = "+numero);
    }
}
