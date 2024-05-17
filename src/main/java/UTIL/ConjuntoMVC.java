/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import interaces.ConjuntoDTO;
import java.awt.Color;
import java.util.List;

import javax.swing.JCheckBox;

/**
 *
 * @author natsu
 */
public class ConjuntoMVC extends DraggablePanel {

    private ConjuntoDTO conjunto;
    private List<FichaMVC> fichas;

    private JCheckBox checkBox;

    public ConjuntoMVC() {
        super();
        this.setSize(50, 80);
        this.setBackground(Color.red);
        checkBox = new JCheckBox();
        checkBox.setSize(20, 20);
        this.add(checkBox);
    }

    public boolean isSelected() {
        return this.checkBox.isSelected();
    }

    //Metodo grafico ignorar
    private void actualizarConjunto() {
        fichas.forEach((ficha) -> {
            this.add(ficha);
            this.setSize(this.getWidth() + 60, this.getHeight());
        });

    }

    public ConjuntoMVC(List<FichaMVC> fichas) {
        this();
        this.fichas = fichas;
        actualizarConjunto();
    }

    public void agregarFicha(FichaMVC ficha, PosicionEnum pos) {
        if (pos == PosicionEnum.ADELANTE) {
//            fichas.addFirst(ficha);
        } else if (pos == PosicionEnum.DETRAS) {
//            fichas.addLast(ficha);
        }
    }

    public enum PosicionEnum {
        ADELANTE,
        DETRAS
    }

    public ConjuntoDTO getConjunto() {
        return conjunto;
    }

    public void setConjunto(ConjuntoDTO conjunto) {
        this.conjunto = conjunto;
    }

    public List<FichaMVC> getFichas() {
        return fichas;
    }

    public void setFichas(List<FichaMVC> fichas) {
        this.fichas = fichas;
        actualizarConjunto();
    }
}
