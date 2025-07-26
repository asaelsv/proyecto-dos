/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica2;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ArregloString {
    public static void main(String[] args) {
        String[] nombres = new String [3];
        
        String cadena =  JOptionPane.showInputDialog("Digite tres nombres separados por coma (,)");
        StringTokenizer tokens=new StringTokenizer(cadena,"," );
        int posicion = 0;
        while(tokens.hasMoreTokens()) {
            nombres[posicion]=tokens.nextToken().trim();
            posicion++;
        
            
        }
        imprimirArreglo(nombres);        
    }
    public static void imprimirArreglo(String []nombres){
        for(int i =0; i <nombres.length;i++){
            System.out.println("Nombres:  " + nombres[i]);
        }
    }

    
}
