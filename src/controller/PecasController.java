/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Peca;
import view.Sistema_UI;
import view.peca.CriarPeca;
import view.peca.EditarPeca;
import view.peca.PecaUI;
import view.peca.VisualizarPeca;

/**
 *
 * @author KLEYN
 */
public class PecasController {
    
    private Sistema_UI sistemaUI = null;
    private PecaUI pecaUI = null;
    private CriarPeca criarPeca = null;
    private EditarPeca editarPeca = null;
    private VisualizarPeca visualizarPeca = null;
    
    private Peca pecaAux = null;
    
    public PecasController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }

    public void abrePecaUI(){
    sistemaUI.setPecaUI(new PecaUI(this));
    sistemaUI.setEnabled(false);
    setPecaUI(sistemaUI.getPecaUI());
    pecaUI.produtoBuscaTodos();
    
}

    public void fechaPecaUI(){
        pecaUI.dispose();
        sistemaUI.setEnabled(true);
        sistemaUI.toFront();
        setPecaUI(null);
    }

    public void abreCriacaoPeca(){
        pecaUI.setCriarPeca(new CriarPeca(this));
        setCriarPeca(pecaUI.getCriarPeca());
        getCriarPeca().setagemInicial();
        pecaUI.setEnabled(false);

    }

    public void fechaCriacaoPeca(){
        getCriarPeca().dispose();
        setCriarPeca(null);
        sistemaUI.toFront();
        pecaUI.setEnabled(true);
        pecaUI.toFront();
        pecaUI.setagemInicial();
        pecaUI.produtoBuscaTodos();
    }

    
    public void abreEdicaoPeca(){
        pecaUI.setEditarPeca(new EditarPeca(this, pecaUI.getPecaAux()));
        setEditarPeca(pecaUI.getEditarPeca());
        getEditarPeca().setaEdicaoPeca();
        pecaUI.setEnabled(false);
    }
    
    public void fechaEdicaoPeca(){
        getEditarPeca().dispose();
        pecaUI.setEnabled(true);
        pecaUI.setPecaAux(null);
        sistemaUI.toFront();
        pecaUI.toFront();
        pecaUI.produtoBuscaTodos();
        sistemaUI.atualizaDados();
    }
    
    public void abreVisualizacaoPeca(){
        pecaUI.setVisualizarPeca(new VisualizarPeca(this, pecaUI.getPecaAux()));
        setVisualizarPeca(pecaUI.getVisualizarPeca());
        getVisualizarPeca().setaVisualizacao();
        pecaUI.setEnabled(false);
    }
    
    public void fechaVisualizacaoPeca(){
        getVisualizarPeca().dispose();
        pecaUI.setEnabled(true);
        pecaUI.setPecaAux(null);
        sistemaUI.toFront();
        pecaUI.toFront();
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
     * @return the pecaUI
     */
    public PecaUI getPecaUI() {
        return pecaUI;
    }

    /**
     * @param pecaUI the pecaUI to set
     */
    public void setPecaUI(PecaUI pecaUI) {
        this.pecaUI = pecaUI;
    }

    /**
     * @return the pecaAux
     */
    public Peca getPecaAux() {
        return pecaAux;
    }

    /**
     * @param pecaAux the pecaAux to set
     */
    public void setPecaAux(Peca pecaAux) {
        this.pecaAux = pecaAux;
    }

    /**
     * @return the criarPeca
     */
    public CriarPeca getCriarPeca() {
        return criarPeca;
    }

    /**
     * @param criarPeca the criarPeca to set
     */
    public void setCriarPeca(CriarPeca criarPeca) {
        this.criarPeca = criarPeca;
    }

    /**
     * @return the editarPeca
     */
    public EditarPeca getEditarPeca() {
        return editarPeca;
    }

    /**
     * @param editarPeca the editarPeca to set
     */
    public void setEditarPeca(EditarPeca editarPeca) {
        this.editarPeca = editarPeca;
    }

    /**
     * @return the visualizarPeca
     */
    public VisualizarPeca getVisualizarPeca() {
        return visualizarPeca;
    }

    /**
     * @param visualizarPeca the visualizarPeca to set
     */
    public void setVisualizarPeca(VisualizarPeca visualizarPeca) {
        this.visualizarPeca = visualizarPeca;
    }
    
}
