/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author natsu
 */
public class Propiedades {

    private static Propiedades instancia;

    private final Properties properties;

    private Propiedades() throws IOException {

        properties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        InputStream stream = loader.getResourceAsStream("textos.properties");

        properties.load(stream);
    }

    private static Propiedades obtenerInstancia() throws IOException {

        if (Propiedades.instancia == null) {
            Propiedades.instancia = new Propiedades();
        }

        return Propiedades.instancia;
    }

    public static Object obtenerPropiedad(String key) {
        try {
            return Propiedades
                    .obtenerInstancia().properties
                    .get(key);
        } catch (Exception e) {
            return null;
        }
    }

}
