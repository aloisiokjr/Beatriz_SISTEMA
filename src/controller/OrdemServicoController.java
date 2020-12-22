/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.OrdemServico;
import view.Sistema_UI;
import view.ordemServico.OrdemServicoOP;
import view.ordemServico.OrdemServicoUI;
import view.ordemServico.lancamentoOrdemServico;

/**
 *
 * @author KLEYN
 */
public class OrdemServicoController {
    private Sistema_UI sistemaUI = null;
    private OrdemServicoUI osUI = null;
    private lancamentoOrdemServico lancamentoOS = null;
    private OrdemServicoOP osOP = null;
    private OrdemServico osAux = null;

    
    public OrdemServicoController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }
    
    public void abreOSUI(){
        sistemaUI.setOsUI(new OrdemServicoUI(this));
        sistemaUI.setEnabled(false);
        setOsUI(sistemaUI.getOsUI());
        osUI.oSBuscaTodos();

    }

    public void fechaOSUI(){
        osUI.dispose();
        sistemaUI.setEnabled(true);
        sistemaUI.toFront();
        setOsUI(null);
    }
    
    public void abreLancamentoOS(){
        osUI.setLancamentoOS(new lancamentoOrdemServico(this));
        setLancamentoOS(osUI.getLancamentoOS());
        osUI.setEnabled(false);
    }
    
    public void fechaLancamentoOS(){
        getLancamentoOS().dispose();
        setLancamentoOS(null);
        sistemaUI.toFront();
        osUI.setEnabled(true);
        osUI.toFront();
        osUI.setagemInicial();
        osUI.oSBuscaTodos();
    }
    
    public void abreAcompanhamentoOS(){
        osUI.setOsOP(new OrdemServicoOP(this, osUI.getOsAux()));
        setOsOP(osUI.getOsOP());
        setOsAux(osUI.getOsAux());
        osUI.setEnabled(false);
    }
    
    public void fechaAcompanhamentoOS(){
        getOsOP().dispose();
        setOsOP(null);
        setOsAux(null);
        sistemaUI.toFront();
        osUI.setEnabled(true);
        osUI.toFront();
        osUI.setagemInicial();
        osUI.oSBuscaTodos();
    }
    
    /**
     * @return the osUI
     */
    public OrdemServicoUI getOsUI() {
        return osUI;
    }

    /**
     * @param osUI the osUI to set
     */
    public void setOsUI(OrdemServicoUI osUI) {
        this.osUI = osUI;
    }

    /**
     * @return the lancamentoOS
     */
    public lancamentoOrdemServico getLancamentoOS() {
        return lancamentoOS;
    }

    /**
     * @param lancamentoOS the lancamentoOS to set
     */
    public void setLancamentoOS(lancamentoOrdemServico lancamentoOS) {
        this.lancamentoOS = lancamentoOS;
    }

    /**
     * @return the osOP
     */
    public OrdemServicoOP getOsOP() {
        return osOP;
    }

    /**
     * @param osOP the osOP to set
     */
    public void setOsOP(OrdemServicoOP osOP) {
        this.osOP = osOP;
    }

    /**
     * @return the osAux
     */
    public OrdemServico getOsAux() {
        return osAux;
    }

    /**
     * @param osAux the osAux to set
     */
    public void setOsAux(OrdemServico osAux) {
        this.osAux = osAux;
    }
}
