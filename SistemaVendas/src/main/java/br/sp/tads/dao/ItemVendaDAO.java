package br.sp.tads.dao;

import br.sp.senac.tads.model.ItemVenda;
import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class ItemVendaDAO {
    
    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    static ArrayList<ItemVenda> listaItens = new ArrayList<>();
    
    public ArrayList<ItemVenda> retornaItens() {
        
        return ItemVendaDAO.listaItens;
        
    }
    
    public void addItem(ItemVenda item) {
        
        listaItens.add(item);
        
    }
    
    public boolean limparLista() {
        
        listaItens.clear();
        
        return true;
        
    }
    
    public boolean excluirItem(ItemVenda item) {
        
        listaItens.remove(item);
        
        return true;
        
    }
    
    /** CONSULTAR PRODUTO VENDA
     * @return ArrayList
     */
    public ArrayList<ItemVenda> retornaProduto(ItemVenda itemBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<ItemVenda> listaItem = new ArrayList<ItemVenda>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select codProduto, nome, valor from Produtos where codProduto = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, itemBean.getCodProduto());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                ItemVenda produto = new ItemVenda();
                
                produto.setCodProduto(rs.getInt("codProduto"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setValorProduto(rs.getDouble("valor"));

                listaItem.add(produto);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaItem;
        
    }
    
  
    
}
