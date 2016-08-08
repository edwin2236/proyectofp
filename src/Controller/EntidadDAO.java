/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entidad;
import co.avsoft.persistence.dao.AbstractDAO;
import java.util.List;

/**
 *
 * @author Contador
 */
public class EntidadDAO extends AbstractDAO<Entidad> {

    public EntidadDAO() {
        super(Entidad.class, "TriviaPU");
    }
    
    
    public List<String> buscarAcronimos(){
        return getEntityManager().createNamedQuery("Entidad.EntidadXAcronimo").getResultList();
    }
    
    
  
}
