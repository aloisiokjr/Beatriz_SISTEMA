/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.SQL_URL;
import util.ToHashHex;

/**
 *
 * @author KLEYN
 */
public class Login_UI extends javax.swing.JFrame {
    
    private String loginCheck = null;
    private String nomeCheck = null;
    private boolean isLoginOk = false;
    
    /**
     * Creates new form Login_UI
     */
    public Login_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeSistema = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        textENTRAR = new javax.swing.JLabel();
        caixaLogin = new javax.swing.JTextField();
        caixaSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        textUsuario = new javax.swing.JLabel();
        textSAIR = new javax.swing.JLabel();
        fundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nomeSistema.setFont(new java.awt.Font("Times New Roman", 3, 22)); // NOI18N
        nomeSistema.setForeground(new java.awt.Color(0, 102, 0));
        nomeSistema.setText("BEATRIZ IMPLEMENTOS (LOGO)");
        getContentPane().add(nomeSistema);
        nomeSistema.setBounds(80, 180, 350, 50);

        btnEntrar.setForeground(new java.awt.Color(240, 240, 240));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N
        btnEntrar.setToolTipText("ENTRAR");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(180, 390, 60, 70);

        textENTRAR.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        textENTRAR.setForeground(new java.awt.Color(0, 102, 51));
        textENTRAR.setText("SAIR");
        getContentPane().add(textENTRAR);
        textENTRAR.setBounds(290, 450, 50, 12);

        caixaLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaLogin.setToolTipText("Login do Usuário");
        caixaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caixaLogin.setMargin(new java.awt.Insets(4, 4, 4, 4));
        caixaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaLoginKeyPressed(evt);
            }
        });
        getContentPane().add(caixaLogin);
        caixaLogin.setBounds(150, 310, 220, 20);

        caixaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaSenha.setToolTipText("Senha do Usuário");
        caixaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caixaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaSenhaActionPerformed(evt);
            }
        });
        caixaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(caixaSenha);
        caixaSenha.setBounds(150, 360, 220, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("SENHA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 340, 50, 20);

        btnSair.setForeground(new java.awt.Color(240, 240, 240));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout2.png"))); // NOI18N
        btnSair.setToolTipText("SAIR");
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        btnSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSairKeyPressed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(260, 390, 80, 70);

        textUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(0, 102, 51));
        textUsuario.setText("LOGIN");
        getContentPane().add(textUsuario);
        textUsuario.setBounds(150, 290, 50, 20);

        textSAIR.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        textSAIR.setForeground(new java.awt.Color(0, 102, 51));
        textSAIR.setText("ENTRAR");
        getContentPane().add(textSAIR);
        textSAIR.setBounds(190, 450, 70, 12);

        fundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backgroundLogin2.jpg"))); // NOI18N
        getContentPane().add(fundoLogin);
        fundoLogin.setBounds(0, 0, 530, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            this.processaLogin();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                this.processaLogin();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void caixaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                this.processaLogin();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_caixaLoginKeyPressed

    private void caixaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaSenhaActionPerformed

    private void caixaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                this.processaLogin();
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Login_UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_caixaSenhaKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSairKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairKeyPressed

    private void processaLogin() throws UnsupportedEncodingException, NoSuchAlgorithmException{
        String senhaUser = new String(caixaSenha.getPassword());
        senhaUser = ToHashHex.toHexSHA256(senhaUser);
        
        if (caixaLogin.getText().equals("")){
            JOptionPane.showMessageDialog(null,"A caixa 'Login' está vazia... Insira um login válido.");
        } else if (senhaUser.equals("")){
            JOptionPane.showMessageDialog(null,"A caixa 'Senha' está vazia... Insira uma senha válida.");
        } else{
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = SQL_URL.getUrl();
                try (Connection con = DriverManager.getConnection(url)) {
                    String sql = "SELECT * FROM Usuario WHERE Login = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, caixaLogin.getText());
                    ResultSet rs = pst.executeQuery();
                    if(!rs.next()){
                        JOptionPane.showMessageDialog(null, "Usuário '"+caixaLogin.getText()+"' não encontrado. Tente novamente...");

                    } else{
                        sql = "SELECT * FROM Usuario WHERE Login = ? AND Senha = ?";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, caixaLogin.getText());
                        pst.setString(2, senhaUser);
                        rs = pst.executeQuery();
                        if(rs.next()){
                            Sistema_UI sistemaUI = new Sistema_UI();
                            sistemaUI.setLoginCheck(rs.getString("Login"));
                            sistemaUI.setNomeCheck(rs.getString("Nome"));
                            sistemaUI.atualizaDados();
                            
                            JOptionPane.showMessageDialog(null, "Seja bem-vindo(a), "+rs.getString("Nome")+"... ");
                            
                            this.dispose();
                            sistemaUI.setVisible(true);
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Senha incorreta. Tente novamente...");
                        }
                    } 
                }
            } catch(HeadlessException | ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
            this.caixaSenha.setText("");
        }
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
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField caixaLogin;
    private javax.swing.JPasswordField caixaSenha;
    private javax.swing.JLabel fundoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeSistema;
    private javax.swing.JLabel textENTRAR;
    private javax.swing.JLabel textSAIR;
    private javax.swing.JLabel textUsuario;
    // End of variables declaration//GEN-END:variables
}