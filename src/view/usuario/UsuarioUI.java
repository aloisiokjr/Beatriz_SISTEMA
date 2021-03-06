/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.usuario;

import controller.UsuarioController;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.Usuario;

/**
 *
 * @author KLEYN
 */
public class UsuarioUI extends javax.swing.JFrame {

    private UsuarioController usuarioController = null;
    private Usuario usuarioAux = null;
    private CriarUsuario criarUsuario = null;
    private EditarUsuario editarUsuario = null;  
    /**
     * Creates new form UsuarioUI
     * @param controller
     */
    public UsuarioUI(UsuarioController controller) {
        this.usuarioController = controller;
        initComponents();
        this.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DefaultTableModel modeloTabelaUsuario = new DefaultTableModel();
        modeloTabelaUsuario.addColumn("");
        modeloTabelaUsuario.addColumn("Login");
        modeloTabelaUsuario.addColumn("Nome");
        modeloTabelaUsuario.addColumn("Tipo de Usuário");
        tabelaUsuarios = new JTable(modeloTabelaUsuario);
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnEditar.setEnabled(false);
        btnExcluir = new javax.swing.JButton();
        btnExcluir.setEnabled(false);
        btnCriar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        campoBusca = new javax.swing.JTextField();
        jRadioButton_Login = new javax.swing.JRadioButton();
        jRadioButton_Nome = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBoxTipos = new javax.swing.JComboBox<>();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setMinimumSize(new java.awt.Dimension(1560, 810));
        jPanel1.setPreferredSize(new java.awt.Dimension(1560, 810));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("LISTA DE USUÁRIOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 240, 50);

        tabelaUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Login", "Nome", "Tipo de Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.setFocusable(false);
        tabelaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaUsuarios.setShowGrid(true);
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaUsuarios);
        tabelaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 80, 530, 550);

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CONTROLES");

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        btnEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEditarKeyPressed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        btnExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExcluirKeyPressed(evt);
            }
        });

        btnCriar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCriar.setText("CRIAR");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });
        btnCriar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCriarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnCriar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(610, 80, 300, 210);

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("BUSCAR POR");

        campoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscaKeyPressed(evt);
            }
        });

        jRadioButton_Login.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton_Login.setText("LOGIN");
        jRadioButton_Login.setActionCommand("");
        jRadioButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_LoginActionPerformed(evt);
            }
        });

        jRadioButton_Nome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton_Nome.setText("NOME");
        jRadioButton_Nome.setActionCommand("");
        jRadioButton_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_NomeActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Tipo de Usuário:");

        comboBoxTipos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        comboBoxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Administrador", "Operador" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_Login)
                            .addComponent(jRadioButton_Nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Login)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Nome)
                    .addComponent(comboBoxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(610, 310, 300, 250);

        btnFechar.setBackground(new java.awt.Color(145, 0, 0));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar);
        btnFechar.setBounds(700, 590, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1510, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        if (tabelaUsuarios.getSelectedRow() > -1) {
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        usuarioAlterar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuarioAlterar();
        }
    }//GEN-LAST:event_btnEditarKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
//        try {
//            usuarioExcluir();
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(UsuarioUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            try {
//                usuarioExcluir();
//            } catch (ClassNotFoundException | SQLException ex) {
//                Logger.getLogger(UsuarioUI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        this.setEnabled(false);
//        usuarioController.abreCriacaoUsuario();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnCriarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCriarKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            this.setEnabled(false);
//            usuarioController.abreCriacaoUsuario();
//        }
    }//GEN-LAST:event_btnCriarKeyPressed

    private void campoBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuarioBuscar();
        }
    }//GEN-LAST:event_campoBuscaKeyPressed

    private void jRadioButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_LoginActionPerformed

    private void jRadioButton_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_NomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        usuarioBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuarioBuscar();
        }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
//        usuarioController.fechaUsuarioUI();
    }//GEN-LAST:event_btnFecharActionPerformed

    public void setagemInicial(){
        
    }
    public void usuarioBuscaTodos(){
        
    }
    
    private void usuarioAlterar(){
    
    }
    
    private void usuarioBuscar(){
        
    }
    
    private void usuarioExcluir(){
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JComboBox<String> comboBoxTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_Login;
    private javax.swing.JRadioButton jRadioButton_Nome;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables

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
}
