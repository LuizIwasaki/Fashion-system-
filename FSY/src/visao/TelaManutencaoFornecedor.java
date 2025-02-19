/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleFornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Fornecedor;

/**
 *
 * @author Eduardo Faustino
 */
public class TelaManutencaoFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TelaManutencaoFornecedor
     */
    private ControleFornecedor contFornecedor;
    private List<Fornecedor> listaFornecedores = new ArrayList<>();
    private int click = 0;

    public TelaManutencaoFornecedor() {
        contFornecedor = new ControleFornecedor();
        initComponents();
        atualizarTabela(contFornecedor.listarTodos());
    }

    public void atualizarTabela(List<Fornecedor> lista) {
        DefaultTableModel modeloTabela;
        modeloTabela = (DefaultTableModel) tabFornecedor.getModel();

        while (modeloTabela.getRowCount() > 0) {
            modeloTabela.removeRow(0);
        }

        listaFornecedores.clear();

        listaFornecedores.addAll(lista);
        for (Fornecedor f : this.listaFornecedores) {
            modeloTabela.addRow(new Object[]{f.getCpfCnpj(), f.getNomeFantasia(), f.getTelefone(), f.getNomeContatante()});
        }
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
        painelFundo = new javax.swing.JPanel();
        painelTopo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelBotDados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelBotNovo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        painelBotAlterar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        painelBotExcluir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(204, 204, 204));
        painelFundo.setForeground(new java.awt.Color(51, 51, 51));

        painelTopo.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manutenção de Fornecedores");

        javax.swing.GroupLayout painelTopoLayout = new javax.swing.GroupLayout(painelTopo);
        painelTopo.setLayout(painelTopoLayout);
        painelTopoLayout.setHorizontalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelTopoLayout.setVerticalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        painelBotDados.setBackground(new java.awt.Color(0, 204, 204));
        painelBotDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelBotDados.setPreferredSize(new java.awt.Dimension(146, 40));
        painelBotDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBotDadosMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dados");

        javax.swing.GroupLayout painelBotDadosLayout = new javax.swing.GroupLayout(painelBotDados);
        painelBotDados.setLayout(painelBotDadosLayout);
        painelBotDadosLayout.setHorizontalGroup(
            painelBotDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        painelBotDadosLayout.setVerticalGroup(
            painelBotDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        painelBotNovo.setBackground(new java.awt.Color(24, 191, 108));
        painelBotNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelBotNovo.setPreferredSize(new java.awt.Dimension(146, 40));
        painelBotNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBotNovoMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Novo");

        javax.swing.GroupLayout painelBotNovoLayout = new javax.swing.GroupLayout(painelBotNovo);
        painelBotNovo.setLayout(painelBotNovoLayout);
        painelBotNovoLayout.setHorizontalGroup(
            painelBotNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        painelBotNovoLayout.setVerticalGroup(
            painelBotNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        painelBotAlterar.setBackground(new java.awt.Color(204, 204, 0));
        painelBotAlterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelBotAlterar.setPreferredSize(new java.awt.Dimension(146, 40));
        painelBotAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBotAlterarMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Alterar");

        javax.swing.GroupLayout painelBotAlterarLayout = new javax.swing.GroupLayout(painelBotAlterar);
        painelBotAlterar.setLayout(painelBotAlterarLayout);
        painelBotAlterarLayout.setHorizontalGroup(
            painelBotAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        painelBotAlterarLayout.setVerticalGroup(
            painelBotAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        painelBotExcluir.setBackground(new java.awt.Color(204, 51, 0));
        painelBotExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelBotExcluir.setPreferredSize(new java.awt.Dimension(146, 40));
        painelBotExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelBotExcluirMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Excluir");

        javax.swing.GroupLayout painelBotExcluirLayout = new javax.swing.GroupLayout(painelBotExcluir);
        painelBotExcluir.setLayout(painelBotExcluirLayout);
        painelBotExcluirLayout.setHorizontalGroup(
            painelBotExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        painelBotExcluirLayout.setVerticalGroup(
            painelBotExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nome Fansatia ou CPF/CNPJ para Pesquisar:");

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF/CNPJ", "Nome Fantasia", "Telefone", "Nome Contatante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabFornecedor);
        if (tabFornecedor.getColumnModel().getColumnCount() > 0) {
            tabFornecedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabFornecedor.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabFornecedor.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabFornecedor.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFundoLayout.createSequentialGroup()
                                .addComponent(painelBotDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(painelBotNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(painelBotAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(painelBotExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBotNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBotAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBotExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void painelBotDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotDadosMouseClicked
        int linha = tabFornecedor.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um fornecedor na tabela");
        } else {
            Fornecedor f = listaFornecedores.get(linha);
            OperacoesFornecedor of = new OperacoesFornecedor(this, true);
            of.setFornecedor(f);
            of.setDados();
            of.setVisible(true);
        }
    }//GEN-LAST:event_painelBotDadosMouseClicked

    private void painelBotNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotNovoMouseClicked
        OperacoesFornecedor of = new OperacoesFornecedor(this, true);
        of.setCadastro();
        of.setVisible(true);

        if (of.isConfirmou()) {
            contFornecedor.salvar(of.getFornecedor());
            atualizarTabela(contFornecedor.listarTodos());
        }
    }//GEN-LAST:event_painelBotNovoMouseClicked

    private void painelBotAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotAlterarMouseClicked
        int linha = tabFornecedor.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um fornecedor na tabela");
        } else {
            Fornecedor f = listaFornecedores.get(linha);
            OperacoesFornecedor of = new OperacoesFornecedor(this, true);
            of.setFornecedor(f);
            of.setAlteracao();
            of.setVisible(true);

            if (of.isConfirmou()) {
                contFornecedor.alterar(of.getFornecedor());
                atualizarTabela(contFornecedor.listarTodos());
            }
        }
    }//GEN-LAST:event_painelBotAlterarMouseClicked

    private void painelBotExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelBotExcluirMouseClicked
        int linha = tabFornecedor.getSelectedRow();

        if (linha == -1) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um fornecedor na tabela");
        } else {
            int resposta;
            resposta = JOptionPane.showConfirmDialog(this,
                    "Confirma Exclusão?",
                    "Exclusão de Fornecedor",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                Fornecedor f = listaFornecedores.get(linha);
                if (f.getListaCompras().isEmpty()) {
                    contFornecedor.excluir(f);
                    atualizarTabela(contFornecedor.listarTodos());
                }else{
                    JOptionPane.showMessageDialog(this, "Esse fornecedor não pode ser excluido.");
                }
            }
        }
    }//GEN-LAST:event_painelBotExcluirMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        List<Fornecedor> LF = contFornecedor.listarPorNomePesquisado(txtPesquisa.getText());
        if (LF.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum fornecedor foi encontrado.");
            atualizarTabela(contFornecedor.listarTodos());
        } else {
            atualizarTabela(LF);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFornecedorMouseClicked
        click++;
        int linh = 0, linha = 0;
        if (click == 1) {
            linh = tabFornecedor.getSelectedRow();
        }
        if (click == 2) {
            linha = tabFornecedor.getSelectedRow();
            if (linh == linha) {
                if (linha == -1) {
                    JOptionPane.showMessageDialog(this,
                            "Selecione um fornecedor na tabela");
                } else {
                    Fornecedor f = listaFornecedores.get(linha);

                    OperacoesFornecedor of = new OperacoesFornecedor(this, true);
                    of.setFornecedor(f);
                    of.setDados();
                    of.setVisible(true);
                }
                click = 0;
                tabFornecedor.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
            }
        }
    }//GEN-LAST:event_tabFornecedorMouseClicked

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManutencaoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManutencaoFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelBotAlterar;
    private javax.swing.JPanel painelBotDados;
    private javax.swing.JPanel painelBotExcluir;
    private javax.swing.JPanel painelBotNovo;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTopo;
    private javax.swing.JTable tabFornecedor;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
