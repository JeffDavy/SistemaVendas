package br.sp.tads.dao;

import br.sp.senac.tads.model.Venda;
import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Jeferson Davi
 */
public class VendaDAO {
    
    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    
    public boolean registrarVenda(Venda vendaBean) {
        
        boolean status = false;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "insert into Vendas (Vendedores_codVendedor, Clientes_codCliente, dataVenda, valorVenda, razaoSocial) values (?,?,?,?,?)";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setInt(1, vendaBean.getCodVendedor());
            instrucaoSQL.setInt(2, vendaBean.getCodCliente());
            instrucaoSQL.setString(3, vendaBean.getDataVenda());
            instrucaoSQL.setDouble(4, vendaBean.getValorVenda());
            instrucaoSQL.setString(5, vendaBean.getRazaoSocial());
                        
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                status = true;

            } else {
                throw new Exception();

            }
            
        } catch (Exception e) {
        }
        
        
        return status;
        
    }
    
    public int pegarId() {
        
        int ultimoCod = 0;
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select max(codVenda) from Vendas";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                ultimoCod = rs.getInt("max(codVenda)");
                
            }
            
        } catch (Exception e) {
        }
        
        return ultimoCod;
        
    }
    
}
