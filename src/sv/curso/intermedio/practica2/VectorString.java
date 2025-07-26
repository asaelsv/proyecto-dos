/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica2;

import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 * <><><><><><>
 * @author LENOVO
 */
public class VectorString {

    public static void main(String[] args) {
        Vector<String> nombres = new Vector<String>();

        String cadena = JOptionPane.showInputDialog("Digite tres nombres(,)");

        StringTokenizer tokens = new StringTokenizer(cadena, ",");
        int posicion = 0;
        while (tokens.hasMoreTokens()) {
            nombres.add(tokens.nextToken().trim());

        }
imprimirVector(nombres);
    }

    public static void imprimirVector(Vector<String> nombres) {
        Collections.sort(nombres);
        Iterator it = nombres.iterator();
        while (it.hasNext()) {
            System.out.println("Nombre:  " + (String) it.next());
        }

    }
}
