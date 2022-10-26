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
public class Cliente {
    
    public void obtenerInformacio(){
     int entero;
        int opcion = 0;
        int letra;
        String op = "";
        op = JOptionPane.showInputDialog("que seccion desea ver : \n"
                + " 1.-ropa y calzado\n"
                + " 2.-entretenimiento\n"
                + " 3.-restaurantes\n");

        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 ->
                JOptionPane.showMessageDialog(null, "\"seccion 1: los locales de ropa y calzado son "
                        + "abiertos desde las 6 am y son cerrados \"\n"
                        + "alas 9 pm:");
            case 2 ->
                JOptionPane.showMessageDialog(null, "seccion 2: los locales de entretenimiento son"
                        + "abiertos alas 7 am y son cerrados "
                        + "alas 10 pm:");
            case 3 ->
                JOptionPane.showMessageDialog(null, "seccion 3: los locales de restaurantes son abiertos"
                        + "alas 9 am y son cerrados "
                        + "alas 11 pm");
            default ->
                System.out.print("Opcion Incorrecta");
        }

        op = JOptionPane.showInputDialog("selecionar que almacen le gustaria conocer su puntuacion : \n"
                + " 1.-ropa y calzado\n"
                + " 2.-entretenimiento\n"
                + " 3.-restaurantes\n");

        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 -> JOptionPane.showMessageDialog(null, "el puntaje de : "+almacenes(opcion)+" es 4");
            case 2 -> JOptionPane.showMessageDialog(null, "el puntaje de : "+almacenes(opcion)+" es 5");
            case 3 -> JOptionPane.showMessageDialog(null, "el puntaje de : "+almacenes(opcion)+" es 2");
            default -> System.out.print("Opcion Incorrecta");
            
        }
    }


    
    
    public  String almacenes(int opcion) {
        if (opcion == 1) {
            return "ropa y calzado";
        }
        if (opcion == 2) {
            return "entretenimiento";
        }
        if (opcion == 3) {
            return "restaurantes";
        }
        return "Opcion incorrecta";
    }

}





















