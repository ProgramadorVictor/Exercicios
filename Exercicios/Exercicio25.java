/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio25;

import java.util.Scanner;

/**
 *
 * @author Telly
 */
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Digite a temp (C): ");
        double tempC = in.nextDouble();
        //CONVERSÃO
        double converter = 0; 
        converter = tempF(tempC); //FAHRENHEIT 
        System.out.println("F: "+converter);
        converter = tempK(tempC);
        System.out.println("K: "+converter); // KELVIN
        converter = tempRe(tempC);
        System.out.println("Re: "+converter); // RÉAUMUR 
        converter = tempRa(tempC);
        System.out.println("Ra: "+converter); // RANKINE
        
    }
    public static double tempRe(double re){
        re = re*0.8;
        return re;
    }
    public static double tempRa(double ra){
        ra = ra*1.8+32+459.67;
        return ra;
    }
    public static double tempK(double k){
        k = k+273.15;
        return k;
    }
    public static double tempF(double f){
        f = f*1.8+32;
        return f;
    }
    
}
