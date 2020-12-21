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
public class SituacaoOS implements Cloneable {
    private String Data = null;
    private String NumSituacao = null;
    private String NumeroOS = null;
    private String Codigo = null;
    private String Descricao = null;
    private String Status = null;
    private String DataEntrega = null;
    
    private ArrayList<Arquivo> listaArquivos = null;
    
    public SituacaoOS(){
    
    }
    
    public SituacaoOS(String Data,String NumSituacao,String NumeroOS,String Codigo,String Descricao,String Status,String DataEntrega,ArrayList<Arquivo> listaArquivos){
        this.Data = Data;
        this.NumSituacao = NumSituacao;
        this.NumeroOS = NumeroOS;
        this.Codigo = Codigo;
        this.Descricao = Descricao;
        this.Status = Status;
        this.DataEntrega = DataEntrega;
        this.listaArquivos = listaArquivos;
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
     * @return the NumeroOS
     */
    public String getNumeroOS() {
        return NumeroOS;
    }

    /**
     * @param NumeroOS the NumeroOS to set
     */
    public void setNumeroOS(String NumeroOS) {
        this.NumeroOS = NumeroOS;
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
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
    
    @Override
    public SituacaoOS clone () throws CloneNotSupportedException{
        return (SituacaoOS) super.clone();
    }

    /**
     * @return the DataPrevisao
     */
    public String getDataEntrega() {
        return DataEntrega;
    }

    /**
     * @param DataEntrega the DataPrevisao to set
     */
    public void setDataEntrega(String DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    /**
     * @return the NumSituacao
     */
    public String getNumSituacao() {
        return NumSituacao;
    }

    /**
     * @param NumSituacao the NumSituacao to set
     */
    public void setNumSituacao(String NumSituacao) {
        this.NumSituacao = NumSituacao;
    }
    
}
