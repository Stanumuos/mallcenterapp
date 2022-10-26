/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proaula;

import javax.swing.JOptionPane;

/**
 *
 * @author Araque
 */
public class Operador {

public  void obtenerinformacion3(){
   
        String op = JOptionPane.showInputDialog("selecione a que seccion del almacen quiere darle una puntuacion: \n"
                + " 1.-ropa y calzado\n"
                + " 2.-entretenimiento\n"
                + " 3.-restaurantes\n");
        
     Integer  puntuacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la puntuación"));
        
     if(op.equalsIgnoreCase("1")){
       JOptionPane.showMessageDialog(null, "la Puntuación para el almacen ropa y calzado es : "+puntuacion);
     }else if(op.equalsIgnoreCase("2")){
       JOptionPane.showMessageDialog(null, "la Puntuación para el almacen de entretenimiento es : "+puntuacion);
     }else if(op.equalsIgnoreCase("3")){
       JOptionPane.showMessageDialog(null, "la Puntuación para el almacen de restauranteses : "+puntuacion);
     }else {
            JOptionPane.showMessageDialog(null, "opcion no valida");

     }
   
}
            
            



}