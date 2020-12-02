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
public class Cliente {
    
    private String nome = null;
    private String razaoSocial = null;
    private String nomeFantasia = null;
    private String tipoCliente = null;
    private String cpf_cnpj = null;
    private ArrayList<String> listaNomes = null;
    
    public Cliente(String nome, String razaoSocial, String nomeFantasia, String tipoCliente, String cpf_cnpj, ArrayList<String> listaNomes){
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.tipoCliente = tipoCliente;
        this.cpf_cnpj = cpf_cnpj;
        this.listaNomes = listaNomes;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the cpf_cnpj
     */
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    /**
     * @param cpf_cnpj the cpf_cnpj to set
     */
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    /**
     * @return the listaNomes
     */
    public ArrayList<String> getListaNomes() {
        return listaNomes;
    }

    /**
     * @param listaNomes the listaNomes to set
     */
    public void setListaNomes(ArrayList<String> listaNomes) {
        this.listaNomes = listaNomes;
    }
    
    
}
