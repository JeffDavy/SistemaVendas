/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.tads.view;

import br.sp.senac.tads.model.Cliente;
import br.sp.tads.controller.ClienteController;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Administrador
 */
public class ClienteCRUDEndereco extends javax.swing.JFrame {

    Cliente clienteBean = new Cliente();
    ClienteController clienteControl = new ClienteController();
    
    /**
     * Creates new form IndexVendedor
     */
    public ClienteCRUDEndereco() {
        initComponents();
        setIcon(this);
    }
    
    public ClienteCRUDEndereco(String operacao) {
        initComponents();
        lbl_operacao.setText(operacao);
        setIcon(this);
        
    }
    
    public ClienteCRUDEndereco(Cliente clienteBean, String operacao) {
        initComponents();
        this.clienteBean = clienteBean;
        lbl_operacao.setText(operacao);
        setIcon(this);
        
        if (operacao.equals("Cliente")) {
            
            btn_cancelar.setVisible(false);
            desabilitarCampos();
        }
                
    }
    
    
    
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
    
        /**
     * FUNÇÃO PARA VERIFICAR SE OS CAMPOS ESTÃO VAZIOS
     * @return boolean
     */
    public boolean verifiaCampos() {
        boolean vazio = false;

        if (txt_rua.getText().equals("")) {
            vazio =  true;
        }
        
        if (txt_numero.getText().equals("")) {
            vazio =  true;
        }
        
        if (txt_bairro.getText().equals("")) {
            vazio =  true;
        }
        
        if (txt_cidade.getText().equals("")) {
            vazio =  true;
        }
        
        if (txt_estado.getText().equals("")) {
            vazio =  true;
        }
        
        if (txt_complemento.getText().equals("")) {
            vazio =  true;
        }

        return vazio;

    }
    
    public void preencheCampos(ArrayList<Cliente> listaCliente) {
        
        int i = 0;
        
        for (Object obj : listaCliente) {

            Cliente cliBean = (Cliente) obj;
            
            txt_rua.setText(cliBean.getRua());
            txt_numero.setText(cliBean.getNumero());
            txt_bairro.setText(cliBean.getBairro());
            txt_cidade.setText(cliBean.getCidade());
            txt_estado.setText(cliBean.getEstado());
            txt_complemento.setText(cliBean.getComplemento());

           i++;

        }

    }
    
    public void desabilitarCampos() {

        txt_rua.setEditable(false);
        txt_numero.setEditable(false);
        txt_bairro.setEditable(false);
        txt_cidade.setEditable(false);
        txt_estado.setEditable(false);
        txt_complemento.setEditable(false);

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
        pnl_superior = new javax.swing.JPanel();
        pnl_botoesEstado = new javax.swing.JPanel();
        lbl_minimizar = new javax.swing.JLabel();
        lbl_fechar = new javax.swing.JLabel();
        lbl_operacao = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JPanel();
        lbl_usuarioSessao1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JPanel();
        lbl_usuarioSessao4 = new javax.swing.JLabel();
        btn_concluir = new javax.swing.JPanel();
        lbl_usuarioSessao2 = new javax.swing.JLabel();
        txt_rua = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txt_numero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_complemento = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txt_bairro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_fundo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_superior.setBackground(new java.awt.Color(0, 95, 72));
        pnl_superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnl_superior.add(pnl_botoesEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 80, 50));

