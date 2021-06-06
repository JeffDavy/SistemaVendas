package br.sp.tads.controller;

import br.sp.senac.tads.model.Relatorio;
import br.sp.tads.dao.RelatorioDAO;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class RelatorioController {

    public RelatorioController() {
    }
    
    RelatorioDAO relDAO = new RelatorioDAO();
    
    public ArrayList<Relatorio> consultaVendasController() {
        
        ArrayList<Relatorio> listaVendas = relDAO.listarVendas();
        
        return listaVendas;
        
    }
    
}
