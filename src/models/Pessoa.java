/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Day
 */
abstract public class Pessoa {
    protected int id;
    protected String nome ;
    protected String Telefone;
    protected String email;
    protected char sexo;
    protected String cpf;
    protected Date dataNascimento;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, char sexo, String dataNascimento, String Telefone, String email,  String cpf) {
        //(int id, String nome, char sexo, String dataNascimento,String Telefone,String email,String cpf, String endereco, String cep  )
        this.id = id;
        this.nome = nome;
        this.Telefone = Telefone;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/mm/yyyy") .parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDatabaNascimento(Date databaNascimento) {
        this.dataNascimento = databaNascimento;
    }
    
    
    
}
