package br.sp.tads.dao;

import br.sp.senac.tads.model.Vendedor;
import br.sp.tads.interfaces.IPessoa;
import br.sp.tads.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class VendedorDAO  implements IPessoa {
    
    Connection conexao;

    /**
     * Driver do MySQL a partir da versão 8.0
     */
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    
    /**
     * MÉTODOS COM ACESSO AO BANCO DE DADOS
     */

    /**
     * CADASTRO DE VENDEDOR
     * @param vendedorBean
     * @return boolean
     */
    public boolean cadastrar(Vendedor vendedorBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "insert into Vendedores (nome, cpf, dataNascimento, email, contato1, contato2, usuario, senha) values (?,?,?,?,?,?,?,?)";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getNome());
            instrucaoSQL.setString(2, vendedorBean.getCpf());
            instrucaoSQL.setString(3, vendedorBean.getDataNascimento());
            instrucaoSQL.setString(4, vendedorBean.getEmail());
            instrucaoSQL.setString(5, vendedorBean.getContato1());
            instrucaoSQL.setString(6, vendedorBean.getContato2());
            instrucaoSQL.setString(7, vendedorBean.getUsuario());
            instrucaoSQL.setString(8, vendedorBean.getSenha());


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
    
    
    /**
     * EDIÇÃO DE VENDEDOR
     * @param vendedorBean
     * @return boolean
     */
    public boolean editar(Vendedor vendedorBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Vendedores set nome = ?, dataNascimento = ?, email = ?, contato1 = ?, contato2 = ?, usuario = ?, senha = ? where  cpf = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getNome());
            instrucaoSQL.setString(2, vendedorBean.getDataNascimento());
            instrucaoSQL.setString(3, vendedorBean.getEmail());
            instrucaoSQL.setString(4, vendedorBean.getContato1());
            instrucaoSQL.setString(5, vendedorBean.getContato2());
            instrucaoSQL.setString(6, vendedorBean.getUsuario());
            instrucaoSQL.setString(7, vendedorBean.getSenha());
            instrucaoSQL.setString(8, vendedorBean.getCpf());
 

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
    
    
    /**
     * DESATIVAÇÃO e ATIVAÇÃO DE VENDEDOR
     * @param vendedorBean
     * @return boolean
     */
    public boolean desativarAtivar(Vendedor vendedorBean) {

        boolean status = false;

        try {

            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Vendedores set estadoAtual = ? where codVendedor = ?";

            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setString(1, vendedorBean.getEstadoAtual());
            instrucaoSQL.setInt(2, vendedorBean.getCodVendedor());

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
    
    
    /** CONSULTAR 1 VENDEDOR
     * @param vendedorBean
     * @return ArrayList
     */
    public ArrayList<Vendedor> consultar(Vendedor vendedorBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Vendedores where codVendedor = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, vendedorBean.getCodVendedor());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Vendedor vendedor = new Vendedor();
                
                vendedor.setCodVendedor(rs.getInt("codVendedor"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setDataNascimento(rs.getString("dataNascimento"));
                vendedor.setEmail(rs.getString("email"));
                vendedor.setContato1(rs.getString("contato1"));
                vendedor.setContato2(rs.getString("contato2"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setSenha(rs.getString("senha"));
                vendedor.setTipo(rs.getString("tipo"));
                vendedor.setEstadoAtual(rs.getString("estadoAtual"));
                vendedor.setComissao(rs.getDouble("comissao"));

                
                listaVendedor.add(vendedor);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaVendedor;
        
    }
    
    
    /** LISTAR TODOS OS VENDEDORES
     * @param vendedorBean
     * @return ArrayList
     */
    public ArrayList<Vendedor> listar(Vendedor vendedorBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Vendedores where estadoAtual = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setString(1, vendedorBean.getEstadoAtual());
           
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Vendedor vendedor = new Vendedor();
                
                vendedor.setCodVendedor(rs.getInt("codVendedor"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setDataNascimento(rs.getString("dataNascimento"));
                vendedor.setEmail(rs.getString("email"));
                vendedor.setContato1(rs.getString("contato1"));
                vendedor.setContato2(rs.getString("contato2"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setSenha(rs.getString("senha"));
                vendedor.setTipo(rs.getString("tipo"));
                vendedor.setEstadoAtual(rs.getString("estadoAtual"));
                vendedor.setComissao(rs.getDouble("comissao"));
                
                listaVendedor.add(vendedor);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaVendedor;
        
    }
    
    /** LISTAR TODOS OS VENDEDORES
     * @param vendedorBean
     * @return ArrayList
     */
    public ArrayList<Vendedor> listarNome(Vendedor vendedorBean) {

        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select * from Vendedores where nome like ? and estadoAtual = ?";
                       
            instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setString(1, vendedorBean.getNome() + "%");
            instrucaoSQL.setString(2, vendedorBean.getEstadoAtual());
           
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Vendedor vendedor = new Vendedor();
                
                vendedor.setCodVendedor(rs.getInt("codVendedor"));
                vendedor.setNome(rs.getString("nome"));
                vendedor.setCpf(rs.getString("cpf"));
                vendedor.setDataNascimento(rs.getString("dataNascimento"));
                vendedor.setEmail(rs.getString("email"));
                vendedor.setContato1(rs.getString("contato1"));
                vendedor.setContato2(rs.getString("contato2"));
                vendedor.setUsuario(rs.getString("usuario"));
                vendedor.setSenha(rs.getString("senha"));
                vendedor.setTipo(rs.getString("tipo"));
                vendedor.setEstadoAtual(rs.getString("estadoAtual"));
                vendedor.setComissao(rs.getDouble("comissao"));
                
                listaVendedor.add(vendedor);
                
            }
            
        } catch (Exception e) {
        }
        
        return listaVendedor;
        
    }
   
    
    /** PEGAR CÓDIGO DO VENDEDOR
     * @param cpf
     * @return int
     */
    @Override
    public int pegarId(int cpf) {
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        int id = 0;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select codCliente from Vendedores where cpf = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setInt(1, cpf);
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                id = rs.getInt("codVendedor");
                
            }
            
        } catch (Exception e) {
        }
        
        return id;

    }
    
    public boolean atualizaComissao(Vendedor vendBean) {
            
        boolean status = false;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "update Vendedores set comissao = ? where codVendedor = ?";
                    
            PreparedStatement instrucaoSQL = conexao.prepareStatement(sql);

            instrucaoSQL.setDouble(1, vendBean.getComissao());
            instrucaoSQL.setInt(2, vendBean.getCodVendedor());
            
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
    
    public double retornaComissao(Vendedor vendBean) {
        
        double comissao = 0;
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select comissao from Vendedores where codVendedor = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setInt(1, vendBean.getCodVendedor());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                comissao = rs.getDouble("comissao");
                
            }
            
        } catch (Exception e) {
        }
        
        return comissao;
        
    }
    
    public ArrayList<Vendedor> validaLogin(Vendedor vendBean) {
        
        String nome = "";
        
        ResultSet rs = null;
        PreparedStatement instrucaoSQL = null;
        
        ArrayList<Vendedor> usuario = new ArrayList<Vendedor>();
        
        try {
            
            Class.forName(DRIVER);
            conexao = Conexao.abrirConexao();

            String sql = "select codVendedor, nome from Vendedores where usuario = ? and senha = ?";
            
            instrucaoSQL = conexao.prepareStatement(sql);
            
            instrucaoSQL.setString(1, vendBean.getUsuario());
            instrucaoSQL.setString(2, vendBean.getSenha());
            
            rs = instrucaoSQL.executeQuery();
            
            while (rs.next()) {
                
                Vendedor bean = new Vendedor();
                
                bean.setCodVendedor(rs.getInt("codVendedor"));
                bean.setNome(rs.getString("nome"));
                
                usuario.add(bean);
                
            }
            
        } catch (Exception e) {
        }
        
        return usuario;
        
    }
    
}
