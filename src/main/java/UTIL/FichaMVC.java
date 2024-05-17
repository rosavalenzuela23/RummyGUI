package UTIL;

import interaces.FichaDTO;
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
    
    private FichaDTO ficha;
    
    public FichaMVC() {
        super();
    }
    
    public FichaMVC(FichaDTO ficha) {
        this();
        this.setText(String.valueOf(ficha.getNumero()));
        this.ficha = ficha;
    }
    
    public FichaDTO getFicha() {
        return this.ficha;
    }
}
