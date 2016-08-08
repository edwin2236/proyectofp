/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pregunta;
import co.avsoft.persistence.dao.AbstractDAO;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Contador
 */
public class PreguntaDAO extends AbstractDAO<Pregunta>{

    public PreguntaDAO() {
        super(Pregunta.class, "TriviaPU");
    }
    
    public Pregunta obtenerPregunta(String acronimo, short dificultad){
        List<Pregunta> preguntas = getEntityManager()
                .createNamedQuery("Pregunta.buscarXAcronimo&&Dificultad")
                .setParameter("acronimo", acronimo)
                .setParameter("dificultad", dificultad)
                .getResultList();

        Random random = new Random();
        int pos = random.nextInt(preguntas.size());
        return preguntas.get(pos);
    }

 
}
