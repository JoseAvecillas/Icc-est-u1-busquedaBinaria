package views;

import models.Persona;

public class ShowConsole {
    
    public void showList(int[] lista){
        System.out.print("[ ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public void showResult(Integer resultado, int valorBuscado){
        if (resultado != null) {
            System.out.println("Se encontró el número: " + resultado);
        } else {
            System.out.println("No se encontró el número: " + valorBuscado);
        }
    }

    public void showPersonResulti(Persona persona, String nombreBuscado){
        if (persona != null) {
            System.out.println("Persona encontrada:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println("No se encontró a la persona con nombre: " + nombreBuscado);
        }
    }
}
