/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEB;

import SEGREGATES.ISegregado;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author oscar-minjarez
 */
public class Cliente {
    private static Cliente instance;
    private Socket socket;
    
    private Cliente() {

    }
    
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    
    public static Cliente obtenerInstancia() {
        if (Cliente.instance == null) {
            Cliente.instance = new Cliente();
        }
        return Cliente.instance;
    }
    
    public void enviarDatos() {
        
    }
    
    public void enviarDatos(List<? extends ISegregado> datos) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(this.socket.getOutputStream());
            outputStream.writeObject(datos);
            outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
