package Controller;


import Controller.Helper.AgendaHelper;
import View.Agendar;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Servico.Correio;
import View.Menu;
import java.util.ArrayList;
import models.Agendamento;
import models.Cliente;
import models.Servico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Day
 */
public class AgendaController {
    
       private final Agendar view;
       private final AgendaHelper helper;

    public AgendaController(Agendar view) {
       
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
     
    public void AtuliazaTabela(){
        
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
           
        helper.preencherTabela(agendamentos);
           
           
    }

    public void voltarParaMenu() {
        
        Menu menu = new Menu();
        menu.setVisible(true);
        this.view.dispose();
    }
    
    public void atualizarCliente(){
       
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
   
        helper.preencherCliente(clientes);
    }                            
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
           
        helper.preencherServico(servicos);
    }

    public void atualizaValor(){
    
        Servico servico =  helper.obterSevico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        
        Agendamento agendamento = (Agendamento) helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
        
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);
        
        AtuliazaTabela();
        helper.limparTela();
    }
    
    
}
 

