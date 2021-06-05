package br.sp.tads.controller;

import br.sp.senac.tads.model.Produto;
import br.sp.tads.dao.ProdutoDAO;
import java.util.ArrayList;

/**
 *
 * @author Jeferson Davi
 */
public class ProdutoController {

    public ProdutoController() {
    }
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public boolean cadastrarController(Produto prodBean) {
        
        boolean status = false;
        
        return status = produtoDAO.cadastrarProduto(prodBean);
        
    }
    
    public boolean editarController(Produto prodBean) {
        
        boolean status = false;
        
        return status = produtoDAO.editarProduto(prodBean);
        
    }
    
    public boolean removerProduto(Produto prodBean) {
        
        boolean status = false;
        
        return status = produtoDAO.removerProduto(prodBean);
        
    }
    
    public ArrayList<Produto> consultarController(Produto prodBean) {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        return listaProduto = produtoDAO.consultarProduto(prodBean);
        
    }
    
    public ArrayList<Produto> listarController() {
        
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        
        return listaProduto = produtoDAO.listarProduto();
        
    }
    
}
