/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Requisito;
import model.Usuario;
import view.Sistema_UI;
import view.usuario.CriarUsuario;
import view.usuario.EditarUsuario;
import view.usuario.UsuarioUI;

/**
 *
 * @author KLEYN
 */
public class UsuarioController {
    private Sistema_UI sistemaUI = null;
    private UsuarioUI usuarioUI = null;
    private CriarUsuario criarUsuario = null;
    private EditarUsuario editarUsuario = null;
    
    private Usuario usuarioAux = null;
    
    public UsuarioController(Sistema_UI sistemaUI){
        this.sistemaUI = sistemaUI;
    }
    /*
    public void abreUsuarioUI(){
        getSistemaUI().setUsuarioUI(new UsuarioUI(this));
        getSistemaUI().setEnabled(false);
        setUsuarioUI(getSistemaUI().getUsuarioUI());
        getUsuarioUI().admUsuarioBuscaTodos();
        
    }
    
    public void fechaUsuarioUI(){
        getUsuarioUI().dispose();
        getSistemaUI().setEnabled(true);
        getSistemaUI().toFront();
        setUsuarioUI(null);
    }
    
    public void abreCriacaoUsuario(){
        getUsuarioUI().setCriarUsuario(new CriarUsuario(this));
        setCriarUsuario(getUsuarioUI().getCriarUsuario());
        getCriarUsuario().setListaRequisitos(null);
        getCriarUsuario().setListaRequisitos(new ArrayList<>());
        getCriarUsuario().getListaRequisitos().add(new Requisito("Login", false));
        getCriarUsuario().getListaRequisitos().add(new Requisito("Nome", false));
        getCriarUsuario().getListaRequisitos().add(new Requisito("Senha", false));
        getUsuarioUI().setEnabled(false);
        
    }
    
    public void fechaCriacaoUsuario(){
        getCriarUsuario().dispose();
        setCriarUsuario(null);
        getSistemaUI().toFront();
        getUsuarioUI().setEnabled(true);
        getUsuarioUI().toFront();
        getUsuarioUI().setagemInicial();
        getUsuarioUI().usuarioBuscaTodos();
    }
    
    public void abreEdicaoUsuario(){
        getUsuarioUI().setEditarUsuario(new EditarUsuario(this, getUsuarioUI().getUsuarioAux()));
        setEditarUsuario(getUsuarioUI().getEditarUsuario());
        getEditarUsuario().setControleOp(true);
        getEditarUsuario().setListaRequisitos(null);
        getEditarUsuario().setListaRequisitos(new ArrayList<>());
        getEditarUsuario().getListaRequisitos().add(new Requisito("Login", true));
        getEditarUsuario().getListaRequisitos().add(new Requisito("Nome", true));
        getEditarUsuario().getListaRequisitos().add(new Requisito("Senha", true));
        getEditarUsuario().setaEdicaoUsuario();
        getUsuarioUI().setEnabled(false);
    }
    
    public void fechaEdicaoUsuario(){
        getEditarUsuario().dispose();
        getUsuarioUI().setEnabled(true);
        getUsuarioUI().setUsuarioAux(null);
        getSistemaUI().toFront();
        getUsuarioUI().toFront();
        getSistemaUI().atualizaDados();
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
     * @return the usuarioUI
     */
    public UsuarioUI getUsuarioUI() {
        return usuarioUI;
    }

    /**
     * @param usuarioUI the usuarioUI to set
     */
    public void setUsuarioUI(UsuarioUI usuarioUI) {
        this.usuarioUI = usuarioUI;
    }

    /**
     * @return the criarUsuario
     */
    public CriarUsuario getCriarUsuario() {
        return criarUsuario;
    }

    /**
     * @param criarUsuario the criarUsuario to set
     */
    public void setCriarUsuario(CriarUsuario criarUsuario) {
        this.criarUsuario = criarUsuario;
    }

    /**
     * @return the editarUsuario
     */
    public EditarUsuario getEditarUsuario() {
        return editarUsuario;
    }

    /**
     * @param editarUsuario the editarUsuario to set
     */
    public void setEditarUsuario(EditarUsuario editarUsuario) {
        this.editarUsuario = editarUsuario;
    }

    /**
     * @return the usuarioAux
     */
    public Usuario getUsuarioAux() {
        return usuarioAux;
    }

    /**
     * @param usuarioAux the usuarioAux to set
     */
    public void setUsuarioAux(Usuario usuarioAux) {
        this.usuarioAux = usuarioAux;
    }
}
