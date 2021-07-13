/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionfacil;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class SolucionFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner in = new Scanner(System.in);
        
        
        double Porcentaje, Ganancia;
        Porcentaje= 0.75;
        System.out.println("====Venta de loteria de animalitos=== ");
        System.out.println("====Ingrese venta del mes=== ");
        int strVentaMes = in.nextInt();
         
         Ganancia=strVentaMes*Porcentaje;
         System.out.println("Su ganacia es: "+Ganancia);
         
         
    }
    
    
    
 
       
         
    
    
 
    
}
