/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import View.Login;
import View.Menu;
import models.Usuario;

/**
 *
 * @author Day
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
 
       Usuario usuario = helper.ObterModelo();
       
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       
       if(usuarioAutenticado != null){
           Menu menu = new Menu();
           menu.setVisible(true);
           this.view.dispose();
       }else{
           view.exibeMensagem("Usuário ou senha inválidos ");
       }
       
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Excutei o Fiz tarefa");
    }
    
}
