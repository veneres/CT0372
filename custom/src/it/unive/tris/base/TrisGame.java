package it.unive.tris.base;

import javax.swing.JOptionPane;

public class TrisGame implements TrisDisplayListener{
    
    public enum Symbols { EMPTY, CROSS, CIRCLE };
    
    private TrisDisplayComponent display;

    public void cellClicked(int x, int y) 
    {
        // ESEMPIO DI REAZIONE        
        JOptionPane.showMessageDialog(display, "Clicked at "+x+","+y);
        
        // IL VOSTRO CODICE DI GESTIONE INIZIA QUI !!!!!!!
        
    }
    
    public TrisGame(TrisDisplayComponent display)
    {
        this.display = display;
        display.addListener(this);
    }
}
