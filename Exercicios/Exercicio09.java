/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio09;
import java.util.Scanner;
/**
 *
 * @author Telly
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double tarifa = 2,consumo = 0,desconto = 0.3,valorDesconto = 0,valorPagar=0,aumento=0.5,valorAumento=0;
        System.out.println("Digite o consumo: ");
        consumo = in.nextDouble();
        valorPagar = consumo*tarifa;
        if(consumo < 100){
            valorDesconto = valorPagar*desconto;
            System.out.println("Entrou no desconto 1");
        }
        if(consumo > 100){
            valorAumento = valorPagar*aumento;
            System.out.println("Entrou no desconto 2");
        }
    }
}
