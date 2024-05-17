package MODELS;

import DOMINIO.Conjunto;
import DOMINIO.ConjuntoGrupo;
import DOMINIO.Ficha;
import DOMINIO.FichaNumerica;
import DOMINIO.GrupoFicha;
import DOMINIO.Jugador;
import DOMINIO.Mazo;
import DOMINIO.Partida;
import DOMINIO.PartidaDTOClazz;
import DOMINIO.Pila;
import DOMINIO.Tablero;
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

        Datos d = new Datos();
        d.setDatos(fichas);
        d.setMensaje("Agregar sin conjunto");

        ProxyCliente.obtenerInstancia().agregarFichaAMazo(d);

    }

    public void agregarConConjunto(List<FichaDTO> fichas, ConjuntoDTO conjunto, boolean adelante) {

    }

    public void realizarMovimientoDividir(ConjuntoDTO conjunto, int[] periodo) {

    }

    public void setSub(SuscriptorPartida sub) {
        this.sub = sub;
    }

    public void cargarDatos() {
        PartidaDTOClazz partida = new PartidaDTOClazz(Partida.obtenerInstancia());
        partida.tablero = Tablero.obtenerInstancia();
        partida.pila = Pila.obtenerInstancia();

        List<Jugador> jugadores = new ArrayList();

        Jugador j = new Jugador();
        jugadores.add(j);
        j.setMazo(new Mazo());
        partida.setJugadores(jugadores);

        Mazo mazoJugador1 = partida.jugadores.get(0).getMazo();

        FichaNumerica fn1 = new FichaNumerica((byte) 13);
        fn1.setGrupoFicha(GrupoFicha.ROJO);
        FichaNumerica fn2 = new FichaNumerica((byte) 14);
        fn2.setGrupoFicha(GrupoFicha.ROJO);
        FichaNumerica fn3 = new FichaNumerica((byte) 15);
        fn3.setGrupoFicha(GrupoFicha.ROJO);
        FichaNumerica fn4 = new FichaNumerica((byte) 16);
        fn4.setGrupoFicha(GrupoFicha.ROJO);
        FichaNumerica fn5 = new FichaNumerica((byte) 17);
        fn5.setGrupoFicha(GrupoFicha.ROJO);
        FichaNumerica fn6 = new FichaNumerica((byte) 18);
        fn6.setGrupoFicha(GrupoFicha.ROJO);

        mazoJugador1.agregarFichaAMazo(fn1);
        mazoJugador1.agregarFichaAMazo(fn2);
        mazoJugador1.agregarFichaAMazo(fn3);
        mazoJugador1.agregarFichaAMazo(fn4);
        mazoJugador1.agregarFichaAMazo(fn5);
        mazoJugador1.agregarFichaAMazo(fn6);

        FichaNumerica fichanumerica1 = new FichaNumerica();
        fichanumerica1.setNumero((byte) 10);
        FichaNumerica fichanumerica2 = new FichaNumerica();
        fichanumerica2.setNumero((byte) 11);
        FichaNumerica fichanumerica3 = new FichaNumerica();
        fichanumerica3.setNumero((byte) 12);

        List<Ficha> fichas = new ArrayList<>();

        fichas.add(fichanumerica1);
        fichas.add(fichanumerica2);
        fichas.add(fichanumerica3);

        //Tablero y conjuntos agregados al tablero
        Conjunto conjuntoPrueba = new ConjuntoGrupo();
        conjuntoPrueba.setFichas(fichas);
        List<Conjunto> listaConjuntos = new ArrayList<>();
        listaConjuntos.add(conjuntoPrueba);
        partida.tablero.setConjuntos(listaConjuntos);

        sub.notificar(partida);
    }

    public void terminarTurno() {
        Datos datos = new Datos(null, "terminar turno");

        ProxyCliente.obtenerInstancia().terminarTurno(datos);
    }

    public void agregarFichaAMazo() {
        Datos datos = new Datos(null, "agregar ficha a mazo");
        ProxyCliente.obtenerInstancia().agregarFichaAMazo(datos);
    }

    public void mostrarPantall() {

        sub.mostrarPantalla();
    }

}
