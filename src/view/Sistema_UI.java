/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.PecasController;
import controller.UsuarioController;
import javax.swing.JFrame;
import model.Peca;
import model.Usuario;
import view.peca.PecaUI;
import view.usuario.UsuarioUI;

/**
 *
 * @author KLEYN
 */
public class Sistema_UI extends javax.swing.JFrame {
    
    private String loginCheck = null;
    private String nomeCheck = null;
    
    private PecasController pecasController = null;
    private UsuarioController usuarioController = null;
    
    private Usuario usuarioAux = null;
    private Peca pecaAux = null;
    
    private UsuarioUI usuarioUI = null;
    private PecaUI pecaUI = null;
    
    /**
     * Creates new form Sistema_UI
     */
    public Sistema_UI() {
        this.usuarioController = new UsuarioController(this);
        this.pecasController = new PecasController(this);
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.toFront();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        boxUsuario = new javax.swing.JTextArea();
        barraMenuADM = new javax.swing.JMenuBar();
        menuADM = new javax.swing.JMenu();
        menuADM_Usuario = new javax.swing.JMenuItem();
        menuADM_Pecas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuSair_Logoff = new javax.swing.JMenuItem();
        menuSair_Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        boxUsuario.setBackground(new java.awt.Color(227, 227, 227));
        boxUsuario.setColumns(20);
        boxUsuario.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        boxUsuario.setForeground(new java.awt.Color(0, 102, 0));
        boxUsuario.setRows(1);
        boxUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        boxUsuario.setDisabledTextColor(new java.awt.Color(0, 102, 51));
        boxUsuario.setEnabled(false);
        jScrollPane1.setViewportView(boxUsuario);

        barraMenuADM.setForeground(new java.awt.Color(0, 102, 0));
        barraMenuADM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barraMenuADM.setName("barraMenuADM"); // NOI18N

        menuADM.setText("Administração");

        menuADM_Usuario.setText("Usuários");
        menuADM_Usuario.setBorderPainted(true);
        menuADM_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuADM_UsuarioActionPerformed(evt);
            }
        });
        menuADM.add(menuADM_Usuario);

        menuADM_Pecas.setText("Peças");
        menuADM_Pecas.setToolTipText("");
        menuADM_Pecas.setBorderPainted(true);
        menuADM_Pecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuADM_PecasActionPerformed(evt);
            }
        });
        menuADM.add(menuADM_Pecas);

        barraMenuADM.add(menuADM);

        menuSair.setText("Sair");

        menuSair_Logoff.setText("Logoff");
        menuSair_Logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSair_LogoffActionPerformed(evt);
            }
        });
        menuSair.add(menuSair_Logoff);

        menuSair_Sair.setText("Sair");
        menuSair_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSair_SairActionPerformed(evt);
            }
        });
        menuSair.add(menuSair_Sair);

        barraMenuADM.add(menuSair);

        setJMenuBar(barraMenuADM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 767, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuADM_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuADM_UsuarioActionPerformed
        //usuarioController.abreUsuarioUI();
    }//GEN-LAST:event_menuADM_UsuarioActionPerformed

    private void menuADM_PecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuADM_PecasActionPerformed
        getPecasController().abrePecaUI();
    }//GEN-LAST:event_menuADM_PecasActionPerformed

    private void menuSair_LogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSair_LogoffActionPerformed
        Login_UI loginUI = new Login_UI();
        loginUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuSair_LogoffActionPerformed

    private void menuSair_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSair_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSair_SairActionPerformed

    public void atualizaDados(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuADM;
    private javax.swing.JTextArea boxUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuADM;
    private javax.swing.JMenuItem menuADM_Pecas;
    private javax.swing.JMenuItem menuADM_Usuario;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSair_Logoff;
    private javax.swing.JMenuItem menuSair_Sair;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the pecasController
     */
    public PecasController getPecasController() {
        return pecasController;
    }

    /**
     * @param pecasController the pecasController to set
     */
    public void setPecasController(PecasController pecasController) {
        this.pecasController = pecasController;
    }

    /**
     * @return the pecaAux
     */
    public Peca getPecaAux() {
        return pecaAux;
    }

    /**
     * @param pecaAux the pecaAux to set
     */
    public void setPecaAux(Peca pecaAux) {
        this.pecaAux = pecaAux;
    }

    /**
     * @return the pecaUI
     */
    public PecaUI getPecaUI() {
        return pecaUI;
    }

    /**
     * @param pecaUI the pecaUI to set
     */
    public void setPecaUI(PecaUI pecaUI) {
        this.pecaUI = pecaUI;
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
     * @return the loginCheck
     */
    public String getLoginCheck() {
        return loginCheck;
    }

    /**
     * @param loginCheck the loginCheck to set
     */
    public void setLoginCheck(String loginCheck) {
        this.loginCheck = loginCheck;
    }

    /**
     * @return the nomeCheck
     */
    public String getNomeCheck() {
        return nomeCheck;
    }

    /**
     * @param nomeCheck the nomeCheck to set
     */
    public void setNomeCheck(String nomeCheck) {
        this.nomeCheck = nomeCheck;
    }

    /**
     * @return the usuarioController
     */
    public UsuarioController getUsuarioController() {
        return usuarioController;
    }

    /**
     * @param usuarioController the usuarioController to set
     */
    public void setUsuarioController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }
}
