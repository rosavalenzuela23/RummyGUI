/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arqui.rummygui;

import CONTROLLERS.PantallaPartidaController;
import WEB.Cliente;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author rosafresita
 */
public class RummyGUI {

    public static void main(String[] args) {

          Cliente cliente = Cliente.obtenerInstancia();
        try {
            cliente.setSocket(new Socket("localhost", 9000)); // Esto conecta el cliente al servidor
           
        } catch (IOException e) {
            System.out.println("Error al conectar al servidor o enviar datos: " + e.getMessage());
        }
        PantallaPartidaController.obtenerInstancia().mostrarPantallaPartida();
        
    }
}
