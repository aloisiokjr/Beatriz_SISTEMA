/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.emprestimo;

import controller.EmprestimoController;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Emprestimo;
import model.Requisito;
import util.SQL_URL;

/**
 *
 * @author KLEYN
 */
public class EditarEmprestimo extends javax.swing.JFrame {

    private ArrayList<Requisito> listaRequisitos = null;
    private EmprestimoController emprestimoController = null;
    private Emprestimo emprestimoAux = null;
    /**
     * Creates new form EditarEmprestimo
     * @param emprestimoController
     * @param emprestimoAux
     */
    public EditarEmprestimo(EmprestimoController emprestimoController, Emprestimo emprestimoAux) {
        this.emprestimoController = emprestimoController;
        this.emprestimoAux = emprestimoAux;
        initComponents();
        this.setVisible(true);
        this.toFront();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setagemInicial();
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
        jPanel5 = new javax.swing.JPanel();
        btnFecharTela1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        campoItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        campoFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        campoData = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btnFecharTela1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFecharTela1.setText("FECHAR");
        btnFecharTela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharTela1ActionPerformed(evt);
            }
        });
        btnFecharTela1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFecharTela1KeyPressed(evt);
            }
        });

        btnSalvar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar1.setText("SALVAR");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        btnSalvar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvar1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("EDIÇÃO DE EMPRÉSTIMO");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoR.png"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("INFORMAÇÕES GERAIS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Codigo *");

        campoCodigo.setEditable(false);

        campoItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoItemFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Item *");

        campoQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoQuantidadeFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Quantidade *");

        campoFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        campoFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoFuncionarioFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Funcionário *");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ADMINISTRATIVO", "RH", "FATURAMENTO", "ENGENHARIA", "FÁBRICA", "OFICINA" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Setor *");

        try {
            campoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDataFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Data de Empréstimo *");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnFecharTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(520, 520, 520))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFecharTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1676, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1566, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2203, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharTela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharTela1ActionPerformed
        fechaEdicaoEmprestimo();
    }//GEN-LAST:event_btnFecharTela1ActionPerformed

    private void btnFecharTela1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFecharTela1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fechaEdicaoEmprestimo();
        }
    }//GEN-LAST:event_btnFecharTela1KeyPressed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        editaEmprestimo();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnSalvar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvar1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            editaEmprestimo();
        }
    }//GEN-LAST:event_btnSalvar1KeyPressed

    private void campoItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoItemFocusLost
        if (campoItem.getText().equals("")) {
            getListaRequisitos().get(0).setIsOk(false);
        } else {
            getListaRequisitos().get(0).setIsOk(true);
        }
    }//GEN-LAST:event_campoItemFocusLost

    private void campoQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoQuantidadeFocusLost
        if (campoQuantidade.getText().equals("")) {
            getListaRequisitos().get(1).setIsOk(false);
        } else {
            getListaRequisitos().get(1).setIsOk(true);
        }
    }//GEN-LAST:event_campoQuantidadeFocusLost

    private void campoFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoFuncionarioFocusLost
        if (campoFuncionario.getText().equals("")) {
            getListaRequisitos().get(2).setIsOk(false);
        } else {
            getListaRequisitos().get(2).setIsOk(true);
        }
    }//GEN-LAST:event_campoFuncionarioFocusLost

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        String aux = (String)jComboBox1.getSelectedItem();
        if (aux.equals("Selecione")) {
            getListaRequisitos().get(3).setIsOk(false);
        } else {
            getListaRequisitos().get(3).setIsOk(true);
        }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void campoDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDataFocusLost
        if (campoData.getText().equals("")) {
            getListaRequisitos().get(4).setIsOk(false);
        } else {
            getListaRequisitos().get(4).setIsOk(true);
        }
    }//GEN-LAST:event_campoDataFocusLost

    public void setagemInicial(){
        listaRequisitos = null;
        listaRequisitos = new ArrayList();
        
        listaRequisitos.add(new Requisito("Codigo", true));
        listaRequisitos.add(new Requisito("Descrição", true));
        listaRequisitos.add(new Requisito("Preço de Compra", true));
        listaRequisitos.add(new Requisito("Porcentagem de Lucro", true));
        listaRequisitos.add(new Requisito("Preço de Venda", true));
        listaRequisitos.add(new Requisito("Data de Empréstimo", true));
        
        campoCodigo.setText(emprestimoAux.getCodigo());
        campoItem.setText(emprestimoAux.getItem());
        campoQuantidade.setText(emprestimoAux.getQuantidade());
        campoFuncionario.setText(emprestimoAux.getFuncionario());
        jComboBox1.setSelectedItem(emprestimoAux.getSetor());
        campoData.setText(emprestimoAux.getDataEmprestimo());
    }
    
    private void editaEmprestimo(){
        Iterator<Requisito> iterador = listaRequisitos.iterator();
        String requisitosN = "";
        Requisito aux;
        boolean auxControl = true;
        while (iterador.hasNext()) {
            aux = iterador.next();
            if (!aux.isIsOk()) {
                requisitosN = requisitosN.concat(" " + aux.getRequisito() + ",");
                auxControl = false;
            }
        }
        if (!auxControl) {
            requisitosN = requisitosN.substring(0, requisitosN.length() - 1);
            JOptionPane.showMessageDialog(null, "Os seguintes requisitos não foram preeenchidos:" + requisitosN + ".");
        } else {
            String item, quantidade, funcionario, setor, codigo, dataEmprestimo;
            item = campoItem.getText();
            quantidade = campoQuantidade.getText();
            funcionario = campoFuncionario.getText();
            setor = (String)jComboBox1.getSelectedItem();
            codigo = campoCodigo.getText();
            dataEmprestimo = campoData.getText();
            
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = SQL_URL.getUrl();
                try (Connection con = DriverManager.getConnection(url)) {
                    String sql = "UPDATE Emprestimo SET Item = ?, Funcionario = ?, Quantidade = ?, Setor = ?, DiaDeEmprestimo = ? WHERE Codigo = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setString(1, item);
                    pst.setString(2, funcionario);
                    pst.setString(3, quantidade);
                    pst.setString(4, setor);
                    pst.setString(5, dataEmprestimo);
                    pst.setString(6, codigo);

                    ResultSet rs = pst.executeQuery();
                    
                    if(rs.next()){
                        // FAZ NADA
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Empréstimo do Item '" + item + "' editado com sucesso.");
                //JOptionPane.showMessageDialog(null,e);
                emprestimoController.fechaEdicaoEmprestimo();
            } catch (HeadlessException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    private void fechaEdicaoEmprestimo(){
        String message = "Deseja realmente cancelar a edição?";
        String title = "Cancelar Edição";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            emprestimoController.fechaEdicaoEmprestimo();
        }
        if (reply == JOptionPane.NO_OPTION) {

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecharTela1;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JFormattedTextField campoData;
    private javax.swing.JTextField campoFuncionario;
    private javax.swing.JTextField campoItem;
    private javax.swing.JFormattedTextField campoQuantidade;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the listaRequisitos
     */
    public ArrayList<Requisito> getListaRequisitos() {
        return listaRequisitos;
    }

    /**
     * @param listaRequisitos the listaRequisitos to set
     */
    public void setListaRequisitos(ArrayList<Requisito> listaRequisitos) {
        this.listaRequisitos = listaRequisitos;
    }

    /**
     * @return the emprestimoController
     */
    public EmprestimoController getEmprestimoController() {
        return emprestimoController;
    }

    /**
     * @param emprestimoController the emprestimoController to set
     */
    public void setEmprestimoController(EmprestimoController emprestimoController) {
        this.emprestimoController = emprestimoController;
    }

    /**
     * @return the emprestimoAux
     */
    public Emprestimo getEmprestimoAux() {
        return emprestimoAux;
    }

    /**
     * @param emprestimoAux the emprestimoAux to set
     */
    public void setEmprestimoAux(Emprestimo emprestimoAux) {
        this.emprestimoAux = emprestimoAux;
    }
}
