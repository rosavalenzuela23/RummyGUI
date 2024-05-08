/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEGREGATES;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar-minjarez
 */
public class ConjuntoSegregado implements Serializable, ISegregado {
    private List<FichaSegregada> fichasSegregadas;

    public ConjuntoSegregado() {
        this.fichasSegregadas = new ArrayList<>();
    }

    public ConjuntoSegregado(List<FichaSegregada> fichasSegregadas) {
        this.fichasSegregadas = fichasSegregadas;
    }

    public List<FichaSegregada> getFichasSegregadas() {
        return fichasSegregadas;
    }

    public void setFichasSegregadas(List<FichaSegregada> fichasSegregadas) {
        this.fichasSegregadas = fichasSegregadas;
    }

    @Override
    public String toString() {
        return "ConjuntoSegregado{" + "fichasSegregadas=" + fichasSegregadas + '}';
    }
}
