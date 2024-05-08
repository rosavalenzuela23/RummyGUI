/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEGREGATES;

import DOMINIO.GrupoFicha;
import java.io.Serializable;

/**
 *
 * @author oscar-minjarez
 */
public class FichaSegregada implements ISegregado, Serializable {
    private String valor;
    private GrupoFicha grupoFicha;

    public FichaSegregada() {
    }

    public FichaSegregada(String valor, GrupoFicha grupoFicha) {
        this.valor = valor;
        this.grupoFicha = grupoFicha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public GrupoFicha getGrupoFicha() {
        return grupoFicha;
    }

    public void setGrupoFicha(GrupoFicha grupoFicha) {
        this.grupoFicha = grupoFicha;
    }

    @Override
    public String toString() {
        return "FichaSegregada{" + "valor=" + valor + ", ficha=" + grupoFicha + '}';
    }
}
