/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEB;

import DOMINIO.Comodin;
import DOMINIO.FichaNumerica;
import SEGREGATES.ConjuntoSegregado;
import SEGREGATES.FichaSegregada;
import SEGREGATES.ISegregado;
import UTIL.ConjuntoMVC;
import UTIL.FichaMVC;
import arqui.util.Datos;
import interaces.FichaDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar
 */
public class ProxyCliente {

    private static ProxyCliente instanse;
    private Cliente cliente;

    private ProxyCliente() {
        this.cliente = Cliente.obtenerInstancia();
    }

    public static ProxyCliente obtenerInstancia() {
        if (ProxyCliente.instanse == null) {
            ProxyCliente.instanse = new ProxyCliente();
        }
        return ProxyCliente.instanse;
    }

    private void serializarDatos(ISegregado datos) {
        this.cliente.enviarDatos(datos);
    }

    private void serializarDatos(List datos) {
        this.cliente.enviarDatos((ISegregado) datos);
//        this.cliente.enviarDatos(datos);
    }

    private void serializarDatos(Datos datos, List masDatos) {
        this.cliente.enviarDatos(datos, masDatos);
    }

    public void agregarSinConjunto(List<FichaDTO> fichasSeleccionadas) {
        Datos d = new Datos();
        d.setDatos(d);
        this.serializarDatos(fichasSeleccionadas);
    }

    public void agregarConConjunto(List<FichaDTO> fichasSeleccionadas, ConjuntoMVC conjuntoModificado, ConjuntoMVC.PosicionEnum posicion) {
        List<FichaSegregada> fichasSegregadasConjunto = this.segregarFichasMVC(conjuntoModificado.getFichas());
//        List<FichaSegregada> fichasSegregadasSeleccionadas = this.segregarFichasMVC(fichasSeleccionadas);
//        ConjuntoSegregado conjuntoSegregado = new ConjuntoSegregado(this.juntarFichas(fichasSegregadasConjunto, fichasSegregadasSeleccionadas, posicion));
        ConjuntoSegregado conjuntoSegregado = new ConjuntoSegregado(fichasSegregadasConjunto);
//        this.serializarDatos(conjuntoSegregado, fichasSegregadasSeleccionadas);
    }

    private List<FichaSegregada> segregarFichasMVC(List<FichaMVC> fichasMVC) {
        List<FichaSegregada> fichasSegregadas = new ArrayList<>();
        for (FichaMVC fichaMVC : fichasMVC) {
            FichaSegregada fichaSegregada = new FichaSegregada();
            if (fichaMVC.getFicha() instanceof Comodin) {
                fichaSegregada.setValor("*");
            }
            if (fichaMVC.getFicha() instanceof FichaNumerica fichaNumerica) {
                fichaSegregada.setValor(fichaNumerica.toString());
                fichaSegregada.setGrupoFicha(fichaNumerica.getGrupoFicha());
            }
            fichasSegregadas.add(fichaSegregada);
        }
        return fichasSegregadas;
    }

    public void notificar() {

    }
}
