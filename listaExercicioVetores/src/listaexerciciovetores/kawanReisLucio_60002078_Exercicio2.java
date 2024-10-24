/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaexerciciovetores;

import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class kawanReisLucio_60002078_Exercicio2 {

    public static void main(String[] args) {
        double real[] = new double[10];
        double media = 0;
         double menor = Double.MAX_VALUE; // Use a large value for initialization
        double maior = Double.MIN_VALUE;
        Scanner s = new Scanner(System.in);
         for (int i = 0; i < 10; i++) {
            System.out.println("Insira a nota do " + (i + 1) + "º bimestre:");
            real[i] = s.nextDouble();
            media += real[i];
            
            if (real[i] < menor) {
                menor = real[i];
            }
            if (real[i] > maior) {
                maior = real[i];
            }
        }
        
        System.out.println("A menor nota é: " + menor);
        System.out.println("A maior nota é: " + maior);
        System.out.println("Sua média foi: " + media / 10);
        }
    }

