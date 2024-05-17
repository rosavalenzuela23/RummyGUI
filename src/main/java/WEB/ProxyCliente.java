/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEB;

import arqui.util.Datos;

/**
 *
 * @author oscar
 */
public class ProxyCliente {

    private static ProxyCliente instancia;
    private Cliente cliente;

    private ProxyCliente() {
        this.cliente = Cliente.obtenerInstancia();
        this.cliente.start();
    }

    public static ProxyCliente obtenerInstancia() {
        if (ProxyCliente.instancia == null) {
            ProxyCliente.instancia = new ProxyCliente();
        }
        return ProxyCliente.instancia;
    }

    public void agregarSinConjunto(Datos<?> datos) {
        Cliente.obtenerInstancia().enviarDatos(datos);
    }

    public void terminarTurno(Datos<?> datos) {
        Cliente.obtenerInstancia().enviarDatos(datos);
    }
    
    public void agregarFichaAMazo(Datos<?> datos){
        this.cliente.enviarDatos(datos);
    }

    public void notificar() {

    }
}
