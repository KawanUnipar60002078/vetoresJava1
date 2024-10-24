/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaexerciciovetores;

import java.util.Scanner;

public class kawanReisLucio_60002078_Exercicio1 {

    public static void main(String[] args) {
        float real[] = new float[4];
        float media = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("insira  a nota do " + (i+1) + " bimestre");
            real[i] = s.nextInt();
            media += real[i];
        }

        System.out.println("sua media foi " + media / 4);

    }

}
