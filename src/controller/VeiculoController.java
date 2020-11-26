/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Veiculo;
import view.Sistema_UI;
import view.veiculo.CriarVeiculo;
import view.veiculo.EditarVeiculo;
import view.veiculo.VeiculoUI;
import view.veiculo.VisualizarVeiculo;

/**
 *
 * @author KLEYN
 */
public class VeiculoController {
    private Sistema_UI sistemaUI = null;
    private VeiculoUI veiculoUI = null;
    private CriarVeiculo criarVeiculo = null;
    private EditarVeiculo editarVeiculo = null;
    private VisualizarVeiculo visualizarVeiculo = null;
    
    private Veiculo veiculoAux = null;
    
    public VeiculoController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }

    public void abreVeiculoUI(){
    sistemaUI.setVeiculoUI(new VeiculoUI(this));
    sistemaUI.setEnabled(false);
    setVeiculoUI(sistemaUI.getVeiculoUI());
    veiculoUI.veiculoBuscaTodos();
    
}

    public void fechaVeiculoUI(){
        veiculoUI.dispose();
        sistemaUI.setEnabled(true);
        sistemaUI.toFront();
        setVeiculoUI(null);
    }

    public void abreCriacaoVeiculo(){
        veiculoUI.setCriarVeiculo(new CriarVeiculo(this));
        setCriarVeiculo(veiculoUI.getCriarVeiculo());
        getCriarVeiculo().setagemInicial();
        veiculoUI.setEnabled(false);

    }

    public void fechaCriacaoVeiculo(){
        getCriarVeiculo().dispose();
        setCriarVeiculo(null);
        sistemaUI.toFront();
        veiculoUI.setEnabled(true);
        veiculoUI.toFront();
        veiculoUI.setagemInicial();
        veiculoUI.veiculoBuscaTodos();
    }

    
    public void abreEdicaoVeiculo(){
        veiculoUI.setEditarVeiculo(new EditarVeiculo(this, veiculoUI.getVeiculoAux()));
        setEditarVeiculo(veiculoUI.getEditarVeiculo());
        getEditarVeiculo().setaEdicaoVeiculo();
        veiculoUI.setEnabled(false);
    }
    
    public void fechaEdicaoVeiculo(){
        getEditarVeiculo().dispose();
        veiculoUI.setEnabled(true);
        veiculoUI.setVeiculoAux(null);
        veiculoUI.setagemInicial();
        sistemaUI.toFront();
        veiculoUI.toFront();
        veiculoUI.veiculoBuscaTodos();
        sistemaUI.atualizaDados();
    }
    
    public void abreVisualizacaoVeiculo(){
        veiculoUI.setVisualizarVeiculo(new VisualizarVeiculo(this, veiculoUI.getVeiculoAux()));
        setVisualizarVeiculo(veiculoUI.getVisualizarVeiculo());
        getVisualizarVeiculo().setaVisualizacao();
        veiculoUI.setEnabled(false);
    }
    
    public void fechaVisualizacaoVeiculoParaEdicao(){
        getVisualizarVeiculo().dispose();
        abreEdicaoVeiculo();
    }
    
    public void fechaVisualizacaoVeiculo(){
        getVisualizarVeiculo().dispose();
        veiculoUI.setEnabled(true);
        veiculoUI.setVeiculoAux(null);
        veiculoUI.setagemInicial();
        sistemaUI.toFront();
        veiculoUI.veiculoBuscaTodos();
        veiculoUI.toFront();
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
     * @return the veiculoUI
     */
    public VeiculoUI getVeiculoUI() {
        return veiculoUI;
    }

    /**
     * @param veiculoUI the veiculoUI to set
     */
    public void setVeiculoUI(VeiculoUI veiculoUI) {
        this.veiculoUI = veiculoUI;
    }

    /**
     * @return the veiculoAux
     */
    public Veiculo getVeiculoAux() {
        return veiculoAux;
    }

    /**
     * @param veiculoAux the veiculoAux to set
     */
    public void setVeiculoAux(Veiculo veiculoAux) {
        this.veiculoAux = veiculoAux;
    }

    /**
     * @return the criarVeiculo
     */
    public CriarVeiculo getCriarVeiculo() {
        return criarVeiculo;
    }

    /**
     * @param criarVeiculo the criarVeiculo to set
     */
    public void setCriarVeiculo(CriarVeiculo criarVeiculo) {
        this.criarVeiculo = criarVeiculo;
    }

    /**
     * @return the editarVeiculo
     */
    public EditarVeiculo getEditarVeiculo() {
        return editarVeiculo;
    }

    /**
     * @param editarVeiculo the editarVeiculo to set
     */
    public void setEditarVeiculo(EditarVeiculo editarVeiculo) {
        this.editarVeiculo = editarVeiculo;
    }

    /**
     * @return the visualizarVeiculo
     */
    public VisualizarVeiculo getVisualizarVeiculo() {
        return visualizarVeiculo;
    }

    /**
     * @param visualizarVeiculo the visualizarVeiculo to set
     */
    public void setVisualizarVeiculo(VisualizarVeiculo visualizarVeiculo) {
        this.visualizarVeiculo = visualizarVeiculo;
    }

    
}
