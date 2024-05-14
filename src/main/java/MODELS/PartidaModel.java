package MODELS;

import DOMINIO.Conjunto;
import DOMINIO.Partida;
import java.util.List;

import UTIL.ConjuntoMVC;
import UTIL.ConjuntoMVC.PosicionEnum;
import WEB.ProxyCliente;
import exceptions.DominioException;
import interaces.FichaDTO;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class PartidaModel implements ModeloDatos {

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

    public void validarFichasExistentesPozo() throws DominioException {
        ProxyCliente pc = ProxyCliente.obtenerInstancia();
        partida.validarFichasExistentesPozo();
    }

    public void agregarConConjunto(List<FichaDTO> fichasSeleccionadas, ConjuntoMVC conjuntoModificado, PosicionEnum posicion) {
        ProxyCliente pc = ProxyCliente.obtenerInstancia();
        pc.agregarConConjunto(fichasSeleccionadas, conjuntoModificado, posicion);
    }

    public void agregarSinConjunto(List<FichaDTO> fichasSeleccionadas) {
        ProxyCliente pc = ProxyCliente.obtenerInstancia();
        pc.agregarSinConjunto(fichasSeleccionadas);
    }

    public void realizarMovimientoDividir(List<FichaDTO> fichasSeleccionadas, ConjuntoMVC conjuntoSeleccionado) {

    }

    @Override
    public List<Conjunto> obtenerConjuntos() {
        return this.conjuntos;
    }
}
