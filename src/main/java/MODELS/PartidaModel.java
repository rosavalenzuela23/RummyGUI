package MODELS;

import DOMINIO.Conjunto;
import DOMINIO.Partida;
import java.util.List;

import UTIL.ConjuntoMVC;
import UTIL.ConjuntoMVC.PosicionEnum;
import WEB.ProxyCliente;
import arqui.util.Datos;
import exceptions.DominioException;
import interaces.FichaDTO;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class PartidaModel{

    private static PartidaModel instancia;
    private static Partida partida;
    private List<Conjunto> conjuntos;

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

    public void terminarTurno(){
        Datos datos = new Datos(null, "terminar turno");
        
        ProxyCliente.obtenerInstancia().terminarTurno(datos);
    }
  
}
