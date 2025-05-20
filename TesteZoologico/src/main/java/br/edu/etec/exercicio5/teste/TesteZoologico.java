/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio5.teste;

import br.edu.etec.exercicio5.teste.model.*;

public class TesteZoologico {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Leao("Simba", 5);
        animais[1] = new Golfinho("Flipper", 8);
        animais[2] = new Arara("Loro", 3);

        for (Animal a : animais) {
            a.exibirInfo();
            a.emitirSom();
            System.out.println();
        }
    }
}