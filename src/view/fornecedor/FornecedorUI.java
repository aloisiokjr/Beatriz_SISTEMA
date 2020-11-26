/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.fornecedor;

import controller.FornecedorController;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Fornecedor;
import util.SQL_URL;

/**
 *
 * @author KLEYN
 */
public class FornecedorUI extends javax.swing.JFrame {

    private Fornecedor fornecedorAux = null;
    private CriarFornecedor criarFornecedor = null;
    private EditarFornecedor editarFornecedor = null;
    private VisualizarFornecedor visualizarFornecedor = null;

    private FornecedorController fornecedorController = null;
    /**
     * Creates new form FornecedorUI
     * @param fornecedorController
     */
    public FornecedorUI(FornecedorController fornecedorController) {
        this.fornecedorController = fornecedorController;
        initComponents();
        this.setVisible(true);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.toFront();
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

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnEditar.setEnabled(false);
        btnExcluir = new javax.swing.JButton();
        btnExcluir.setEnabled(false);
        btnCriar = new javax.swing.JButton();
        btnVisualizacao = new javax.swing.JButton();
        btnExcluir.setEnabled(false);
        jPanel3 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        campoBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        radio_CPFCNPJ = new javax.swing.JRadioButton();
        radio_NomeFantasia = new javax.swing.JRadioButton();
        radio_Razao = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        btnCriar.setText("LANÇAMENTO");
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

        btnVisualizacao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnVisualizacao.setText("VISUALIZAÇÃO");
        btnVisualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizacaoActionPerformed(evt);
            }
        });
        btnVisualizacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVisualizacaoKeyPressed(evt);
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
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisualizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCriar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("BUSCAR POR");

        campoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscaKeyPressed(evt);
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

        radio_CPFCNPJ.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        radio_CPFCNPJ.setText("CPF/CNPJ");
        radio_CPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_CPFCNPJActionPerformed(evt);
            }
        });

        radio_NomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        radio_NomeFantasia.setText("Nome Fantasia");

        radio_Razao.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        radio_Razao.setText("Razão Social");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radio_Razao)
                        .addGap(221, 221, 221))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoBusca)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(radio_CPFCNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radio_NomeFantasia)))
                        .addGap(41, 41, 41))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_CPFCNPJ)
                    .addComponent(radio_NomeFantasia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio_Razao)
                .addGap(7, 7, 7)
                .addComponent(btnBuscar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnFechar.setBackground(new java.awt.Color(145, 0, 0));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(0, 153, 153));
        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setText("GERAR RELATÓRIO TXT");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Lista de Fornecedores");

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Razão Social", "Nome Fantasia", "CPF/CNPJ", "Responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFornecedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaFornecedores.getTableHeader().setReorderingAllowed(false);
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);
        if (tabelaFornecedores.getColumnModel().getColumnCount() > 0) {
            tabelaFornecedores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaFornecedores.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabelaFornecedores.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabelaFornecedores.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoR.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        fornecedorAlterar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fornecedorAlterar();
        }
    }//GEN-LAST:event_btnEditarKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        fornecedorExcluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExcluirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fornecedorExcluir();
        }
    }//GEN-LAST:event_btnExcluirKeyPressed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        getFornecedorController().abreCriacaoFornecedor();
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnCriarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCriarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getFornecedorController().abreCriacaoFornecedor();
        }
    }//GEN-LAST:event_btnCriarKeyPressed

    private void btnVisualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizacaoActionPerformed
        fornecedorVisualizacao();
    }//GEN-LAST:event_btnVisualizacaoActionPerformed

    private void btnVisualizacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVisualizacaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fornecedorVisualizacao();
        }
    }//GEN-LAST:event_btnVisualizacaoKeyPressed

    private void campoBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fornecedorBuscar();
        }
    }//GEN-LAST:event_campoBuscaKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        fornecedorBuscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            fornecedorBuscar();
        }
    }//GEN-LAST:event_btnBuscarKeyPressed

    private void radio_CPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_CPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_CPFCNPJActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        getFornecedorController().fechaFornecedorUI();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            geraTxt();
        } catch (IOException ex) {
            Logger.getLogger(FornecedorUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        if(tabelaFornecedores.getSelectedRow() > -1){
            btnEditar.setEnabled(true);
            btnVisualizacao.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaFornecedoresMouseClicked

    public final void setagemInicial(){
        btnEditar.setEnabled(false);
        btnVisualizacao.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    private void fornecedorAlterar(){
    
    }
    
    private void fornecedorExcluir(){
        int linhaSelecionada = tabelaFornecedores.getSelectedRow();
        int colunaSelecionada = 2;
        String message = "Deseja realmente excluir o fornecedor '" + ((String)tabelaFornecedores.getValueAt(linhaSelecionada, colunaSelecionada)) + "'?";
        String title = "Confirmação de Exclusao";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = SQL_URL.getUrl();
                try (Connection con = DriverManager.getConnection(url)) {
                    String sql = "DELETE FROM Fornecedor WHERE CPJ_CNPJ = ?";
                    PreparedStatement pst = con.prepareStatement(sql);
                    colunaSelecionada = 3;
                    pst.setString(1, (String) tabelaFornecedores.getValueAt(linhaSelecionada, colunaSelecionada));
                    ResultSet rs = pst.executeQuery();
                    
                    if(rs.next()){
                        
                    }
                }
            } catch (HeadlessException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
            } catch (SQLException e) {
                colunaSelecionada = 2;
                JOptionPane.showMessageDialog(null, "O fornecedor '" + (String) tabelaFornecedores.getValueAt(linhaSelecionada, colunaSelecionada) + "' foi excluído.");
                fornecedorBuscaTodos();
            }
        }
        if (reply == JOptionPane.NO_OPTION) {

        }
    }
    
    private void fornecedorVisualizacao(){
    
    }
    
    private void fornecedorBuscar(){
    
    }
    
    public void fornecedorBuscaTodos(){
    
    }
    
    private void geraTxt() throws IOException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	String dataAux = dateFormat.format(date);
        dataAux = dataAux.replaceAll(" ", "--");
        dataAux = dataAux.replaceAll("/", "-");
        dataAux = dataAux.replaceAll(":", "");
        
        File f = new File(".\\saida");
        if(f.mkdir()){
        }
        f = new File(".\\saida\\fornecedor");
        if(f.mkdir()){
        }
        
        try (FileWriter arq = new FileWriter(".\\saida\\fornecedor/BuscaFornecedores--"+dataAux+".txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("+-------------- RESULTADO DA BUSCA: FORNECEDORES --------------+%n%n");
            gravarArq.printf("LISTAGEM:%n%n");
            int i;
            for (i=0; i< tabelaFornecedores.getRowCount(); i++) {
                gravarArq.printf("# %2d ##########################%n", i+1);
                gravarArq.printf("Razão Social: " + (String)tabelaFornecedores.getValueAt(i, 1)+"%n");
                gravarArq.printf("Nome Fantasia: " + (String)tabelaFornecedores.getValueAt(i, 2)+"%n");
                gravarArq.printf("CPF/CNPJ: " + (String)tabelaFornecedores.getValueAt(i, 3)+"%n");
                gravarArq.printf("Responsável: " + (String)tabelaFornecedores.getValueAt(i, 4)+"%n");
                gravarArq.printf("%n");
            }
            gravarArq.printf("+-------------------------------------------------------------+%n");
            arq.close();

            JOptionPane.showMessageDialog(null,"Dados salvos em 'saida/fornecedor/BuscaFornecedores--"+dataAux+".txt'");
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
            java.util.logging.Logger.getLogger(FornecedorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnVisualizacao;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JRadioButton radio_CPFCNPJ;
    private javax.swing.JRadioButton radio_NomeFantasia;
    private javax.swing.JRadioButton radio_Razao;
    private javax.swing.JTable tabelaFornecedores;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the fornecedorAux
     */
    public Fornecedor getFornecedorAux() {
        return fornecedorAux;
    }

    /**
     * @param fornecedorAux the fornecedorAux to set
     */
    public void setFornecedorAux(Fornecedor fornecedorAux) {
        this.fornecedorAux = fornecedorAux;
    }

    /**
     * @return the criarFornecedor
     */
    public CriarFornecedor getCriarFornecedor() {
        return criarFornecedor;
    }

    /**
     * @param criarFornecedor the criarFornecedor to set
     */
    public void setCriarFornecedor(CriarFornecedor criarFornecedor) {
        this.criarFornecedor = criarFornecedor;
    }

    /**
     * @return the editarFornecedor
     */
    public EditarFornecedor getEditarFornecedor() {
        return editarFornecedor;
    }

    /**
     * @param editarFornecedor the editarFornecedor to set
     */
    public void setEditarFornecedor(EditarFornecedor editarFornecedor) {
        this.editarFornecedor = editarFornecedor;
    }

    /**
     * @return the visualizarFornecedor
     */
    public VisualizarFornecedor getVisualizarFornecedor() {
        return visualizarFornecedor;
    }

    /**
     * @param visualizarFornecedor the visualizarFornecedor to set
     */
    public void setVisualizarFornecedor(VisualizarFornecedor visualizarFornecedor) {
        this.visualizarFornecedor = visualizarFornecedor;
    }

    /**
     * @return the fornecedorController
     */
    public FornecedorController getFornecedorController() {
        return fornecedorController;
    }

    /**
     * @param fornecedorController the fornecedorController to set
     */
    public void setFornecedorController(FornecedorController fornecedorController) {
        this.fornecedorController = fornecedorController;
    }
}
