/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio4.teste;

import br.edu.etec.exercicio4.teste.model.*;

public class TesteNotificacoes {
    public static void main(String[] args) {
        Notificacao[] notificacoes = new Notificacao[2];
        notificacoes[0] = new Email("joao@email.com", "Olá João, você tem um novo email.");
        notificacoes[1] = new SMS("(11)99999-9999", "Mensagem muito longa que será cortada automaticamente se ultrapassar 160 caracteres. Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        for (Notificacao n : notificacoes) {
            n.preparar();
            n.enviar();
        }
    }
}