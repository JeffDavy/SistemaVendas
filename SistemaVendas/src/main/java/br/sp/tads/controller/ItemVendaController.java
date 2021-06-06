package br.sp.tads.controller;

import br.sp.senac.tads.model.ItemVenda;
import br.sp.tads.dao.ItemVendaDAO;
import java.util.ArrayList;


/**
 *
 * @author Administrador
 */
public class ItemVendaController {
    
    ItemVendaDAO itemDAO = new ItemVendaDAO();

    public ItemVendaController() {
    }
    
    public void addController(ItemVenda item){
        
        itemDAO.addItem(item);
        
    }
    
    public ArrayList<ItemVenda> retornaLista() {
        
        return itemDAO.retornaItens();
        
    }
    
    public ArrayList<ItemVenda> retornaController(ItemVenda item) {
        
        ArrayList<ItemVenda> listaItem = new ArrayList<ItemVenda>();
        
        return listaItem = itemDAO.retornaProduto(item);
        
    }
    

    
}
