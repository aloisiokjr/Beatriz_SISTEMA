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
public class Peca {
    private String codigo = null;
    private String descricao = null;
    private String precoCompra = null;
    private String margemLucro = null;
    private String precoVenda = null;
    private String marca = null;
    private String modelo = null;
    private String ano = null;
    private ArrayList<Especificacao> listaEspecificacoes = null;
    private ArrayList<String> listaNomesVariantes = null;

    public Peca(String codigo, String descricao, String precoCompra, String margemLucro, String precoVenda, String marca, String modelo, String ano, ArrayList listaEspecificacoes, ArrayList listaNomesVariantes){
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.listaEspecificacoes = listaEspecificacoes;
        this.listaNomesVariantes = listaNomesVariantes;
    }
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the precoCompra
     */
    public String getPrecoCompra() {
        return precoCompra;
    }

    /**
     * @param precoCompra the precoCompra to set
     */
    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * @return the margemLucro
     */
    public String getMargemLucro() {
        return margemLucro;
    }

    /**
     * @param margemLucro the margemLucro to set
     */
    public void setMargemLucro(String margemLucro) {
        this.margemLucro = margemLucro;
    }

    /**
     * @return the precoVenda
     */
    public String getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the listaEspecificacoes
     */
    public ArrayList<Especificacao> getListaEspecificacoes() {
        return listaEspecificacoes;
    }

    /**
     * @param listaEspecificacoes the listaEspecificacoes to set
     */
    public void setListaEspecificacoes(ArrayList<Especificacao> listaEspecificacoes) {
        this.listaEspecificacoes = listaEspecificacoes;
    }

    /**
     * @return the listaNomesVariantes
     */
    public ArrayList<String> getListaNomesVariantes() {
        return listaNomesVariantes;
    }

    /**
     * @param listaNomesVariantes the listaNomesVariantes to set
     */
    public void setListaNomesVariantes(ArrayList<String> listaNomesVariantes) {
        this.listaNomesVariantes = listaNomesVariantes;
    }
    
    
}
