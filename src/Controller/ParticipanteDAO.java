/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Participante;
import co.avsoft.persistence.dao.AbstractDAO;

/**
 *
 * @author Contador
 */
public class ParticipanteDAO extends AbstractDAO<Participante> {

    public ParticipanteDAO() {
        super(Participante.class, "TriviaPU");
    }

    public Participante buscarParticipante(Long nuip) {
        return (Participante) getEntityManager().createNamedQuery("Participante.findByNuip")
                .setParameter("nuip", nuip)
                .getSingleResult();
    }

}
