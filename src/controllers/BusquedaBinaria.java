package controllers;

public class BusquedaBinaria {
    

    public Integer busquedaBinaria(int [] numeros, int valor){
        int izquierda = 0;
        int derecha= numeros.length - 1;

        while (izquierda<=derecha) {
            int medio= izquierda + (derecha - izquierda) / 2;

            if (numeros[medio] == valor) {
                return valor;
            }
            if (numeros[medio] < valor) {
                izquierda = medio +1;
            }else{
                derecha = medio -1;
            }
        }
        return null;
    }

    public void bubbleSortPorEdad(int[] people) {
        boolean swapped;
        for (int i = 0; i < people.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j] > people[j + 1]) {
                    int temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
