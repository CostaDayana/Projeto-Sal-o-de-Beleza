/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import models.Agendamento;
import models.Cliente;
import models.Servico;
import models.Usuario;

/**
 *
 * @author Day
 */
public class Main {
    public static void main (String[] args){
    
        Servico servico = new Servico(1, "Corte",25 );
        Cliente cliente = new Cliente(1,"Day","rua teste","992625955");
        Usuario usuario = new Usuario(1, "day", "melody");
       
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 25, "30/08/1997 08:20", "cliente é alergico a produtos quimicos");
        System.out.println(agendamento.getCliente().getNome());
        
        
      
    }
    
}
