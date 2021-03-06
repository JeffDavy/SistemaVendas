package br.sp.tads.view;

import br.sp.senac.tads.model.Vendedor;
import br.sp.tads.controller.VendedorController;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form IndexVendedor
     */
    public Home() {
        initComponents();
        vendBean.setCodVendedor(1);
        lbl_comissao.setText(Double.toString(informaComissao(vendBean)));
        setIcon(this);
        
    }
   
    
    VendedorController vendedorControl = new VendedorController();
    Vendedor vendBean = new Vendedor();
    
    /** ALTERAR A COR DO OBJETO AO PASSAR O MOUSE*/
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(40, 40, 40));        
    }
    
    /** VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA */
    public void resetColor(JPanel panel){    
        panel.setBackground(new java.awt.Color(0, 95, 72));        
    }
    
    public void setIcon(JFrame frm) {
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/imagens/castanha.png"));
    }
    
    public double informaComissao(Vendedor vendBean) {
        
        return vendedorControl.retornoComissaoController(vendBean);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_lateral = new javax.swing.JPanel();
        lbl_usuarioSessao = new javax.swing.JLabel();
        pnl_venda = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnl_vendedor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_cliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_relatorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_produto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_logoff = new javax.swing.JLabel();
        pnl_botoesEstado = new javax.swing.JPanel();
        lbl_minimizar = new javax.swing.JLabel();
        lbl_fechar = new javax.swing.JLabel();
        btn_sair = new javax.swing.JPanel();
        lbl_usuarioSessao1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_comissao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_lateral.setBackground(new java.awt.Color(0, 95, 72));
        pnl_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuarioSessao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao.setText("Bem vindo!");
        pnl_lateral.add(lbl_usuarioSessao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        pnl_venda.setBackground(new java.awt.Color(0, 95, 72));
        pnl_venda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_vendaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_vendaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_vendaMouseExited(evt);
            }
        });
        pnl_venda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Venda");
        pnl_venda.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shopping-bag.png"))); // NOI18N
        pnl_venda.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnl_lateral.add(pnl_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 60));

        pnl_vendedor.setBackground(new java.awt.Color(0, 95, 72));
        pnl_vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_vendedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_vendedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_vendedorMouseExited(evt);
            }
        });
        pnl_vendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vendedor");
        pnl_vendedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor.png"))); // NOI18N
        pnl_vendedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnl_lateral.add(pnl_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 60));

        pnl_cliente.setBackground(new java.awt.Color(0, 95, 72));
        pnl_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_clienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_clienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_clienteMouseExited(evt);
            }
        });
        pnl_cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cliente");
        pnl_cliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        pnl_cliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnl_lateral.add(pnl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 60));

        pnl_relatorio.setBackground(new java.awt.Color(0, 95, 72));
        pnl_relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_relatorioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_relatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_relatorioMouseExited(evt);
            }
        });
        pnl_relatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório");
        pnl_relatorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        pnl_relatorio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnl_lateral.add(pnl_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 190, 60));

        pnl_produto.setBackground(new java.awt.Color(0, 95, 72));
        pnl_produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_produtoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_produtoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_produtoMouseExited(evt);
            }
        });
        pnl_produto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Produto");
        pnl_produto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        pnl_produto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pnl_lateral.add(pnl_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 190, 60));

        btn_logoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        btn_logoff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoffMouseClicked(evt);
            }
        });
        pnl_lateral.add(btn_logoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        pnl_fundo.add(pnl_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 570));

        pnl_botoesEstado.setBackground(new java.awt.Color(255, 255, 255));
        pnl_botoesEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_minimizar.setBackground(new java.awt.Color(0, 95, 72));
        lbl_minimizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        lbl_minimizar.setForeground(new java.awt.Color(0, 95, 72));
        lbl_minimizar.setText("_");
        lbl_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minimizarMouseClicked(evt);
            }
        });
        pnl_botoesEstado.add(lbl_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, -1, 60));

        lbl_fechar.setBackground(new java.awt.Color(0, 95, 72));
        lbl_fechar.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        lbl_fechar.setForeground(new java.awt.Color(0, 95, 72));
        lbl_fechar.setText("X");
        lbl_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fecharMouseClicked(evt);
            }
        });
        pnl_botoesEstado.add(lbl_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        pnl_fundo.add(pnl_botoesEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 80, 50));

        btn_sair.setBackground(new java.awt.Color(0, 95, 72));
        btn_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sairMouseExited(evt);
            }
        });
        btn_sair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuarioSessao1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao1.setText("Sair");
        btn_sair.add(lbl_usuarioSessao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 90, 50));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel11.setText("Valor de comissão: R$");
        pnl_fundo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lbl_comissao.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        pnl_fundo.add(lbl_comissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 240, 30));

        getContentPane().add(pnl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseEntered
        setColor(btn_sair);
    }//GEN-LAST:event_btn_sairMouseEntered

    private void btn_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseExited
        resetColor(btn_sair);
    }//GEN-LAST:event_btn_sairMouseExited

    private void pnl_vendedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendedorMouseEntered
        setColor(pnl_vendedor);
    }//GEN-LAST:event_pnl_vendedorMouseEntered

    private void pnl_vendedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendedorMouseExited
        resetColor(pnl_vendedor);
    }//GEN-LAST:event_pnl_vendedorMouseExited

    private void pnl_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_clienteMouseEntered
        setColor(pnl_cliente);
    }//GEN-LAST:event_pnl_clienteMouseEntered

    private void pnl_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_clienteMouseExited
        resetColor(pnl_cliente);
    }//GEN-LAST:event_pnl_clienteMouseExited

    private void pnl_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_produtoMouseEntered
        setColor(pnl_produto);
    }//GEN-LAST:event_pnl_produtoMouseEntered

    private void pnl_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_produtoMouseExited
        resetColor(pnl_produto);
    }//GEN-LAST:event_pnl_produtoMouseExited

    private void pnl_relatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_relatorioMouseEntered
        setColor(pnl_relatorio);
    }//GEN-LAST:event_pnl_relatorioMouseEntered

    private void pnl_relatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_relatorioMouseExited
        resetColor(pnl_relatorio);
    }//GEN-LAST:event_pnl_relatorioMouseExited

    private void lbl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lbl_minimizarMouseClicked

    private void lbl_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fecharMouseClicked
        LoginView home = new LoginView();
        home.show();
        this.dispose();        
    }//GEN-LAST:event_lbl_fecharMouseClicked

    private void pnl_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendedorMouseClicked
        VendedorArea tela = new VendedorArea();
        tela.show();
        this.dispose();
    }//GEN-LAST:event_pnl_vendedorMouseClicked

    private void pnl_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_clienteMouseClicked
        ClienteArea home = new ClienteArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_pnl_clienteMouseClicked

    private void pnl_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_produtoMouseClicked
        ProdutoArea home = new ProdutoArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_pnl_produtoMouseClicked

    private void pnl_relatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_relatorioMouseClicked
        RelatorioArea home = new RelatorioArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_pnl_relatorioMouseClicked

    private void btn_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sairMouseClicked
        LoginView home = new LoginView();
        home.show();
        this.dispose();
    }//GEN-LAST:event_btn_sairMouseClicked

    private void pnl_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendaMouseClicked
        VendaArea home = new VendaArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_pnl_vendaMouseClicked

    private void pnl_vendaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendaMouseEntered
        setColor(pnl_venda);
    }//GEN-LAST:event_pnl_vendaMouseEntered

    private void pnl_vendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendaMouseExited
        resetColor(pnl_venda);
    }//GEN-LAST:event_pnl_vendaMouseExited

    private void btn_logoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoffMouseClicked
        LoginView home = new LoginView();
        home.show();
        this.dispose();

    }//GEN-LAST:event_btn_logoffMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_logoff;
    private javax.swing.JPanel btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_comissao;
    private javax.swing.JLabel lbl_fechar;
    private javax.swing.JLabel lbl_minimizar;
    private javax.swing.JLabel lbl_usuarioSessao;
    private javax.swing.JLabel lbl_usuarioSessao1;
    private javax.swing.JPanel pnl_botoesEstado;
    private javax.swing.JPanel pnl_cliente;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_lateral;
    private javax.swing.JPanel pnl_produto;
    private javax.swing.JPanel pnl_relatorio;
    private javax.swing.JPanel pnl_venda;
    private javax.swing.JPanel pnl_vendedor;
    // End of variables declaration//GEN-END:variables
}
