/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLERS;

import java.util.List;

import GUI.PartidaView;
import MODELS.PartidaModel;
import UTIL.ConjuntoMVC;
import exceptions.DominioException;
import interaces.FichaDTO;

/**
 *
 * @author marco
 */
public class PantallaPartidaController {

    private static PantallaPartidaController instancia;

    private final PartidaModel pm;
    private final PartidaView pv;

    public static PantallaPartidaController obtenerInstancia() {
        if (PantallaPartidaController.instancia == null) {
            PantallaPartidaController.instancia = new PantallaPartidaController();
        }
        return PantallaPartidaController.instancia;
    }

    private PantallaPartidaController() {

        this.pm = PartidaModel.obtenerInstancia();
        this.pv = PartidaView.obtenerInstancia();

    }

    public void mostrarPantallaPartida() {
        pv.setVisible(true);
    }

    public void agregarConConjunto(List<FichaDTO> fichasSeleccionadas, ConjuntoMVC conjuntoModificado, ConjuntoMVC.PosicionEnum posicion) {
        pm.agregarConConjunto(fichasSeleccionadas, conjuntoModificado, posicion);
    }

    public void validarFichasExistentesPozo() throws DominioException {
        pm.validarFichasExistentesPozo();
    }

    public void realizarMovimientoDividir() {

    }

    public void agregarSinConjunto(List<FichaDTO> fichasSeleccionadas) {
        pm.agregarSinConjunto(fichasSeleccionadas);
    }

    public void realizarMovimientoDividir(List<FichaDTO> fichasSeleccionadas, ConjuntoMVC conjuntoSeleccionado) {
        pm.realizarMovimientoDividir(fichasSeleccionadas, conjuntoSeleccionado);
    }
}
