/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.tads.view;

import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class RelatorioArea extends javax.swing.JFrame {

    /**
     * Creates new form IndexVendedor
     */
    public RelatorioArea() {
        initComponents();
    }
    
    /** ALTERAR A COR DO OBJETO AO PASSAR O MOUSE*/
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(40, 40, 40));        
    }
    
    /** VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA */
    public void resetColor(JPanel panel){    
        panel.setBackground(new java.awt.Color(0, 95, 72));        
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
        pnl_vendedor = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_cliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_produto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnl_relatorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_botoesEstado = new javax.swing.JPanel();
        lbl_minimizar = new javax.swing.JLabel();
        lbl_fechar = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JPanel();
        lbl_usuarioSessao1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_busca = new javax.swing.JLabel();
        txt_busca = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_lateral.setBackground(new java.awt.Color(0, 95, 72));
        pnl_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnl_vendedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor.png"))); // NOI18N
        pnl_vendedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_lateral.add(pnl_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 80));

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
        pnl_cliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        pnl_cliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_lateral.add(pnl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 210, 80));

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
        pnl_produto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        pnl_produto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_lateral.add(pnl_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 210, 80));

        pnl_relatorio.setBackground(new java.awt.Color(40, 40, 40));
        pnl_relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_relatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relatório");
        pnl_relatorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        pnl_relatorio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_lateral.add(pnl_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 210, 80));

        pnl_botoesEstado.setBackground(new java.awt.Color(0, 95, 72));
        pnl_botoesEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_minimizar.setBackground(new java.awt.Color(0, 95, 72));
        lbl_minimizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        lbl_minimizar.setForeground(new java.awt.Color(255, 255, 255));
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
        lbl_fechar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fechar.setText("X");
        lbl_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fecharMouseClicked(evt);
            }
        });
        pnl_botoesEstado.add(lbl_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        pnl_lateral.add(pnl_botoesEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 80, 50));

        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/home.png"))); // NOI18N
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });
        pnl_lateral.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        pnl_fundo.add(pnl_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        btn_voltar.setBackground(new java.awt.Color(0, 95, 72));
        btn_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_voltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_voltarMouseExited(evt);
            }
        });
        btn_voltar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuarioSessao1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao1.setText("Voltar");
        btn_voltar.add(lbl_usuarioSessao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 90, 50));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true));
        jTable1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(40, 40, 40));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(40, 40, 40));
        jTable1.setSelectionBackground(new java.awt.Color(0, 95, 72));
        jScrollPane1.setViewportView(jTable1);

        pnl_fundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 920, 320));

        lbl_busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/busca.png"))); // NOI18N
        pnl_fundo.add(lbl_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txt_busca.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_busca.setForeground(new java.awt.Color(51, 51, 51));
        txt_busca.setBorder(null);
        pnl_fundo.add(txt_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 350, -1));

        jSeparator1.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator1.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 350, 10));

        getContentPane().add(pnl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseEntered
        setColor(btn_voltar);
    }//GEN-LAST:event_btn_voltarMouseEntered

    private void btn_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseExited
        resetColor(btn_voltar);
    }//GEN-LAST:event_btn_voltarMouseExited

    private void pnl_produtoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_produtoMouseEntered
        setColor(pnl_produto);
    }//GEN-LAST:event_pnl_produtoMouseEntered

    private void pnl_produtoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_produtoMouseExited
        resetColor(pnl_produto);
    }//GEN-LAST:event_pnl_produtoMouseExited

    private void lbl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lbl_minimizarMouseClicked

    private void lbl_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fecharMouseClicked
        /** VOLTAR PARA O MENU PRINCIPAL */
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_lbl_fecharMouseClicked

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        /** VOLTAR PARA O MENU PRINCIPAL */
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked

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

    private void pnl_vendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendedorMouseClicked
        VendedorArea home = new VendedorArea();
        home.show();
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

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_btn_homeMouseClicked

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
            java.util.logging.Logger.getLogger(RelatorioArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new RelatorioArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_home;
    private javax.swing.JPanel btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_busca;
    private javax.swing.JLabel lbl_fechar;
    private javax.swing.JLabel lbl_minimizar;
    private javax.swing.JLabel lbl_usuarioSessao1;
    private javax.swing.JPanel pnl_botoesEstado;
    private javax.swing.JPanel pnl_cliente;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_lateral;
    private javax.swing.JPanel pnl_produto;
    private javax.swing.JPanel pnl_relatorio;
    private javax.swing.JPanel pnl_vendedor;
    private javax.swing.JTextField txt_busca;
    // End of variables declaration//GEN-END:variables
}
