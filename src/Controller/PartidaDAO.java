/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Partida;
import co.avsoft.persistence.dao.AbstractDAO;

/**
 *
 * @author Contador
 */
public class PartidaDAO extends AbstractDAO<Partida> {

    public PartidaDAO() {
        super(Partida.class, "TriviaPU");
    }
    
}
