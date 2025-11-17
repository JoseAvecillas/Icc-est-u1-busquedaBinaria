package controllers;

import models.Persona;

public class PersonaController {
    
    public void sortbyname(Persona[] personas){
        boolean swapped;
        for (int i = 0; i < personas.length- 1; i++) {
            swapped = false;
            for (int j = 0; j < personas.length -1 - i; j++) {
                if (personas[j].getNombre().compareTo(personas[j+1].getNombre()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


    public Persona findByName(Persona[] personas, String nombre){
        int izquierda= 0 ;
        int derecha = personas.length -1 ;
        while (izquierda <= derecha) {
            int medio= izquierda + (derecha - izquierda) / 2;
            if (personas[medio].getNombre().compareTo(nombre) == 0) {
                return personas[medio];
            }
            if (personas[medio].getNombre().compareTo(nombre) < 0) {
                izquierda = medio +1;
            }else {
                derecha = medio -1;
            }
        }
        return null;
    }

    public Integer bynarySearchByName(Persona[] personas, String targetname ){
        int left = 0;
        int right = personas.length - 1 ;
        while (left < right) {
            int mid = left + (right - left) /2;
            int comparison  = personas[mid].getNombre().compareTo(targetname);

            if (comparison==0) {
                return mid;
            } else if (comparison < 0) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
        return null;
    }
}
