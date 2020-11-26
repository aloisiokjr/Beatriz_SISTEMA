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
public class Fornecedor {
    private String Razao_Social;
    private String Nome_Fantasia;
    private String Tipo;
    private String CPF_CNPJ;
    private String Telefone;
    private String Celular;
    private String Email;
    private String Responsavel;
    private String CEP;
    private String Logradouro;
    private String Numero;
    private String Complemento;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String Observacao;
    
    public Fornecedor(String Razao_Social,String Nome_Fantasia,String Tipo, String CPF_CNPJ,String Telefone,String Celular,String Email,
            String Responsavel,String CEP,String Logradouro,String Numero,String Complemento,String Bairro,String Cidade,String UF,String Observacao){
        this.Razao_Social = Razao_Social;
        this.Nome_Fantasia = Nome_Fantasia;
        this.Tipo = Tipo;
        this.CPF_CNPJ = CPF_CNPJ;
        this.Telefone = Telefone;
        this.Celular = Celular;
        this.Email = Email;
        this.Responsavel = Responsavel;
        this.CEP = CEP;
        this.Logradouro = Logradouro;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.UF = UF;
        this.Observacao = Observacao;
    }

    /**
     * @return the Razao_Social
     */
    public String getRazao_Social() {
        return Razao_Social;
    }

    /**
     * @param Razao_Social the Razao_Social to set
     */
    public void setRazao_Social(String Razao_Social) {
        this.Razao_Social = Razao_Social;
    }

    /**
     * @return the Nome_Fantasia
     */
    public String getNome_Fantasia() {
        return Nome_Fantasia;
    }

    /**
     * @param Nome_Fantasia the Nome_Fantasia to set
     */
    public void setNome_Fantasia(String Nome_Fantasia) {
        this.Nome_Fantasia = Nome_Fantasia;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }


    /**
     * @return the CPF_CNPJ
     */
    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    /**
     * @param CPF_CNPJ the CPF_CNPJ to set
     */
    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Responsavel
     */
    public String getResponsavel() {
        return Responsavel;
    }

    /**
     * @param Responsavel the Responsavel to set
     */
    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }


    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Logradouro
     */
    public String getLogradouro() {
        return Logradouro;
    }

    /**
     * @param Logradouro the Logradouro to set
     */
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    /**
     * @return the Numero
     */
    public String getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the Observacao
     */
    public String getObservacao() {
        return Observacao;
    }

    /**
     * @param Observacao the Observacao to set
     */
    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
}
