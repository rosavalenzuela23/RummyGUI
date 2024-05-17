/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEB;

import DOMINIO.PartidaDTOClazz;
import UTIL.Propiedades;
import arqui.util.Datos;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author
 */
public class Cliente extends Thread {

    private static Cliente instance;
    private Socket socket;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    private Cliente() {

        String ip = (String) Propiedades.obtenerPropiedad("IP_SERVIDOR");
        int port = Integer.parseInt((String) Propiedades.obtenerPropiedad("PUERTO_SERVIDOR"));

        try {
            this.socket = new Socket(ip, port);

            this.setSocket(socket);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void run() {

        while (true) {
            System.out.println("Escuchando cliente");

            try {
                Object c = this.inputStream.readObject();

                PartidaDTOClazz obj = (PartidaDTOClazz) c;

                ProxyCliente.obtenerInstancia().notificar(obj);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Error cliente socket");

            }

        }

    }

    public void setSocket(Socket socket) {
        this.socket = socket;
        try {
            this.outputStream = new ObjectOutputStream(this.socket.getOutputStream());
            this.inputStream = new ObjectInputStream(this.socket.getInputStream());
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

    public void enviarDatos(Datos<?> datos) {
        try {
            this.outputStream.writeObject(datos);
            this.outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
