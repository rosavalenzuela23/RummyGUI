/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import java.util.List;

/**
 *
 * @author marco
 */
public class TurnoMVC {
    
    List<MovimientoMVC> movimientos;
    
    public void deshacerMovimientos(){
        
        for (MovimientoMVC movimiento : movimientos) {
            movimiento.execute();
        }
        
    }
    
    /**
     * Método que valida si se realizaron movimientos
     */
    public void verificarMovimientosRealizados(){
           
    }
}
