package br.sp.tads.dao;

import br.sp.senac.tads.model.Relatorio;
import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class RelatorioDAO {

    public RelatorioDAO() {
    }
    
    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public ArrayList<Relatorio> listarVendas() {
        

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Relatorio> listaVendas = new ArrayList<Relatorio>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Vendas";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Relatorio rel = new Relatorio();
                
                rel.setCodVenda(rs.getInt("codVenda"));
                rel.setCodVendedor(rs.getInt("Vendedores_codVendedor"));
                rel.setCodCliente(rs.getInt("Clientes_codCliente"));
                rel.setDataVenda(rs.getString("dataVenda"));
                rel.setValorVenda(rs.getDouble("valorVenda"));
                rel.setNomeCliente(rs.getString("razaoSocial"));
    
                listaVendas.add(rel);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaVendas;
        
    }


}
