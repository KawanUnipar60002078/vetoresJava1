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
public class kawanReisLucio_60002078_Exercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas frutas voce deseja informar?");
        int quantidade = s.nextInt();
        s.nextLine(); // Limpar o buffer

        String[] frutas = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da fruta " + (i + 1) + ":");
            frutas[i] = s.nextLine();
        }

        System.out.println("Frutas informadas e quantidade de caracteres:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(frutas[i] + ": " + frutas[i].length() + " caracteres");
        }
    }
}
