package br.sp.tads.view;

import br.sp.senac.tads.model.Cliente;
import br.sp.senac.tads.model.ItemVenda;
import br.sp.senac.tads.model.Produto;
import br.sp.senac.tads.model.Vendedor;
import br.sp.tads.controller.ClienteController;
import br.sp.tads.controller.ItemVendaController;
import br.sp.tads.controller.ProdutoController;
import br.sp.tads.controller.VendedorController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class VendaArea extends javax.swing.JFrame {
    
    Cliente clienteBean = new Cliente();
    Produto prodBean = new Produto();
    Vendedor vendedorBean = new Vendedor();
    ItemVenda itemBean = new ItemVenda();
    
    ClienteController clienteControl = new ClienteController();
    ProdutoController prodControl = new ProdutoController();
    VendedorController vendedorControl = new VendedorController();
    ItemVendaController itemController = new ItemVendaController();
    
    ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    ArrayList<ItemVenda> listaItens = new ArrayList<ItemVenda>();
        
    public VendaArea() {
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
    
    public void preencheTabela(ArrayList<ItemVenda> lista) {
                
        if (listaProduto.size() > 0) {
            
            DefaultTableModel tmProduto= new DefaultTableModel();
            
            tmProduto.addColumn("Código");
            tmProduto.addColumn("Nome");
            tmProduto.addColumn("Valor");
            tmProduto.addColumn("Quantidade");
            
            tbl_lista.setModel(tmProduto);
            
            int i = 0;
            
            for (Object obj : listaProduto) {
                
                ItemVenda prodBean = (ItemVenda) obj;
                
                tmProduto.addRow(new String[1]);
                
                tbl_lista.setValueAt(prodBean.getCodProduto(), i, 0);
                tbl_lista.setValueAt(prodBean.getNomeProduto(), i, 1);
                tbl_lista.setValueAt(prodBean.getValorProduto(), i, 2);
                tbl_lista.setValueAt(prodBean.getQtdProduto(), i, 3);
                
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
        pnl_botoesEstado = new javax.swing.JPanel();
        lbl_minimizar = new javax.swing.JLabel();
        lbl_fechar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_verCliente = new javax.swing.JPanel();
        lbl_usuarioSessao2 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JPanel();
        lbl_usuarioSessao4 = new javax.swing.JLabel();
        btn_finalizar = new javax.swing.JPanel();
        lbl_usuarioSessao1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txt_cnpj = new javax.swing.JFormattedTextField();
        lbl_cliente = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btn_limparLista = new javax.swing.JPanel();
        lbl_usuarioSessao6 = new javax.swing.JLabel();
        btn_remover = new javax.swing.JPanel();
        btn_removerItem = new javax.swing.JLabel();
        btn_inserir = new javax.swing.JPanel();
        lbl_usuarioSessao5 = new javax.swing.JLabel();
        btn_verCodigo = new javax.swing.JPanel();
        lbl_usuarioSessao3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lbl_total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_lista = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_qtd = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl_cod = new javax.swing.JLabel();
        lbl_produto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_lateral.setBackground(new java.awt.Color(0, 95, 72));
        pnl_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de venda");
        pnl_lateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, -1));

        pnl_fundo.add(pnl_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        btn_verCliente.setBackground(new java.awt.Color(0, 95, 72));
        btn_verCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_verCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_verClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_verClienteMouseExited(evt);
            }
        });
        btn_verCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao2.setText("Verificar");
        btn_verCliente.add(lbl_usuarioSessao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_verCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 90, 40));

        btn_cancelar.setBackground(new java.awt.Color(0, 95, 72));
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseExited(evt);
            }
        });
        btn_cancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuarioSessao4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao4.setText("Cancelar");
        btn_cancelar.add(lbl_usuarioSessao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        pnl_fundo.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 110, 50));

        btn_finalizar.setBackground(new java.awt.Color(0, 95, 72));
        btn_finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseExited(evt);
            }
        });
        btn_finalizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_usuarioSessao1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao1.setText("Finalizar");
        btn_finalizar.add(lbl_usuarioSessao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        pnl_fundo.add(btn_finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 110, 50));

        jSeparator1.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator1.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, 10));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel15.setText("Lista de produtos");
        pnl_fundo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        txt_cnpj.setBorder(null);
        try {
            txt_cnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnl_fundo.add(txt_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 190, -1));

        lbl_cliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_cliente.setForeground(new java.awt.Color(40, 40, 40));
        lbl_cliente.setText(".");
        pnl_fundo.add(lbl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 340, -1));

        jSeparator2.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator2.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 190, 10));

        btn_limparLista.setBackground(new java.awt.Color(0, 95, 72));
        btn_limparLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limparLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_limparListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limparListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_limparListaMouseExited(evt);
            }
        });
        btn_limparLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao6.setText("Limpar");
        btn_limparLista.add(lbl_usuarioSessao6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_limparLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 90, 40));

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

        btn_removerItem.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btn_removerItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_removerItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_removerItem.setText("Remover");
        btn_remover.add(btn_removerItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 90, 40));

        btn_inserir.setBackground(new java.awt.Color(0, 95, 72));
        btn_inserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inserirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inserirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inserirMouseExited(evt);
            }
        });
        btn_inserir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao5.setText("Inserir");
        btn_inserir.add(lbl_usuarioSessao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 90, 40));

        btn_verCodigo.setBackground(new java.awt.Color(0, 95, 72));
        btn_verCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_verCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verCodigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_verCodigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_verCodigoMouseExited(evt);
            }
        });
        btn_verCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao3.setText("Buscar");
        btn_verCodigo.add(lbl_usuarioSessao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        pnl_fundo.add(btn_verCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 90, 40));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel17.setText("Quantidade");
        pnl_fundo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 100, -1));

        txt_codigo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.setBorder(null);
        pnl_fundo.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 190, -1));

        lbl_total.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_total.setText("R$ 0,00");
        pnl_fundo.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 140, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Valor Total:");
        pnl_fundo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

        tbl_lista.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        tbl_lista.setForeground(new java.awt.Color(40, 40, 40));
        tbl_lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_lista.setGridColor(new java.awt.Color(40, 40, 40));
        tbl_lista.setSelectionBackground(new java.awt.Color(0, 95, 72));
        jScrollPane2.setViewportView(tbl_lista);
        if (tbl_lista.getColumnModel().getColumnCount() > 0) {
            tbl_lista.getColumnModel().getColumn(0).setResizable(false);
            tbl_lista.getColumnModel().getColumn(1).setResizable(false);
            tbl_lista.getColumnModel().getColumn(2).setResizable(false);
            tbl_lista.getColumnModel().getColumn(3).setResizable(false);
        }

        pnl_fundo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 350, 300));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel18.setText("Informe o CNPJ do cliente");
        pnl_fundo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel19.setText("Valor:");
        pnl_fundo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel20.setText("Produto:");
        pnl_fundo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        lbl_valor.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_valor.setForeground(new java.awt.Color(40, 40, 40));
        lbl_valor.setText(".");
        pnl_fundo.add(lbl_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 340, -1));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel21.setText("Informe o código do produto");
        pnl_fundo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 220, -1));

        txt_qtd.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_qtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_qtd.setBorder(null);
        pnl_fundo.add(txt_qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 90, -1));

        jSeparator3.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator3.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 90, 10));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel22.setText("Código:");
        pnl_fundo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel23.setText("Cliente:");
        pnl_fundo.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lbl_cod.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_cod.setForeground(new java.awt.Color(40, 40, 40));
        lbl_cod.setText(".");
        pnl_fundo.add(lbl_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 340, -1));

        lbl_produto.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_produto.setForeground(new java.awt.Color(40, 40, 40));
        lbl_produto.setText(".");
        pnl_fundo.add(lbl_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 340, -1));

        getContentPane().add(pnl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_finalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseEntered
        setColor(btn_finalizar);
    }//GEN-LAST:event_btn_finalizarMouseEntered

    private void btn_finalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseExited
        resetColor(btn_finalizar);
    }//GEN-LAST:event_btn_finalizarMouseExited

    private void lbl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lbl_minimizarMouseClicked

    private void lbl_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fecharMouseClicked
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_lbl_fecharMouseClicked

    private void btn_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseClicked
        
    }//GEN-LAST:event_btn_finalizarMouseClicked

    private void btn_verClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verClienteMouseClicked

        if (!txt_cnpj.getText().equals("")) {
            
            ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
            
            clienteBean.setCnpj(txt_cnpj.getText());
            
            listaCliente = clienteControl.consultaCnpjController(clienteBean);
            
            if (listaCliente.isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "O CNPJ informado não se encontra no cadastro", "ERRO", JOptionPane.ERROR_MESSAGE);
                
            } else {
                
                int i = 0;
                
                for(Object obj : listaCliente) {
                    
                    Cliente cliBean = (Cliente) obj;
                    
                    lbl_cod.setText(Integer.toString(cliBean.getCodCliente()));
                    lbl_cliente.setText(cliBean.getNome());
                    
                }

            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Informe o CNPJ do cliente", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }

    }//GEN-LAST:event_btn_verClienteMouseClicked

    private void btn_verClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verClienteMouseEntered

    private void btn_verClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verClienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verClienteMouseExited

    private void btn_verCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verCodigoMouseClicked
        
        if (!txt_codigo.getText().equals("")) {
            
            prodBean.setCodProduto(Integer.parseInt(txt_codigo.getText()));
            
            listaProduto = prodControl.consultarController(prodBean);
            
            if (listaProduto.isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "O produto informado não se encontra no cadastro", "ERRO", JOptionPane.ERROR_MESSAGE);
                
            } else {
                
                int i = 0;
                
                for(Object obj : listaProduto) {
                    
                    Produto prod = (Produto) obj;
                    
                    lbl_produto.setText(Integer.toString(prod.getCodProduto()));
                    lbl_valor.setText("R$ " + Double.toString(prod.getValor()));
                    
                    itemBean.setCodProduto(prod.getCodProduto());
                    itemBean.setNomeProduto(prod.getNome());
                    itemBean.setValorProduto(prod.getValor());
                    
                    
                }
                
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Informe o código do produto", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }

        
    }//GEN-LAST:event_btn_verCodigoMouseClicked

    private void btn_verCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verCodigoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verCodigoMouseEntered

    private void btn_verCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verCodigoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verCodigoMouseExited

    private void btn_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removerMouseClicked

    private void btn_removerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removerMouseEntered

    private void btn_removerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_removerMouseExited

    private void btn_limparListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limparListaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparListaMouseClicked

    private void btn_limparListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limparListaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparListaMouseEntered

    private void btn_limparListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limparListaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limparListaMouseExited

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        Home home = new Home();
        home.show();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarMouseEntered

    private void btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarMouseExited

    private void btn_inserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inserirMouseClicked
        
        int linhas = 0;
        
        if (txt_codigo.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Informe o código do produto", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        if (txt_qtd.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Informe a quantidade", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        if (!txt_codigo.getText().equals("") && !txt_qtd.getText().equals("")) {

            int i = 0;

            for (Object obj : listaProduto) {

                Produto prod = (Produto) obj;

                lbl_produto.setText(Integer.toString(prod.getCodProduto()));
                lbl_valor.setText("R$ " + Double.toString(prod.getValor()));
                
                ItemVenda itemVenda = new ItemVenda();
                
                itemBean.setCodProduto(prod.getCodProduto());
                itemBean.setNomeProduto(prod.getNome());
                itemBean.setValorProduto(prod.getValor());
                itemBean.setQtdProduto(Integer.parseInt(txt_qtd.getText()));
                
                
            }
            
            listaItens.add(itemBean);
            
            txt_codigo.setText("");
            txt_qtd.setText("");
            lbl_produto.setText("");
            lbl_valor.setText("");
            
            
            System.out.println("------------------------------------------");
            for (Object obj : listaItens) {
                
                ItemVenda prodBean = (ItemVenda) obj;
                
                System.out.println("Cod " + prodBean.getCodProduto());
                System.out.println("Nome" + prodBean.getNomeProduto());
                System.out.println("Valor" + prodBean.getValorProduto());
                System.out.println("Qtd" + prodBean.getQtdProduto());
                
                
            }

            
        }

    }//GEN-LAST:event_btn_inserirMouseClicked

    private void btn_inserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inserirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inserirMouseEntered

    private void btn_inserirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inserirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inserirMouseExited

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
            java.util.logging.Logger.getLogger(VendaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar;
    private javax.swing.JPanel btn_finalizar;
    private javax.swing.JPanel btn_inserir;
    private javax.swing.JPanel btn_limparLista;
    private javax.swing.JPanel btn_remover;
    private javax.swing.JLabel btn_removerItem;
    private javax.swing.JPanel btn_verCliente;
    private javax.swing.JPanel btn_verCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_fechar;
    private javax.swing.JLabel lbl_minimizar;
    private javax.swing.JLabel lbl_produto;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_usuarioSessao1;
    private javax.swing.JLabel lbl_usuarioSessao2;
    private javax.swing.JLabel lbl_usuarioSessao3;
    private javax.swing.JLabel lbl_usuarioSessao4;
    private javax.swing.JLabel lbl_usuarioSessao5;
    private javax.swing.JLabel lbl_usuarioSessao6;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JPanel pnl_botoesEstado;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_lateral;
    private javax.swing.JTable tbl_lista;
    private javax.swing.JFormattedTextField txt_cnpj;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_qtd;
    // End of variables declaration//GEN-END:variables
}
