/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KLEYN
 */
public class Veiculo {
    private String Placa = null;
    private String Marca = null;
    private String Modelo = null;
    private String Pais = null;
    private String Renavam = null;
    private String Ano = null;
    private String NumeroEixos = null;
    private String Chassi = null;
    private String NroMotor = null;
    private String Cor = null;


    public Veiculo (String Placa, String Marca, String Modelo, String Pais, String Renavam, String Ano, String NumeroEixos, String Chassi, String NroMotor, String Cor){
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Pais = Pais;
        this.Renavam = Renavam;
        this.Ano = Ano;
        this.NumeroEixos = NumeroEixos;
        this.Chassi = Chassi;
        this.NroMotor = NroMotor;
        this.Cor = Cor;
    }

    /**
     * @return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    /**
     * @return the Renavam
     */
    public String getRenavam() {
        return Renavam;
    }

    /**
     * @param Renavam the Renavam to set
     */
    public void setRenavam(String Renavam) {
        this.Renavam = Renavam;
    }

    /**
     * @return the Ano
     */
    public String getAno() {
        return Ano;
    }

    /**
     * @param Ano the Ano to set
     */
    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    /**
     * @return the NumeroEixos
     */
    public String getNumeroEixos() {
        return NumeroEixos;
    }

    /**
     * @param NumeroEixos the NumeroEixos to set
     */
    public void setNumeroEixos(String NumeroEixos) {
        this.NumeroEixos = NumeroEixos;
    }

    /**
     * @return the Chassi
     */
    public String getChassi() {
        return Chassi;
    }

    /**
     * @param Chassi the Chassi to set
     */
    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    /**
     * @return the Cor
     */
    public String getCor() {
        return Cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    /**
     * @return the NroMotor
     */
    public String getNroMotor() {
        return NroMotor;
    }

    /**
     * @param NroMotor the NroMotor to set
     */
    public void setNroMotor(String NroMotor) {
        this.NroMotor = NroMotor;
    }
    
}
