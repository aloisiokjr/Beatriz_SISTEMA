/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Fornecedor;
import view.Sistema_UI;
import view.fornecedor.CriarFornecedor;
import view.fornecedor.EditarFornecedor;
import view.fornecedor.FornecedorUI;
import view.fornecedor.VisualizarFornecedor;

/**
 *
 * @author KLEYN
 */
public class FornecedorController {
    private Sistema_UI sistemaUI = null;
    private FornecedorUI fornecedorUI = null;
    private CriarFornecedor criarFornecedor = null;
    private EditarFornecedor editarFornecedor = null;
    private VisualizarFornecedor visualizarFornecedor = null;
    
    private Fornecedor fornecedorAux = null;
    
    public FornecedorController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }

    public void abreFornecedorUI(){
    sistemaUI.setFornecedorUI(new FornecedorUI(this));
    sistemaUI.setEnabled(false);
    setFornecedorUI(sistemaUI.getFornecedorUI());
    fornecedorUI.fornecedorBuscaTodos();
    
}

    public void fechaFornecedorUI(){
        fornecedorUI.dispose();
        sistemaUI.setEnabled(true);
        sistemaUI.toFront();
        setFornecedorUI(null);
    }

    public void abreCriacaoFornecedor(){
        fornecedorUI.setCriarFornecedor(new CriarFornecedor(this));
        setCriarFornecedor(fornecedorUI.getCriarFornecedor());
        fornecedorUI.setEnabled(false);

    }

    public void fechaCriacaoFornecedor(){
        getCriarFornecedor().dispose();
        setCriarFornecedor(null);
        sistemaUI.toFront();
        fornecedorUI.setEnabled(true);
        fornecedorUI.toFront();
        fornecedorUI.setagemInicial();
        fornecedorUI.fornecedorBuscaTodos();
    }

    
    public void abreEdicaoFornecedor(){
        fornecedorUI.setEditarFornecedor(new EditarFornecedor(this, fornecedorUI.getFornecedorAux()));
        setEditarFornecedor(fornecedorUI.getEditarFornecedor());
        fornecedorUI.setEnabled(false);
    }
    
    public void fechaEdicaoFornecedor(){
        getEditarFornecedor().dispose();
        fornecedorUI.setEnabled(true);
        fornecedorUI.setFornecedorAux(null);
        fornecedorUI.fornecedorBuscaTodos();
        sistemaUI.toFront();
        fornecedorUI.toFront();
        sistemaUI.atualizaDados();
    }
    
    public void abreVisualizacaoFornecedor(){
        fornecedorUI.setVisualizarFornecedor(new VisualizarFornecedor(this, fornecedorUI.getFornecedorAux()));
        setVisualizarFornecedor(fornecedorUI.getVisualizarFornecedor());
        fornecedorUI.setEnabled(false);
    }
    
    public void fechaVisualizacaoFornecedorParaEdicao(){
        getVisualizarFornecedor().dispose();
        abreEdicaoFornecedor();
    }
    
    public void fechaVisualizacaoFornecedor(){
        getVisualizarFornecedor().dispose();
        fornecedorUI.setEnabled(true);
        fornecedorUI.setFornecedorAux(null);
        fornecedorUI.setagemInicial();
        sistemaUI.toFront();
        fornecedorUI.fornecedorBuscaTodos();
        fornecedorUI.toFront();
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
     * @return the fornecedorUI
     */
    public FornecedorUI getFornecedorUI() {
        return fornecedorUI;
    }

    /**
     * @param fornecedorUI the fornecedorUI to set
     */
    public void setFornecedorUI(FornecedorUI fornecedorUI) {
        this.fornecedorUI = fornecedorUI;
    }

    /**
     * @return the fornecedorAux
     */
    public Fornecedor getFornecedorAux() {
        return fornecedorAux;
    }

    /**
     * @param fornecedorAux the fornecedorAux to set
     */
    public void setFornecedorAux(Fornecedor fornecedorAux) {
        this.fornecedorAux = fornecedorAux;
    }

    /**
     * @return the criarFornecedor
     */
    public CriarFornecedor getCriarFornecedor() {
        return criarFornecedor;
    }

    /**
     * @param criarFornecedor the criarFornecedor to set
     */
    public void setCriarFornecedor(CriarFornecedor criarFornecedor) {
        this.criarFornecedor = criarFornecedor;
    }

    /**
     * @return the editarFornecedor
     */
    public EditarFornecedor getEditarFornecedor() {
        return editarFornecedor;
    }

    /**
     * @param editarFornecedor the editarFornecedor to set
     */
    public void setEditarFornecedor(EditarFornecedor editarFornecedor) {
        this.editarFornecedor = editarFornecedor;
    }

    /**
     * @return the visualizarFornecedor
     */
    public VisualizarFornecedor getVisualizarFornecedor() {
        return visualizarFornecedor;
    }

    /**
     * @param visualizarFornecedor the visualizarFornecedor to set
     */
    public void setVisualizarFornecedor(VisualizarFornecedor visualizarFornecedor) {
        this.visualizarFornecedor = visualizarFornecedor;
    }
}
