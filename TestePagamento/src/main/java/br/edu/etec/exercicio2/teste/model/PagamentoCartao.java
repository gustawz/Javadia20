/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio2.teste.model;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão...");
        this.status = StatusPagamento.CONCLUIDO;
        String ultimos4 = numeroCartao.substring(numeroCartao.length() - 4);
        System.out.println("Pagamento realizado com sucesso. Cartão final " + ultimos4);
    }
}