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
public class kawanReisLucio_60002078_Exercicio4 {

    public static void main(String[] args) {
     
        int[] vetor1 = new int[8];
        int[] vetor2 = new int[8];
        int[] resultado = new int[8];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o valor para o vetor 1, posicao " + i + ":");
            vetor1[i] = s.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o valor para o vetor 2, posicao " + i + ":");
            vetor2[i] = s.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            resultado[i] = vetor1[i] * vetor2[i];
        }

        System.out.println("Resultados da multiplicação:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Posicao " + (i+1) + ": " + resultado[i]);
        }
    }
}
