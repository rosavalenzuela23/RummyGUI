package MODELS;

import DOMINIO.Conjunto;
import DOMINIO.Partida;
import UTIL.SuscriptorPartida;
import WEB.ProxyCliente;
import java.util.List;

import arqui.util.Datos;
import interaces.ConjuntoDTO;
import interaces.FichaDTO;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class PartidaModel {

    private static PartidaModel instancia;
    private static Partida partida;
    private List<Conjunto> conjuntos;
    private SuscriptorPartida sub;

    public static PartidaModel obtenerInstancia() {
        if (PartidaModel.instancia == null) {
            PartidaModel.instancia = new PartidaModel();
        }
        return PartidaModel.instancia;
    }

//    Partida partida;
    private PartidaModel() {
        //Borrar
        conjuntos = new ArrayList<>();
    }

    public void agregarSinConjunto(List<FichaDTO> fichas) {

    }

    public void agregarConConjunto(List<FichaDTO> fichas, ConjuntoDTO conjunto, boolean adelante) {

    }

    public void realizarMovimientoDividir(ConjuntoDTO conjunto, int[] periodo) {

    }

    public void terminarTurno() {
        Datos datos = new Datos(null, "terminar turno");

        ProxyCliente.obtenerInstancia().terminarTurno(datos);
    }
    
    public void agregarFichaAMazo(){
        Datos datos = new Datos(null, "agregar ficha a mazo");
        ProxyCliente.obtenerInstancia().agregarFichaAMazo(datos);
    }
  
}
