package UTIL;

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
    
    private int number;
    
    public FichaMVC() {
        super();
    }
    
    public FichaMVC(int number) {
        this();
        this.setText(Integer.toString(number));
        this.number = number;
    }
    
    public int getNumber() {
        return this.number;
    }
    
}
