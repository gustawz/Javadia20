/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio1.teste;

import br.edu.etec.exercicio1.teste.model.Computador;

public class TesteEquipamento {
    public static void main(String[] args) {
        Computador pc = new Computador("PC Etec", "Dell Optiplex", "Intel i5");
        pc.exibirDados();
    }
}
