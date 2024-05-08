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
    private ObjectOutputStream outputStream;
    
    private Cliente() {

    }
    
    public void setSocket(Socket socket) {
        this.socket = socket;
        try {
            this.outputStream = new ObjectOutputStream(this.socket.getOutputStream());
        } catch (IOException e) {
            System.out.println("Error al obtener el outputStream: " + e.getMessage());
        }
    }
    
    public static Cliente obtenerInstancia() {
        if (Cliente.instance == null) {
            Cliente.instance = new Cliente();
        }
        return Cliente.instance;
    }
    
    public void enviarDatos(ISegregado datos) {
        try {
            this.outputStream.writeObject(datos);
            this.outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void enviarDatos(List<? extends ISegregado> datos) {
        try {
            this.outputStream.writeObject(datos);
            this.outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void enviarDatos(ISegregado datos, List<? extends ISegregado> masDatos) {
        try {
            this.outputStream.writeObject(datos);
            this.outputStream.writeObject(masDatos);
            this.outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
