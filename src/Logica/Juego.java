/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Controller.EntidadDAO;
import Controller.ParametroDAO;
import Controller.ParticipanteDAO;
import Controller.PreguntaDAO;
import Model.Parametro;
import Model.Participante;
import Model.Pregunta;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Contador
 */
public class Juego {

    private static final byte NIVELES = 3;

    ParticipanteDAO participanteDAO = new ParticipanteDAO();
    PreguntaDAO preguntaDAO = new PreguntaDAO();
    ParametroDAO parametroDAO = new ParametroDAO();
    EntidadDAO entidadDAO = new EntidadDAO();

    public void registrarParticipante(Participante participante) throws TriviaException, Exception {
        Participante pt = participanteDAO.buscarParticipante(participante.getNuip());
        if (pt != null) {
            throw new TriviaException("El participante ya esta registrado");
        }
        participanteDAO.save(participante);
    }
//    
//    public void guardarPartida(Partida partida){
//        
//    }
//    

    public List<Pregunta> obtenerPreguntas() {

        Parametro parametro = parametroDAO.buscarParametro(Parametro.PreguntasXPartida);
        short preguntas = Short.parseShort(parametro.getValor());
        short porNivel = (short) (preguntas / NIVELES);
        short dificultad = 1;
        Random aleatorio = new Random();

        List<String> acronimos = entidadDAO.buscarAcronimos();
        List<Pregunta> preguntasGeneradas = new LinkedList<>();

        String acronimo;
        Pregunta pregunta;

        while (preguntasGeneradas.size() < preguntas) {

            acronimo = acronimos.get(aleatorio.nextInt(acronimos.size()));
            pregunta = preguntaDAO.obtenerPregunta(acronimo, dificultad);

            if (preguntasGeneradas.contains(pregunta)) {
                continue;
            }

            preguntasGeneradas.add(pregunta);

            if ((dificultad < NIVELES) && (preguntasGeneradas.size() % porNivel) == 0) {
                dificultad++;

            }

        }
        return preguntasGeneradas;
    }
}
