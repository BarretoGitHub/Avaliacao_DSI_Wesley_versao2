package br.edu.ifsp.tela;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import javax.swing.table.DefaultTableModel;

public class TelaPessoa extends javax.swing.JFrame {

    Pessoa p = new Pessoa();
    PessoaDAO pd = new PessoaDAO();

    public TelaPessoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        pnOperacoes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        radioConsultar = new javax.swing.JRadioButton();
        radioEditar = new javax.swing.JRadioButton();
        radioRemover = new javax.swing.JRadioButton();
        btnEfetuar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnLimparOperacoes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        areaNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JSpinner();
        btnSalvarDadosPessoais = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimparDadosPessoais = new javax.swing.JButton();
        gridPessoas = new javax.swing.JTabbedPane();
        pnDadosGerais = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnLimparDadosGerados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTodosUsuarios = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnOperacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setText("SELECIONE O ID:");

        txtID.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setText("EFETUAR");

        buttonGroup1.add(radioConsultar);
        radioConsultar.setSelected(true);
        radioConsultar.setText("CONSULTAR");

        buttonGroup1.add(radioEditar);
        radioEditar.setText("EDITAR");

        buttonGroup1.add(radioRemover);
        radioRemover.setText("REMOVER");

        btnEfetuar.setText("EFETUAR");
        btnEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("OPERAÇÕES");

