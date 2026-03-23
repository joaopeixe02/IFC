/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Date;

/**
 *
 * @author suporte
 */
public class Estudante {

    private String periodoEscolar;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private char genero;
    private String email;
    private String telefone;
    private int anoDeIngresso;
    private int semestreDeIngresso;
    private String situaçãoAcademica;

    public void setPeriodoEscolar(String novoPeriodoEscolar) {
        this.periodoEscolar = novoPeriodoEscolar;
    }

    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setDataNascimento(Date novoDataNascimento) {
        this.dataNascimento = novoDataNascimento;
    }

    public void setGenero(char novoGenero) {
        this.genero = novoGenero;
    }
    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }
    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }
    public void setAnoDeIngresso(int novoAnoDeIngresso) {
        this.anoDeIngresso = novoAnoDeIngresso;
    }
    public void setSemestreDeIngresso(int novoSemestreDeIngresso) {
        this.semestreDeIngresso = novoSemestreDeIngresso;
    }
    public void setSituaçãoAcademica(String novoSituaçãoAcademica) {
        this.situaçãoAcademica = novoSituaçãoAcademica;
    }
}
