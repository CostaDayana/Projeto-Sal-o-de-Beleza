/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import models.Agendamento;
import models.Cliente;
import models.Servico;
import View.Agendar;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author igors
 */
public class AgendaHelper implements IHelper{
    
    private final Agendar view;
    

    public AgendaHelper(Agendar view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTTable().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
        
    }

    public void preencherCliente(ArrayList<Cliente> clientes) {

        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjCCliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServico(ArrayList<Servico> servicos) {
          DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjCServico().getModel();
          for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    
    }

    public Servico obterSevico() {

        return (Servico)view.getjCServico().getSelectedItem();
        
    }
    public Cliente obterCliente() {

        return (Cliente)view.getjCCliente().getSelectedItem();
        
    }

    public void setarValor(float valor) {
       
        view.getjTValor().setText(valor+"");
    
    }

    @Override
    public Agendamento obterModelo() {
         //new Agendamento(Integer.SIZE, null, null, valor, null)
        String idString = view.getTextId().getText();
        Integer id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterSevico();
        String valorString = view.getjTValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {

        view.getTextId().setText("0");
        view.getTextFormatedData().setText("");
        view.getTextFormatedHora().setText("");
        view.getjTObservacao().setText("");
    
    }
    
    
}