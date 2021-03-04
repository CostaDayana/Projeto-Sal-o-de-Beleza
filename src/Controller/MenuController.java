/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Agendar;
import View.Menu;

/**
 *
 * @author Day
 */
public class MenuController {
    private final Menu view;

    public MenuController(Menu view) {
        this.view = view;
    }
    
    
    public void navegarParaAgendar(){
        
        Agendar agendar = new Agendar();
        agendar.setVisible(true);
        this.view.dispose();
        }
     
}
