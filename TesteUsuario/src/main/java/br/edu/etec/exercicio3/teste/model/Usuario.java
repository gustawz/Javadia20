/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.teste.model;

public class Usuario {
    private String login;
    private String senha;
    private NivelAcesso nivel;
    private boolean ativo;

    public Usuario(String login, String senha, NivelAcesso nivel) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = true;
    }

    public boolean autenticar(String senhaInformada) {
        return ativo && this.senha.equals(senhaInformada);
    }

    public void desativar() {
        this.ativo = false;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public String getLogin() {
        return login;
    }
}