/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;

public class Equipamento {
    private String nome;
    private String modelo;

    public Equipamento(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
    }
}
