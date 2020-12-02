/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import view.Sistema_UI;
import view.cliente.CriarCliente;
import view.cliente.EditarCliente;
import view.cliente.ClienteUI;
import view.cliente.VisualizarCliente;

/**
 *
 * @author KLEYN
 */
public class ClienteController {
    private Sistema_UI sistemaUI = null;
    private ClienteUI clienteUI = null;
    private CriarCliente criarCliente = null;
    private EditarCliente editarCliente = null;
    private VisualizarCliente visualizarCliente = null;
    
    private Cliente clienteAux = null;
    
    public ClienteController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }

    public void abreClienteUI(){
    sistemaUI.setClienteUI(new ClienteUI(this));
    sistemaUI.setEnabled(false);
    setClienteUI(sistemaUI.getClienteUI());
    clienteUI.clienteBuscaTodos();
    
}

    public void fechaClienteUI(){
        clienteUI.dispose();
        sistemaUI.setEnabled(true);
        sistemaUI.toFront();
        setClienteUI(null);
    }

    public void abreCriacaoCliente(){
        clienteUI.setCriarCliente(new CriarCliente(this));
        setCriarCliente(clienteUI.getCriarCliente());
        clienteUI.setEnabled(false);

    }

    public void fechaCriacaoCliente(){
        getCriarCliente().dispose();
        setCriarCliente(null);
        sistemaUI.toFront();
        clienteUI.setEnabled(true);
        clienteUI.toFront();
        clienteUI.setagemInicial();
        clienteUI.clienteBuscaTodos();
    }

    
    public void abreEdicaoCliente(){
        clienteUI.setEditarCliente(new EditarCliente(this, clienteUI.getClienteAux()));
        setEditarCliente(clienteUI.getEditarCliente());
        clienteUI.setEnabled(false);
    }
    
    public void fechaEdicaoCliente(){
        getEditarCliente().dispose();
        clienteUI.setEnabled(true);
        clienteUI.setClienteAux(null);
        clienteUI.setagemInicial();
        sistemaUI.toFront();
        clienteUI.toFront();
        clienteUI.clienteBuscaTodos();
        sistemaUI.atualizaDados();
    }
    
    public void abreVisualizacaoCliente(){
        clienteUI.setVisualizarCliente(new VisualizarCliente(this, clienteUI.getClienteAux()));
        setVisualizarCliente(clienteUI.getVisualizarCliente());
        clienteUI.setEnabled(false);
    }
    
    public void fechaVisualizacaoClienteParaEdicao(){
        getVisualizarCliente().dispose();
        abreEdicaoCliente();
    }
    
    public void fechaVisualizacaoCliente(){
        getVisualizarCliente().dispose();
        clienteUI.setEnabled(true);
        clienteUI.setClienteAux(null);
        clienteUI.setagemInicial();
        sistemaUI.toFront();
        clienteUI.clienteBuscaTodos();
        clienteUI.toFront();
        sistemaUI.atualizaDados();
    }
    
    
    /**
     * @return the sistemaUI
     */
    public Sistema_UI getSistemaUI() {
        return sistemaUI;
    }

    /**
     * @param sistemaUI the sistemaUI to set
     */
    public void setSistemaUI(Sistema_UI sistemaUI) {
        this.sistemaUI = sistemaUI;
    }

    /**
     * @return the clienteUI
     */
    public ClienteUI getClienteUI() {
        return clienteUI;
    }

    /**
     * @param clienteUI the clienteUI to set
     */
    public void setClienteUI(ClienteUI clienteUI) {
        this.clienteUI = clienteUI;
    }

    /**
     * @return the clienteAux
     */
    public Cliente getClienteAux() {
        return clienteAux;
    }

    /**
     * @param clienteAux the clienteAux to set
     */
    public void setClienteAux(Cliente clienteAux) {
        this.clienteAux = clienteAux;
    }

    /**
     * @return the criarCliente
     */
    public CriarCliente getCriarCliente() {
        return criarCliente;
    }

    /**
     * @param criarCliente the criarCliente to set
     */
    public void setCriarCliente(CriarCliente criarCliente) {
        this.criarCliente = criarCliente;
    }

    /**
     * @return the editarCliente
     */
    public EditarCliente getEditarCliente() {
        return editarCliente;
    }

    /**
     * @param editarCliente the editarCliente to set
     */
    public void setEditarCliente(EditarCliente editarCliente) {
        this.editarCliente = editarCliente;
    }

    /**
     * @return the visualizarCliente
     */
    public VisualizarCliente getVisualizarCliente() {
        return visualizarCliente;
    }

    /**
     * @param visualizarCliente the visualizarCliente to set
     */
    public void setVisualizarCliente(VisualizarCliente visualizarCliente) {
        this.visualizarCliente = visualizarCliente;
    }
}
