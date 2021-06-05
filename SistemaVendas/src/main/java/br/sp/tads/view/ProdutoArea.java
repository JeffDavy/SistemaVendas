/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.tads.view;

import br.sp.senac.tads.model.Produto;
import br.sp.tads.controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class ProdutoArea extends javax.swing.JFrame {
    
    Produto prodBean = new Produto();
    ProdutoController prodControl = new ProdutoController();
    
    /**
     * Creates new form IndexVendedor
     */
    public ProdutoArea() {
        initComponents();
        preencheTabela();
    }
    
    /** ALTERAR A COR DO OBJETO AO PASSAR O MOUSE*/
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(40, 40, 40));        
    }
    
    /** VOLTAR PARA A COR PADRÃO DO OBJETO AO TIRAR O MOUSE DE CIMA */
    public void resetColor(JPanel panel){    
        panel.setBackground(new java.awt.Color(0, 95, 72));        
    }
    
    public void preencheTabela() {
        
        ArrayList<Produto> listaProduto = prodControl.listarController();
        
        if (listaProduto.size() > 0) {
            
            DefaultTableModel tmProduto= new DefaultTableModel();
            
            tmProduto.addColumn("Código");
            tmProduto.addColumn("Nome");
            tmProduto.addColumn("Valor");
            tmProduto.addColumn("Unidade");
            
            tbl_produtos.setModel(tmProduto);
            
            int i = 0;
            
            for (Object obj : listaProduto) {
                
                Produto prodBean = (Produto) obj;
                
                tmProduto.addRow(new String[1]);
                
                tbl_produtos.setValueAt(prodBean.getCodProduto(), i, 0);
                tbl_produtos.setValueAt(prodBean.getNome(), i, 1);
                tbl_produtos.setValueAt(prodBean.getValor(), i, 2);
                tbl_produtos.setValueAt(prodBean.getUnidade(), i, 3);
                
                i++;
                
            }
            
        }
        
    }
    
    public void preencheTabelaNome(Produto prodBean) {
               
        ArrayList<Produto> listaProduto = prodControl.listarNomeController(prodBean);
                
        if (listaProduto.size() > 0) {
            
            DefaultTableModel tmProduto = new DefaultTableModel();
            
            tmProduto.addColumn("Código");
            tmProduto.addColumn("Nome");
            tmProduto.addColumn("Valor");
            tmProduto.addColumn("Unidade");
            
            tbl_produtos.setModel(tmProduto);
            
            int i = 0;
            
            for (Object obj : listaProduto) {
                
                Produto prod = (Produto) obj;
                
                tmProduto.addRow(new String[1]);
                
                tbl_produtos.setValueAt(prod.getCodProduto(), i, 0);
                tbl_produtos.setValueAt(prod.getNome(), i, 1);
                tbl_produtos.setValueAt(prod.getValor(), i, 2);
                tbl_produtos.setValueAt(prod.getUnidade(), i, 3);
                
                i++;
                
            }
            
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
        btn_voltar = new javax.swing.JPanel();
        lbl_usuarioSessao1 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_remover = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_produtos = new javax.swing.JTable();
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

        pnl_produto.setBackground(new java.awt.Color(40, 40, 40));
        pnl_produto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_produto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Produto");
        pnl_produto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        pnl_produto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pnl_lateral.add(pnl_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 210, 80));

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

        btn_adicionar.setBackground(new java.awt.Color(0, 95, 72));
        btn_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adicionarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_adicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_adicionarMouseExited(evt);
            }
        });
        btn_adicionar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add-button (1).png"))); // NOI18N
        btn_adicionar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Adicionar");
        btn_adicionar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        pnl_fundo.add(btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 100, 90));

        btn_editar.setBackground(new java.awt.Color(0, 95, 72));
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarMouseExited(evt);
            }
        });
        btn_editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        btn_editar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Editar");
        btn_editar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        pnl_fundo.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 100, 90));

        btn_remover.setBackground(new java.awt.Color(0, 95, 72));
        btn_remover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_removerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_removerMouseExited(evt);
            }
        });
        btn_remover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btn_remover.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Remover");
        btn_remover.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        pnl_fundo.add(btn_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 100, 90));

        tbl_produtos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true));
        tbl_produtos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbl_produtos.setForeground(new java.awt.Color(40, 40, 40));
        tbl_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_produtos.setGridColor(new java.awt.Color(40, 40, 40));
        tbl_produtos.setSelectionBackground(new java.awt.Color(0, 95, 72));
        jScrollPane1.setViewportView(tbl_produtos);
        if (tbl_produtos.getColumnModel().getColumnCount() > 0) {
            tbl_produtos.getColumnModel().getColumn(0).setResizable(false);
            tbl_produtos.getColumnModel().getColumn(1).setResizable(false);
            tbl_produtos.getColumnModel().getColumn(2).setResizable(false);
            tbl_produtos.getColumnModel().getColumn(3).setResizable(false);
        }

        pnl_fundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 660, 380));

        lbl_busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/busca.png"))); // NOI18N
        pnl_fundo.add(lbl_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        txt_busca.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_busca.setForeground(new java.awt.Color(51, 51, 51));
        txt_busca.setBorder(null);
        txt_busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscaKeyTyped(evt);
            }
        });
        pnl_fundo.add(txt_busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 350, -1));

        jSeparator1.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator1.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 350, 10));

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

    private void pnl_clienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_clienteMouseEntered
        setColor(pnl_cliente);
    }//GEN-LAST:event_pnl_clienteMouseEntered

    private void pnl_clienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_clienteMouseExited
        resetColor(pnl_cliente);
    }//GEN-LAST:event_pnl_clienteMouseExited

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

    private void btn_adicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adicionarMouseEntered
        setColor(btn_adicionar);
    }//GEN-LAST:event_btn_adicionarMouseEntered

    private void btn_adicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adicionarMouseExited
        resetColor(btn_adicionar);
    }//GEN-LAST:event_btn_adicionarMouseExited

    private void btn_editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseEntered
        setColor(btn_editar);
    }//GEN-LAST:event_btn_editarMouseEntered

    private void btn_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseExited
        resetColor(btn_editar);
    }//GEN-LAST:event_btn_editarMouseExited

    private void btn_removerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseEntered
        setColor(btn_remover);
    }//GEN-LAST:event_btn_removerMouseEntered

    private void btn_removerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseExited
        resetColor(btn_remover);
    }//GEN-LAST:event_btn_removerMouseExited

    private void pnl_vendedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendedorMouseEntered
        setColor(pnl_vendedor);
    }//GEN-LAST:event_pnl_vendedorMouseEntered

    private void pnl_vendedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_vendedorMouseExited
        resetColor(pnl_vendedor);
    }//GEN-LAST:event_pnl_vendedorMouseExited

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

    private void pnl_relatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_relatorioMouseClicked
        RelatorioArea home = new RelatorioArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_pnl_relatorioMouseClicked

    private void btn_adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adicionarMouseClicked
        ProdutoCRUD home = new ProdutoCRUD("Adicionar Produto");
        home.show();
        this.dispose();

    }//GEN-LAST:event_btn_adicionarMouseClicked

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        int linhaSelecionada = tbl_produtos.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            
            int codProduto = Integer.parseInt(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 0).toString());
                       
            prodBean.setCodProduto(codProduto);
            
            ProdutoCRUD tela = new ProdutoCRUD(prodBean, "Editar Produto");
            tela.preencheCampos(prodBean);
            tela.show();
            this.dispose();
            
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um Produto", "Erro!", JOptionPane.WARNING_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseClicked
        
        int linhaSelecionada = tbl_produtos.getSelectedRow();
        
        if (linhaSelecionada >= 0) {
            
            int codProduto = Integer.parseInt(tbl_produtos.getValueAt(tbl_produtos.getSelectedRow(), 0).toString());
                       
            prodBean.setCodProduto(codProduto);
            
            int result = JOptionPane.showConfirmDialog(this, "Deseja exluir o produto selecionado?", "Excluir", JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {

                if (result == JOptionPane.YES_OPTION) {

                    boolean status = prodControl.removerProduto(prodBean);

                    if (status) {

                        JOptionPane.showMessageDialog(null, "Produto removido com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        
                        ProdutoArea tela = new ProdutoArea();
                        tela.show();
                        this.dispose();

                    } else {

                        JOptionPane.showMessageDialog(null, "Produto não removido", "ERRO", JOptionPane.ERROR_MESSAGE);

                    }

                }

            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto", "Erro!", JOptionPane.WARNING_MESSAGE);
            
        }

    }//GEN-LAST:event_btn_removerMouseClicked

    private void txt_buscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscaKeyTyped
        
        prodBean.setNome(txt_busca.getText());
        
        preencheTabelaNome(prodBean);

    }//GEN-LAST:event_txt_buscaKeyTyped

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
            java.util.logging.Logger.getLogger(ProdutoArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_adicionar;
    private javax.swing.JPanel btn_editar;
    private javax.swing.JPanel btn_remover;
    private javax.swing.JPanel btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JTable tbl_produtos;
    private javax.swing.JTextField txt_busca;
    // End of variables declaration//GEN-END:variables
}
