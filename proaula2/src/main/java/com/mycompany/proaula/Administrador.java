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
public class Administrador {
 

/**
 *
 * @author Araque
 */
String op;
String nombre;
String apellido;
int edad;

public  void obtenerimformacion2(){
    nombre = JOptionPane.showInputDialog("digite nombre del local que quiera registrar:");
      String op = JOptionPane.showInputDialog("selecione la seccion de la cualquiere informaccion: \n"
                + " 1.-ropa y calzado\n"
                + " 2.-entretenimiento\n"
                + " 3.-restaurantes\n"); 
        
     if(op.equalsIgnoreCase("1")){
       JOptionPane.showMessageDialog(null, "en la seccion ropa y calzado se encuentran variedades"
               + "de tennis y sudaderas a un buen precio : ");
     }else if(op.equalsIgnoreCase("2")){
       JOptionPane.showMessageDialog(null, "en la seccion de entretenimiento se encuentra un cine con las mejores peliculas "
               + "del año y muchos estrenos : ");
     }else if(op.equalsIgnoreCase("3")){
       JOptionPane.showMessageDialog(null, "en la seccion  de restaurantes encuentran las mejores comidas del pais"
               + "y a un muy buen precio : ");
     }else {
            JOptionPane.showMessageDialog(null, "opcion no valida");
     }  
       Integer  almighty = Integer.parseInt(JOptionPane.showInputDialog("digite la puntuacion"));      
            
   JOptionPane.showMessageDialog(null,"el local registrado fue "+nombre);
   JOptionPane.showMessageDialog(null,"la seccion que escogio fue "+op);
   JOptionPane.showMessageDialog(null,"la puntuacion que hizo fue "+almighty);

}}