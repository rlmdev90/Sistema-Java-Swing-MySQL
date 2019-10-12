/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerCidade;
import Controller.ControllerCidadeEstado;
import Controller.ControllerEstado;
import Model.ModelCidade;
import Model.ModelCidadeEstado;
import Model.ModelEstado;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author studiomicroweb
 */
public class ViewCadCidade extends javax.swing.JFrame {

    String tipoCadastro = "null";
    ControllerEstado controllerEstados = new ControllerEstado();
    ControllerCidade controllerCidade = new ControllerCidade();
    ControllerCidadeEstado controllerCidadeEstado = new ControllerCidadeEstado();
    ModelEstado modelEstado = new ModelEstado();
    ModelCidade modelCidade = new ModelCidade();
    ArrayList<ModelCidadeEstado> listaModelCidadeEstados = new ArrayList<>();
    ArrayList<ModelEstado> listaModelEstados = new ArrayList<>();
    ArrayList<ModelCidade> listaModelCidades = new ArrayList<>();

    /**
     * Creates new form ViewCadCidade
     */
    public ViewCadCidade() {
        initComponents();
        SetIcone();
        listarEstados();

        if (ViewCidade.cidade.tipoCadastro != null && ViewCidade.cidade.tipoCadastro.equals("alteracao")) {
            this.recuperarCidade();
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
            java.util.logging.Logger.getLogger(ViewCadOcupacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadOcupacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadOcupacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadOcupacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadCidade().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        cbUf = new javax.swing.JComboBox();
        tfCidade = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        kGradientPanel14 = new keeptoo.KGradientPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        kGradientPanel12 = new keeptoo.KGradientPanel();
        kGradientPanel22 = new keeptoo.KGradientPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(234, 239, 243));
        kGradientPanel1.setkGradientFocus(-5);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(520, 210));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nome:");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel6.setText("Estado:");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel18.setText("Código:");
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        tfCodigo.setEnabled(false);
        tfCodigo.setPreferredSize(new java.awt.Dimension(46, 25));
        kGradientPanel1.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, -1));

        cbUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUf.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbUfPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUfActionPerformed(evt);
            }
        });
        kGradientPanel1.add(cbUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));

        tfCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCidadeFocusLost(evt);
            }
        });
        tfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCidadeKeyPressed(evt);
            }
        });
        kGradientPanel1.add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 115, 403, -1));

        btSalvar.setBackground(new java.awt.Color(0, 153, 0));
        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/disk.png"))); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.setPreferredSize(new java.awt.Dimension(150, 40));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        btCancelar.setBackground(new java.awt.Color(195, 3, 18));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/cancel-white.png"))); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.setPreferredSize(new java.awt.Dimension(130, 35));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        kGradientPanel14.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel14.setkBorderRadius(0);
        kGradientPanel14.setkEndColor(new java.awt.Color(146, 171, 197));
        kGradientPanel14.setkStartColor(new java.awt.Color(146, 171, 197));
        kGradientPanel14.setName(""); // NOI18N
        kGradientPanel14.setPreferredSize(new java.awt.Dimension(1300, 40));

        kGradientPanel6.setkBorderRadius(0);
        kGradientPanel6.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkGradientFocus(125);
        kGradientPanel6.setkStartColor(new java.awt.Color(234, 239, 243));

        org.jdesktop.layout.GroupLayout kGradientPanel6Layout = new org.jdesktop.layout.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 271, Short.MAX_VALUE)
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        kGradientPanel12.setkBorderRadius(0);
        kGradientPanel12.setkEndColor(new java.awt.Color(234, 239, 243));
        kGradientPanel12.setkGradientFocus(250);
        kGradientPanel12.setkStartColor(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout kGradientPanel12Layout = new org.jdesktop.layout.GroupLayout(kGradientPanel12);
        kGradientPanel12.setLayout(kGradientPanel12Layout);
        kGradientPanel12Layout.setHorizontalGroup(
            kGradientPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 380, Short.MAX_VALUE)
        );
        kGradientPanel12Layout.setVerticalGroup(
            kGradientPanel12Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        kGradientPanel22.setkBorderRadius(0);
        kGradientPanel22.setkEndColor(new java.awt.Color(146, 171, 197));
        kGradientPanel22.setkGradientFocus(125);
        kGradientPanel22.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 102));
        jLabel27.setText("Cadastro de Cidades");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 51, 102));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Create.png"))); // NOI18N
        jLabel28.setPreferredSize(new java.awt.Dimension(60, 60));

        org.jdesktop.layout.GroupLayout kGradientPanel22Layout = new org.jdesktop.layout.GroupLayout(kGradientPanel22);
        kGradientPanel22.setLayout(kGradientPanel22Layout);
        kGradientPanel22Layout.setHorizontalGroup(
            kGradientPanel22Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, kGradientPanel22Layout.createSequentialGroup()
                .add(17, 17, 17)
                .add(jLabel28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(4, 4, 4)
                .add(jLabel27, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(20, 20, 20))
        );
        kGradientPanel22Layout.setVerticalGroup(
            kGradientPanel22Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(kGradientPanel22Layout.createSequentialGroup()
                .add(3, 3, 3)
                .add(kGradientPanel22Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel27, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .add(jLabel28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout kGradientPanel14Layout = new org.jdesktop.layout.GroupLayout(kGradientPanel14);
        kGradientPanel14.setLayout(kGradientPanel14Layout);
        kGradientPanel14Layout.setHorizontalGroup(
            kGradientPanel14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(kGradientPanel14Layout.createSequentialGroup()
                .add(68, 68, 68)
                .add(kGradientPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 271, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(kGradientPanel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(kGradientPanel14Layout.createSequentialGroup()
                .add(kGradientPanel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 179, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel14Layout.setVerticalGroup(
            kGradientPanel14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(kGradientPanel14Layout.createSequentialGroup()
                .add(kGradientPanel22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(kGradientPanel14Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, kGradientPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, kGradientPanel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        kGradientPanel1.add(kGradientPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        //String tipoCadastro = "novo";
        if (ViewCidade.cidade.tipoCadastro != null && ViewCidade.cidade.tipoCadastro.equals("alteracao")) {
            alteraCidade();
        } else {
            salvarCidade();
            ViewCidade.cidade.carregarCidades();
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void cbUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUfActionPerformed

    }//GEN-LAST:event_cbUfActionPerformed

    private void cbUfPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbUfPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cbUfPopupMenuWillBecomeInvisible

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limpaCampos();
        dispose();
        //ViewFornecedor.fornecedor = new ViewFornecedor();
        ViewCidade.cidade.requestFocus();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCidadeFocusLost
        this.tfCidade.setText(tfCidade.getText().toUpperCase());
    }//GEN-LAST:event_tfCidadeFocusLost

    private void tfCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btSalvar.requestFocus();
        }
    }//GEN-LAST:event_tfCidadeKeyPressed
    /**
     * Salvar cidade
     *
     * @return
     */
    private boolean salvarCidade() {
        if (tfCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Favor preencher os campos abaixo: \n Cidade", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            modelCidade.setFk_cod_estado(controllerEstados.getEstadoController(this.cbUf.getSelectedItem().toString()).getCodigo());
            modelCidade.setNome(this.tfCidade.getText());
            //salvar 
            if (controllerCidade.salvarCidadeController(modelCidade) > 0) {
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
                limpaCampos();
                dispose();
                ViewCidade.cidade.requestFocus();
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        }
    }

    private boolean alteraCidade() {
        tipoCadastro = "alteracao";
        modelCidade.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelCidade.setFk_cod_estado(controllerEstados.getEstadoController(this.cbUf.getSelectedItem().toString()).getCodigo());
        modelCidade.setNome(this.tfCidade.getText());

        //alterar 
        if (controllerCidade.atualizarCidadeController(modelCidade)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            ViewCidade.cidade.tipoCadastro = null;
            ViewCidade.cidade.carregarCidades();
            limpaCampos();
            dispose();
            ViewCidade.cidade.requestFocus();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean recuperarCidade() {
        try {
            //recupera os dados do banco
            modelCidade = controllerCidade.getCidadeController(ViewCidade.codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelCidade.getCodigo()));
            this.tfCidade.setText(modelCidade.getNome());
            this.cbUf.setSelectedItem(controllerEstados.getEstadoController(modelCidade.getFk_cod_estado()).getNome());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    /**
     * Preencher Combobox Estados
     */
    private void listarEstados() {
        listaModelEstados = controllerEstados.getListaEstadoController();
        cbUf.removeAllItems();
        for (int i = 0; i < listaModelEstados.size(); i++) {
            cbUf.addItem(listaModelEstados.get(i).getNome());
        }
    }

    private void limpaCampos() {
        tfCidade.setText("");
        cbUf.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    public static javax.swing.JComboBox cbUf;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel12;
    private keeptoo.KGradientPanel kGradientPanel14;
    private keeptoo.KGradientPanel kGradientPanel22;
    private keeptoo.KGradientPanel kGradientPanel6;
    public static javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables

    private void SetIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ictrol.png")));
    }
}