        btnLimparOperacoes.setText("LIMPAR");
        btnLimparOperacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparOperacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOperacoesLayout = new javax.swing.GroupLayout(pnOperacoes);
        pnOperacoes.setLayout(pnOperacoesLayout);
        pnOperacoesLayout.setHorizontalGroup(
            pnOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnOperacoesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(radioConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioRemover)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnOperacoesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOperacoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEfetuar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(pnOperacoesLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnOperacoesLayout.setVerticalGroup(
            pnOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOperacoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEditar)
                    .addComponent(radioRemover)
                    .addComponent(radioConsultar)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEfetuar)
                    .addComponent(btnLimparOperacoes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("NOME: ");

        areaNome.setText(" ");
        areaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("IDADE");

        txtIdade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtIdade.setEditor(new javax.swing.JSpinner.NumberEditor(txtIdade, ""));

        btnSalvarDadosPessoais.setText("SALVAR");
        btnSalvarDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDadosPessoaisActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("DADOS PESSOAIS");

        btnLimparDadosPessoais.setText("LIMPAR");
        btnLimparDadosPessoais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosPessoaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(areaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarDadosPessoais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(areaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarDadosPessoais)
                    .addComponent(btnLimparDadosPessoais))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridPessoas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        gridPessoas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                gridPessoasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        gridPessoas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gridPessoasStateChanged(evt);
            }
        });

        pnDadosGerais.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setText("NOME: ");

        jLabel8.setText("IDADE:");

        jLabel9.setText("ID:");

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("DADOS GERADOS - OPERAÇÕES");

        btnLimparDadosGerados.setText("LIMPAR DADOS");
        btnLimparDadosGerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosGeradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDadosGeraisLayout = new javax.swing.GroupLayout(pnDadosGerais);
        pnDadosGerais.setLayout(pnDadosGeraisLayout);
        pnDadosGeraisLayout.setHorizontalGroup(
            pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)))
                .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                                .addComponent(lblIdade)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                                .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosGeraisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparDadosGerados)
                        .addGap(26, 26, 26))))
            .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel13)
                .addGap(0, 118, Short.MAX_VALUE))
        );
        pnDadosGeraisLayout.setVerticalGroup(
            pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(7, 7, 7)
                .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblNome))
                .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDadosGeraisLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblID))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDadosGeraisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparDadosGerados)
                        .addContainerGap())))
        );

        gridPessoas.addTab("DADOS GERADOS", pnDadosGerais);

        tabelTodosUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        tabelTodosUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NOME", "IDADE", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelTodosUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabelTodosUsuarios);
        if (tabelTodosUsuarios.getColumnModel().getColumnCount() > 0) {
            tabelTodosUsuarios.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabelTodosUsuarios.getColumnModel().getColumn(1).setPreferredWidth(10);
            tabelTodosUsuarios.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        gridPessoas.addTab("TODOS USUÁRIOS", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gridPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gridPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaNomeActionPerformed

    }//GEN-LAST:event_areaNomeActionPerformed

    private void btnSalvarDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDadosPessoaisActionPerformed

        int flagId = Integer.parseInt(txtID.getValue().toString());
        int flagIdade = Integer.parseInt(txtIdade.getValue().toString());
        String nome = areaNome.getText();

        p.setNome(nome);
        p.setIdade(flagIdade);
        pd.salvarPessoa(p);
        atualizarGrid();
    }//GEN-LAST:event_btnSalvarDadosPessoaisActionPerformed

    private void btnEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarActionPerformed

        int flagId = Integer.parseInt(txtID.getValue().toString());
        int flagIdade = Integer.parseInt(txtIdade.getValue().toString());
        String nome = areaNome.getText();

        p.setNome(nome);
        p.setIdade(flagIdade);
        p.setId(flagId);

        if (radioRemover.isSelected()) {
            pd.removerID(p);
            atualizarGrid();
             
        }

        if (radioEditar.isSelected()) {
            pd.updateId(p);
            atualizarGrid();
        }

        if (radioConsultar.isSelected()) {
            p = pd.consultarId(flagId);
            lblNome.setText(p.getNome());
            lblIdade.setText(Integer.toString(p.getIdade()));
            lblID.setText(Integer.toString(p.getId()));

            atualizarGrid();
        }
    }//GEN-LAST:event_btnEfetuarActionPerformed


    private void btnLimparDadosPessoaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosPessoaisActionPerformed
        areaNome.setText(null);
        txtIdade.setValue(0);
    }//GEN-LAST:event_btnLimparDadosPessoaisActionPerformed

    private void btnLimparOperacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparOperacoesActionPerformed
        txtID.setValue(1);
        areaNome.setText(null);
        txtIdade.setValue(0);
        lblID.setText(null);
        lblNome.setText(null);
        lblIdade.setText(null);
        
    }//GEN-LAST:event_btnLimparOperacoesActionPerformed

    private void btnLimparDadosGeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosGeradosActionPerformed
        lblID.setText(null);
        lblIdade.setText(null);
        lblNome.setText(null);
        areaNome.setText(null);
        txtIdade.setValue(0);
        txtID.setValue(1);
        
         
    }//GEN-LAST:event_btnLimparDadosGeradosActionPerformed

    private void gridPessoasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_gridPessoasAncestorAdded
        atualizarGrid();
    }//GEN-LAST:event_gridPessoasAncestorAdded

    private void gridPessoasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gridPessoasStateChanged
         
    }//GEN-LAST:event_gridPessoasStateChanged

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoa().setVisible(true);
            }
        });
    }
    
    public void atualizarGrid(){
    
       DefaultTableModel modelo = (DefaultTableModel) tabelTodosUsuarios.getModel();
        modelo.setNumRows(0);

        tabelTodosUsuarios.getColumnModel().getColumn(0);
        tabelTodosUsuarios.getColumnModel().getColumn(1);
        tabelTodosUsuarios.getColumnModel().getColumn(2);
        try {
            for (Pessoa p : pd.consultarTodos()) {
                modelo.addRow(new Object[]{
                    p.getNome(),
                    p.getIdade(),
                    p.getId()
                });
            }
        } catch (Exception e) {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaNome;
    private javax.swing.JButton btnEfetuar;
    private javax.swing.JButton btnLimparDadosGerados;
    private javax.swing.JButton btnLimparDadosPessoais;
    private javax.swing.JButton btnLimparOperacoes;
    private javax.swing.JButton btnSalvarDadosPessoais;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane gridPessoas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnDadosGerais;
    private javax.swing.JPanel pnOperacoes;
    private javax.swing.JRadioButton radioConsultar;
    private javax.swing.JRadioButton radioEditar;
    private javax.swing.JRadioButton radioRemover;
    private javax.swing.JTable tabelTodosUsuarios;
    private javax.swing.JSpinner txtID;
    private javax.swing.JSpinner txtIdade;
    // End of variables declaration//GEN-END:variables

}
