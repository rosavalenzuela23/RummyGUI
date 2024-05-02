/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEB;

import DOMINIO.Comodin;
import DOMINIO.FichaNumerica;
import DOMINIO.GrupoFicha;
import SEGREGATES.FichaSegregada;
import SEGREGATES.ISegregado;
import UTIL.FichaMVC;
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
    
    public static ProxyCliente obtenerInstancia(String hostname, int port) {
        if (ProxyCliente.instanse == null) {
            ProxyCliente.instanse = new ProxyCliente();
        }
        return ProxyCliente.instanse;
    }
    
    private void serializarDatos(ISegregado datos) {
        
    }
    
    private void serializarDatos(List<? extends ISegregado> datos) {
        this.cliente.enviarDatos(datos);
    }
    
    public void agregarSinConjunto(List<FichaMVC> fichasSeleccionadas) {
        List<FichaSegregada> fichas = new ArrayList<>();
        for (FichaMVC fichaMVC : fichasSeleccionadas) {
            FichaSegregada fichaSegregada = new FichaSegregada();
            if (fichaMVC.getFicha() instanceof Comodin) {
                fichaSegregada.setValor("*");
            }
            if (fichaMVC.getFicha() instanceof FichaNumerica fichaNumerica) {
                fichaSegregada.setValor(fichaNumerica.toString());
                fichaSegregada.setGrupoFicha(fichaNumerica.getGrupoFicha());
            }
            fichas.add(fichaSegregada);
        }
        this.serializarDatos(fichas);
    }
    
    public void notificar() {
        
    }
}
