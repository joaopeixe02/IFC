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
public class Professor {

    private String nome;
    private int numerold;
    private int email;
    private String telefone;
    private String titulaçãoAce;
    private String area;
    private String regime;
    private Date dataIngresso;

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setNumeroId(int novoNumeroId) {
        this.numerold = novoNumeroId;
    }

    public void setEmail(int novoEmail) {
        this.email = novoEmail;
    }

    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
    }
    public void setTitulaçãoAce(String novoTitulaçãoAce) {
        this.titulaçãoAce = novoTitulaçãoAce;
    }
    public void setArea(String novoArea) {
        this.area = novoArea;
    }
    public void setRegime(String novoRegime) {
        this.regime = novoRegime;
    }
    
    public void setDataIngresso(Date novoDataIngresso) {
        this.dataIngresso = novoDataIngresso;
    }
}
