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
public class kawanReisLucio_60002078_Exercicio3 {

    public static void main(String[] args) {
        String nomes[] = new String[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("insira seu nome ");
            nomes[i] = s.next();
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("o " + (j + 1) + " nome informado foi " + nomes[j]);
        }

    }
}
