/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author KLEYN
 */
public class OrdemServico {
    private String NumOS = null;
    private String DocCliente = null;
    private String VeiculoPlaca = null;
    private String NomeMotorista = null;
    private String CPFMotorista = null;
    private String Data = null;
    private String Status = null;
    private ArrayList<Arquivo> listaArquivos = null;
    private ArrayList<SituacaoOS> listaSituacao = null;
    
    public OrdemServico(String NumOS,String DocCliente,String VeiculoPlaca,String NomeMotorista,String CPFMotorista,String Data,String Status,ArrayList<Arquivo> listaArquivos,ArrayList<SituacaoOS> listaSituacao){
        this.NumOS = NumOS;
        this.DocCliente = DocCliente;
        this.VeiculoPlaca = VeiculoPlaca;
        this.NomeMotorista = NomeMotorista;
        this.CPFMotorista = CPFMotorista;
        this.Data = Data;
        this.Status = Status;
        this.listaArquivos = listaArquivos;
        this.listaSituacao = listaSituacao;
    }
    
    /**
     * @return the NumOS
     */
    public String getNumOS() {
        return NumOS;
    }

    /**
     * @param NumOS the NumOS to set
     */
    public void setNumOS(String NumOS) {
        this.NumOS = NumOS;
    }

    /**
     * @return the DocCliente
     */
    public String getDocCliente() {
        return DocCliente;
    }

    /**
     * @param DocCliente the DocCliente to set
     */
    public void setDocCliente(String DocCliente) {
        this.DocCliente = DocCliente;
    }

    /**
     * @return the VeiculoPlaca
     */
    public String getVeiculoPlaca() {
        return VeiculoPlaca;
    }

    /**
     * @param VeiculoPlaca the VeiculoPlaca to set
     */
    public void setVeiculoPlaca(String VeiculoPlaca) {
        this.VeiculoPlaca = VeiculoPlaca;
    }

    /**
     * @return the NomeMotorista
     */
    public String getNomeMotorista() {
        return NomeMotorista;
    }

    /**
     * @param NomeMotorista the NomeMotorista to set
     */
    public void setNomeMotorista(String NomeMotorista) {
        this.NomeMotorista = NomeMotorista;
    }

    /**
     * @return the CPFMotorista
     */
    public String getCPFMotorista() {
        return CPFMotorista;
    }

    /**
     * @param CPFMotorista the CPFMotorista to set
     */
    public void setCPFMotorista(String CPFMotorista) {
        this.CPFMotorista = CPFMotorista;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the listaSituacao
     */
    public ArrayList<SituacaoOS> getListaSituacao() {
        return listaSituacao;
    }

    /**
     * @param listaSituacao the listaSituacao to set
     */
    public void setListaSituacao(ArrayList<SituacaoOS> listaSituacao) {
        this.listaSituacao = listaSituacao;
    }

    /**
     * @return the listaArquivos
     */
    public ArrayList<Arquivo> getListaArquivos() {
        return listaArquivos;
    }

    /**
     * @param listaArquivos the listaArquivos to set
     */
    public void setListaArquivos(ArrayList<Arquivo> listaArquivos) {
        this.listaArquivos = listaArquivos;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }
}
