package UTIL;

import DOMINIO.Ficha;
import javax.swing.JToggleButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natsu
 */
public class FichaMVC extends JToggleButton {
    
    private Ficha ficha;
    
    public FichaMVC() {
        super();
    }
    
    public FichaMVC(Ficha ficha) {
        this();
        // this.setText(Integer.toString(number));
        this.ficha = ficha;
    }
    
    public Ficha getFicha() {
        return this.ficha;
    }
}
