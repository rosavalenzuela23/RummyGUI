/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import DOMINIO.Conjunto;
import java.util.List;

/**
 *
 * @author natsu
 */
public abstract class MovimientoMVC implements Command{
    
    Conjunto conjuntoBackUp;
    List<Conjunto> conjuntos;
    
    public void verificaColoresConjunto() {
        
    }

    @Override
    public abstract void execute();

    /**
     *
     */
    @Override
    public abstract void deshacerMovimiento();
    
    /**
     * Método que valida si se realizaron movimientos
     * @return true, en caso de si haberse realizado movimientos, false caso contrario
     */
    public boolean verificarMovimientosRealizados(){
        if(conjuntos.isEmpty()){
            return false;
        }
        
        return true;
    }
    
    /**
     * Método que si los conjuntos dentro del movimiento son validos
     */
    public void validarMovimiento(){
        for (Conjunto conjunto : conjuntos) {
            conjunto.validarConjunto();
        }
    }
    
}
