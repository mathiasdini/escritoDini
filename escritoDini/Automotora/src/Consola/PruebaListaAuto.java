package Consola;

import Logica.*;
import Logica.ListaAutos;

public class PruebaListaAuto {

    public static void main(String[] args) {
        
        ListaAutos listado = new ListaAutos();

        
        Auto auto1 = new Auto(1500, "ABC123", "Toyota", 25060.8);
        Auto auto2 = new Auto(2000, "XYZ789", "Renault", 30545.9);

        listado.agregar(auto1);
        listado.agregar(auto2);

        
        System.out.println("Listado de autos:");
        listado.listarAutos();
         listado.toString();
       System.out.println(listado.toString());
        listado.borrar(auto2);
       listado.toString();
        
        System.out.println("Listado de autos para borrar:");
        listado.listarAutos();

        
        String matriculaBuscada = "ABC123";
        Auto autoEncontrado = listado.obtenerXMatricula(matriculaBuscada);

        if (autoEncontrado != null) {
            System.out.println("Matrícula " + matriculaBuscada + ":");
            System.out.println(autoEncontrado.toString());
        } else {
            System.out.println("No se encontró un auto con matrícula " + matriculaBuscada);
        }
    }
}

