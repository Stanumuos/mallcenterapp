/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proaula;
import javax.swing.JOptionPane;

public class Proaula  {
    
    public static void main(String[] args) {
        int opcion=0; int op=0;
        op = Integer.parseInt(JOptionPane.showInputDialog("***SELECCIONA UNA OPCION*** " + "\n 1. Administrador." + "\n 2. Operador." + "\n 3. Cliente."));
       
       switch (op){
           case 1:JOptionPane.showMessageDialog(null,"Caso1");
           Administrador almighty = new Administrador();
          almighty.obtenerimformacion2();
           break;
           case 2:JOptionPane.showMessageDialog(null,"Caso2");
           Operador anuel = new Operador ();
           anuel.obtenerinformacion3();
           break;
           
           case 3:
               //JOptionPane.showMessageDialog(null,"caso3");
           Cliente diego = new Cliente();
           diego.obtenerInformacio();
           break;
           
           default:
               JOptionPane.showMessageDialog(null, "Dato incorrecto");
       }
       
    }
}