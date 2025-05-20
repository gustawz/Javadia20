/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.teste.model;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected Habitat habitat;

    public Animal(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habitat: " + habitat);
    }

    public abstract void emitirSom();
}