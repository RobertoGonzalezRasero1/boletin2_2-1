/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import javax.swing.JOptionPane;

/**
 *
 * @author bvelosofioretti
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       float lado;
       
        float area;
       
        lado = Float.parseFloat(JOptionPane.showInputDialog("lado"));
       
       area=lado*lado;
       
       JOptionPane.showMessageDialog(null,"area =" + area);
    
    }
    
}
