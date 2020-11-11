/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Emprestimo;
import view.Sistema_UI;
import view.emprestimo.CriarEmprestimo;
import view.emprestimo.EditarEmprestimo;
import view.emprestimo.EmprestimoUI;
import view.emprestimo.VisualizarEmprestimo;

/**
 *
 * @author KLEYN
 */
public class EmprestimoController {
    private Sistema_UI sistemaUI = null;
    private EmprestimoUI emprestimoUI = null;
    private CriarEmprestimo criarEmprestimo = null;
    private EditarEmprestimo editarEmprestimo = null;
    private VisualizarEmprestimo visualizarEmprestimo = null;
    
    private Emprestimo emprestimoAux = null;
    
    public EmprestimoController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }

    public void abreEmprestimoUI(){
    sistemaUI.setEmprestimoUI(new EmprestimoUI(this));
    sistemaUI.setEnabled(false);
    setEmprestimoUI(sistemaUI.getEmprestimoUI());
    emprestimoUI.emprestimoBuscaTodos();
    
}

    public void fechaEmprestimoUI(){
        emprestimoUI.dispose();
        sistemaUI.setEnabled(true);
        sistemaUI.toFront();
        setEmprestimoUI(null);
    }

    public void abreCriacaoEmprestimo(){
        emprestimoUI.setCriarEmprestimo(new CriarEmprestimo(this));
        setCriarEmprestimo(emprestimoUI.getCriarEmprestimo());
        getCriarEmprestimo().setagemInicial();
        emprestimoUI.setEnabled(false);

    }

    public void fechaCriacaoEmprestimo(){
        getCriarEmprestimo().dispose();
        setCriarEmprestimo(null);
        sistemaUI.toFront();
        emprestimoUI.setEnabled(true);
        emprestimoUI.toFront();
        emprestimoUI.setagemInicial();
        emprestimoUI.emprestimoBuscaTodos();
    }

    
    public void abreEdicaoEmprestimo(){
        emprestimoUI.setEditarEmprestimo(new EditarEmprestimo(this, emprestimoUI.getEmprestimoAux()));
        setEditarEmprestimo(emprestimoUI.getEditarEmprestimo());
        getEditarEmprestimo().setagemInicial();
        emprestimoUI.setEnabled(false);
    }
    
    public void fechaEdicaoEmprestimo(){
        getEditarEmprestimo().dispose();
        emprestimoUI.setEnabled(true);
        emprestimoUI.setEmprestimoAux(null);
        sistemaUI.toFront();
        emprestimoUI.toFront();
        sistemaUI.atualizaDados();
    }
    
    public void abreVisualizacaoEmprestimo(){
//        emprestimoUI.setVisualizarEmprestimo(new VisualizarEmprestimo(this, emprestimoUI.getEmprestimoAux()));
//        setVisualizarEmprestimo(emprestimoUI.getVisualizarEmprestimo());
//        getVisualizarEmprestimo().setaVisualizacao();
//        emprestimoUI.setEnabled(false);
    }
    
    public void fechaVisualizacaoEmprestimo(){
        getVisualizarEmprestimo().dispose();
        emprestimoUI.setEnabled(true);
        emprestimoUI.setEmprestimoAux(null);
        sistemaUI.toFront();
        emprestimoUI.toFront();
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
     * @return the emprestimoUI
     */
    public EmprestimoUI getEmprestimoUI() {
        return emprestimoUI;
    }

    /**
     * @param emprestimoUI the emprestimoUI to set
     */
    public void setEmprestimoUI(EmprestimoUI emprestimoUI) {
        this.emprestimoUI = emprestimoUI;
    }

    /**
     * @return the emprestimoAux
     */
    public Emprestimo getEmprestimoAux() {
        return emprestimoAux;
    }

    /**
     * @param emprestimoAux the emprestimoAux to set
     */
    public void setEmprestimoAux(Emprestimo emprestimoAux) {
        this.emprestimoAux = emprestimoAux;
    }

    /**
     * @return the criarEmprestimo
     */
    public CriarEmprestimo getCriarEmprestimo() {
        return criarEmprestimo;
    }

    /**
     * @param criarEmprestimo the criarEmprestimo to set
     */
    public void setCriarEmprestimo(CriarEmprestimo criarEmprestimo) {
        this.criarEmprestimo = criarEmprestimo;
    }

    /**
     * @return the editarEmprestimo
     */
    public EditarEmprestimo getEditarEmprestimo() {
        return editarEmprestimo;
    }

    /**
     * @param editarEmprestimo the editarEmprestimo to set
     */
    public void setEditarEmprestimo(EditarEmprestimo editarEmprestimo) {
        this.editarEmprestimo = editarEmprestimo;
    }

    /**
     * @return the visualizarEmprestimo
     */
    public VisualizarEmprestimo getVisualizarEmprestimo() {
        return visualizarEmprestimo;
    }

    /**
     * @param visualizarEmprestimo the visualizarEmprestimo to set
     */
    public void setVisualizarEmprestimo(VisualizarEmprestimo visualizarEmprestimo) {
        this.visualizarEmprestimo = visualizarEmprestimo;
    }
}