        lbl_operacao.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbl_operacao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_operacao.setText("Operação");
        pnl_superior.add(lbl_operacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, -1));

        pnl_fundo.add(pnl_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

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

        lbl_usuarioSessao1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao1.setText("Cancelar");
        btn_cancelar.add(lbl_usuarioSessao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        pnl_fundo.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 90, 50));

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

        lbl_usuarioSessao4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao4.setText("Voltar");
        btn_voltar.add(lbl_usuarioSessao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        pnl_fundo.add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 90, 50));

        btn_concluir.setBackground(new java.awt.Color(0, 95, 72));
        btn_concluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_concluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_concluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_concluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_concluirMouseExited(evt);
            }
        });
        btn_concluir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_usuarioSessao2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lbl_usuarioSessao2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarioSessao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuarioSessao2.setText("Concluir");
        btn_concluir.add(lbl_usuarioSessao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        pnl_fundo.add(btn_concluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 90, 50));

        txt_rua.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_rua.setForeground(new java.awt.Color(51, 51, 51));
        txt_rua.setBorder(null);
        pnl_fundo.add(txt_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 350, -1));

        jSeparator1.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator1.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 350, 10));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("Rua");
        pnl_fundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator4.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 170, 10));

        txt_numero.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_numero.setForeground(new java.awt.Color(51, 51, 51));
        txt_numero.setBorder(null);
        pnl_fundo.add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 170, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Número");
        pnl_fundo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator5.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 350, 10));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("Bairro");
        pnl_fundo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        txt_estado.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_estado.setForeground(new java.awt.Color(51, 51, 51));
        txt_estado.setBorder(null);
        pnl_fundo.add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 160, -1));

        jSeparator6.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator6.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 160, 10));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("Estado");
        pnl_fundo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        txt_complemento.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_complemento.setForeground(new java.awt.Color(51, 51, 51));
        txt_complemento.setBorder(null);
        pnl_fundo.add(txt_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 350, -1));

        jSeparator7.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator7.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 350, 10));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("Complemento");
        pnl_fundo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("Cidade");
        pnl_fundo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        txt_cidade.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_cidade.setForeground(new java.awt.Color(51, 51, 51));
        txt_cidade.setBorder(null);
        pnl_fundo.add(txt_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 170, -1));

        jSeparator8.setBackground(new java.awt.Color(40, 40, 40));
        jSeparator8.setForeground(new java.awt.Color(40, 40, 40));
        pnl_fundo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 170, 10));

        txt_bairro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txt_bairro.setBorder(null);
        pnl_fundo.add(txt_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 350, -1));

        getContentPane().add(pnl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseEntered
        setColor(btn_cancelar);
    }//GEN-LAST:event_btn_cancelarMouseEntered

    private void btn_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseExited
        resetColor(btn_cancelar);
    }//GEN-LAST:event_btn_cancelarMouseExited

    private void lbl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minimizarMouseClicked
        this.setState(1);
    }//GEN-LAST:event_lbl_minimizarMouseClicked

    private void lbl_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fecharMouseClicked
        ClienteArea home = new ClienteArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_lbl_fecharMouseClicked

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        ClienteArea home = new ClienteArea();
        home.show();
        this.dispose();
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_concluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_concluirMouseClicked

        if (verifiaCampos()) {
            
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        } else {
            
            clienteBean.setRua(txt_rua.getText());
            clienteBean.setNumero(txt_numero.getText());
            clienteBean.setBairro(txt_bairro.getText());
            clienteBean.setCidade(txt_cidade.getText());
            clienteBean.setEstado(txt_estado.getText());
            clienteBean.setComplemento(txt_complemento.getText());

            if (lbl_operacao.getText().equals("Adicionar Cliente")) {
                
                boolean status = clienteControl.cadastrarController(clienteBean);
                

                if (status) {

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                    ClienteArea home = new ClienteArea();
                    home.show();
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Cliente não cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);

                    ClienteArea home = new ClienteArea();
                    home.show();
                    this.dispose();

                }
                
            } else if (lbl_operacao.getText().equals("Editar Cliente")) {
                
                boolean status = clienteControl.editarController(clienteBean);
                
                if (status) {

                    JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

                    ClienteArea home = new ClienteArea();
                    home.show();
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Cliente não editado", "ERRO", JOptionPane.ERROR_MESSAGE);

                    ClienteArea home = new ClienteArea();
                    home.show();
                    this.dispose();

                }
                
            } else {
                
                ClienteArea home = new ClienteArea();
                home.show();
                this.dispose();
                
            }
            
        }

    }//GEN-LAST:event_btn_concluirMouseClicked

    private void btn_concluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_concluirMouseEntered
        setColor(btn_concluir);
    }//GEN-LAST:event_btn_concluirMouseEntered

    private void btn_concluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_concluirMouseExited
        resetColor(btn_concluir);
    }//GEN-LAST:event_btn_concluirMouseExited

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        if (lbl_operacao.getText().equals("Cadastrar Cliente")) {
            ClienteCRUD home = new ClienteCRUD(clienteBean, lbl_operacao.getText());
            home.preencherCamposCadastro(clienteBean);
            home.show();
            this.dispose();
            
        } else {
            ClienteCRUD home = new ClienteCRUD(clienteBean, lbl_operacao.getText());
            home.preencheCampos(clienteBean);
            home.show();
            this.dispose();
            
        }
        
        
    }//GEN-LAST:event_btn_voltarMouseClicked

    private void btn_voltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseEntered
        setColor(btn_voltar);
    }//GEN-LAST:event_btn_voltarMouseEntered

    private void btn_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseExited
        resetColor(btn_voltar);
    }//GEN-LAST:event_btn_voltarMouseExited

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
            java.util.logging.Logger.getLogger(ClienteCRUDEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCRUDEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCRUDEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCRUDEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ClienteCRUDEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cancelar;
    private javax.swing.JPanel btn_concluir;
    private javax.swing.JPanel btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbl_fechar;
    private javax.swing.JLabel lbl_minimizar;
    private javax.swing.JLabel lbl_operacao;
    private javax.swing.JLabel lbl_usuarioSessao1;
    private javax.swing.JLabel lbl_usuarioSessao2;
    private javax.swing.JLabel lbl_usuarioSessao4;
    private javax.swing.JPanel pnl_botoesEstado;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_superior;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_rua;
    // End of variables declaration//GEN-END:variables
}
