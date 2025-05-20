/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio2.teste;

import br.edu.etec.exercicio2.teste.model.PagamentoCartao;

public class TestePagamento {
    public static void main(String[] args) {
        PagamentoCartao pagamento = new PagamentoCartao(150.00, "1234567812345678");

        pagamento.exibirStatus();
        pagamento.processarPagamento();
        pagamento.exibirStatus();
    }
}