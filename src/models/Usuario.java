    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;



/**
 *
 * @author Day
 */
public class Usuario extends Pessoa {
    
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome) {
        super(id, nome);
    }

    public Usuario(int id, String nome ,String senha, String nivelAcesso ) {
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(int id, String nome, String senha ) {
        super(id, nome);
        this.senha = senha;
    }
    //1, "barbeiro", 'M', "09/05/1996", "30212121", "barbeiro@barbershop.com", "521454123", "barbeiro", "administrador"
    public Usuario(int id, String nome, char sexo, String dataNascimento, String Telefone, String email, String cpf, String senha, String nivelAcesso ) {
        super(id, nome, sexo, dataNascimento ,Telefone,  email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String senha, String nivelAcesso, int id, String nome) {
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
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

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
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

    public void setDataNascimento(Date databaNascimento) {
        this.dataNascimento = databaNascimento;
    }
    
    
    
}
