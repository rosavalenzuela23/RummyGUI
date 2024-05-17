/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.arqui.rummygui;

import CONTROLLERS.PantallaPartidaController;

/**
 *
 * @author rosafresita
 */
public class RummyGUI {

    public static void main(String[] args) {

        PantallaPartidaController.obtenerInstancia().mostrarPantallaPartida();

//        Cliente cliente = Cliente.obtenerInstancia();
//        try {
//
//            
//
//            cliente.setSocket(new Socket(ip, port));
//            // Esto conecta el cliente al servidor
//
//            Datos d = new Datos();
//            d.setMensaje("terminar turno");
//
//            ProxyCliente.obtenerInstancia().terminarTurno(d);
//
//        } catch (IOException e) {
//            System.out.println("Error al conectar al servidor o enviar datos: " + e.getMessage());
//        }
//        PantallaPartidaController.obtenerInstancia().mostrarPantallaPartida();
    }
}
