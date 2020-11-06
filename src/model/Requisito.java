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
public class Requisito {
    private String requisito;
    private boolean isOk;
    
    public Requisito(String requisito, boolean isOk){
        this.requisito = requisito;
        this.isOk = isOk;
    }

    /**
     * @return the requisito
     */
    public String getRequisito() {
        return requisito;
    }

    /**
     * @param requisito the requisito to set
     */
    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    /**
     * @return the isOk
     */
    public boolean isIsOk() {
        return isOk;
    }

    /**
     * @param isOk the isOk to set
     */
    public void setIsOk(boolean isOk) {
        this.isOk = isOk;
    }
    
}
