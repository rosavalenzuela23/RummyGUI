
package MODELS;

import DOMINIO.Conjunto;
import java.util.List;

import UTIL.ConjuntoMVC;
import UTIL.ConjuntoMVC.PosicionEnum;
import UTIL.FichaMVC;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class PartidaModel implements ModeloDatos{
    
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

    public void realizarMovimientoAgregar(List<FichaMVC> fichasSeleccionadas, ConjuntoMVC conjuntoModificado, 
        PosicionEnum posicion) {
        
            if (conjuntoModificado == null) {



            }
        
    }

    @Override
    public List<Conjunto> obtenerConjuntos() {
        return this.conjuntos;
    }
}
