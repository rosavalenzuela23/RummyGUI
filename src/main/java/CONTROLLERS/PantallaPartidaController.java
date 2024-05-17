/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLERS;

import java.util.List;

import GUI.PartidaView;
import MODELS.PartidaModel;
import exceptions.DominioException;
import interaces.ConjuntoDTO;
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
        this.pm.setSub(pv);
        this.pm.mostrarPantall();
        //this.pm.mostrarPantalla();
    }

    public void agregarFichaAMazo() {
        pm.agregarFichaAMazo();
    }

    public void validarFichasExistentesPozo() throws DominioException {

    }

    public void realizarMovimientoDividir(ConjuntoDTO conjunto, int[] periodo) {
        PartidaModel
                .obtenerInstancia()
                .realizarMovimientoDividir(conjunto, periodo);

    }

    public void agregarSinConjunto(List<FichaDTO> fichas) {
        PartidaModel
                .obtenerInstancia()
                .agregarSinConjunto(fichas);

    }

    public void agregarConConjunto(
            List<FichaDTO> fichas,
            ConjuntoDTO conjunto,
            boolean delante) {
        PartidaModel
                .obtenerInstancia()
                .agregarConConjunto(fichas, conjunto, delante);
    }

    public void crearDatos() {
        PartidaModel
                .obtenerInstancia()
                .cargarDatos();
    }

    public void terminarTurno() {
        pm.terminarTurno();
    }

}
