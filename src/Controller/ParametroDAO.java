/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Parametro;
import co.avsoft.persistence.dao.AbstractDAO;

/**
 *
 * @author Contador
 */
public class ParametroDAO extends AbstractDAO<Parametro> {

    public ParametroDAO() {
        super(Parametro.class, "TriviaPU");
    }
    
    
    public Parametro buscarParametro(String nombre){
        return  (Parametro) getEntityManager().createNamedQuery("Parametro.buscarXnombre")
                .setParameter("nombre", nombre).getSingleResult();
    }
    
  
}
