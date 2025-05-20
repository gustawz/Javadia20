/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio3.teste;

import br.edu.etec.exercicio3.teste.model.Usuario;
import br.edu.etec.exercicio3.teste.model.NivelAcesso;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario admin = new Usuario("admin", "1234", NivelAcesso.ADMIN);

        boolean autenticado = admin.autenticar("1234");
        System.out.println("Usuário autenticado? " + autenticado);
        System.out.println("Nível de acesso: " + admin.getNivel());
    }
}
