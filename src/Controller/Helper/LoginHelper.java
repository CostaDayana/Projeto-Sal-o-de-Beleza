/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import View.Login;
import models.Usuario;

/**
 *
 * @author Day
 */
public class LoginHelper implements IHelper{
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Usuario ObterModelo(){
       String nome = view.getJTlogin().getText();
       String senha = view.getJPSenha().getText();
       
       Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    public void SetarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getJTlogin().setText(nome);
        view.getJPSenha().setText(senha);        
    }
    
    public void LimparTela(){
        view.getJTlogin().setText("");
        view.getJPSenha().setText("");
    }

    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
