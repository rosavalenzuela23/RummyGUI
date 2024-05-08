
package MODELS;

import DOMINIO.Conjunto;
import java.util.List;

import UTIL.ConjuntoMVC;
import UTIL.ConjuntoMVC.PosicionEnum;
import UTIL.FichaMVC;
import WEB.ProxyCliente;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class PartidaModel implements ModeloDatos {
    
    private static PartidaModel instancia;
    
    private List<Conjunto> conjuntos;
    
    public static PartidaModel obtenerInstancia() {
        if (PartidaModel.instancia == null) {
            PartidaModel.instancia = new PartidaModel();
        }
        return PartidaModel.instancia;
    }
    
//    Partida partida;
   
    private PartidaModel(){
        //Borrar
       conjuntos = new ArrayList<>();
    }
    
    
    
    public void validarFichasExistentesPozo(){
//        this.partida.validarFichasExistentesPozo();
    }

    public void agregarConConjunto(List<FichaMVC> fichasSeleccionadas, ConjuntoMVC conjuntoModificado, PosicionEnum posicion) {
        ProxyCliente pc = ProxyCliente.obtenerInstancia();
        pc.agregarConConjunto(fichasSeleccionadas, conjuntoModificado, posicion);
    }

    public void agregarSinConjunto(List<FichaMVC> fichasSeleccionadas) {
        ProxyCliente pc = ProxyCliente.obtenerInstancia();
        pc.agregarSinConjunto(fichasSeleccionadas);
    }
    
    public void realizarMovimientoDividir(List<FichaMVC> fichasSeleccionadas, ConjuntoMVC conjuntoSeleccionado) {
        
    }

    @Override
    public List<Conjunto> obtenerConjuntos() {
        return this.conjuntos;
    }
}
