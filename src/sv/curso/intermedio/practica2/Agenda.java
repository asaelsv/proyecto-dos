/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica2;

import java.util.*;


/**
 *
 * @author LENOVO
 */



class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public Agenda() {
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        if (!contactos.containsKey(telefono)) {
            contactos.put(telefono, new Contacto(nombre, telefono));
            System.out.println("Contacto agregado.");
        } else {
            System.out.println("El contacto ya existe.");
        }
    }

    public void consultarContacto(String telefono) {
        Contacto contacto = contactos.get(telefono);
        if (contacto != null) {
            System.out.println(contacto);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void modificarContacto(String telefono, String nuevoNombre) {
        Contacto contacto = contactos.get(telefono);
        if (contacto != null) {
            contacto.setNombre(nuevoNombre);
            System.out.println("Contacto modificado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void eliminarContacto(String telefono) {
        if (contactos.remove(telefono) != null) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Agenda ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Consultar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el telefono: ");
                    String telefono = scanner.nextLine();
                    agenda.agregarContacto(nombre, telefono);
                    break;
                case 2:
                    System.out.print("Ingrese el telefono del contacto a consultar: ");
                    telefono = scanner.nextLine();
                    agenda.consultarContacto(telefono);
                    break;
                case 3:
                    System.out.print("Ingrese el telefono del contacto a modificar: ");
                    telefono = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    agenda.modificarContacto(telefono, nuevoNombre);
                    break;
                case 4:
                    System.out.print("Ingrese el telefono del contacto a eliminar: ");
                    telefono = scanner.nextLine();
                    agenda.eliminarContacto(telefono);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}    

