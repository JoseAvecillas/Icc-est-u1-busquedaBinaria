import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB= new BusquedaBinaria();
        PersonaController pC = new PersonaController();
        int[] arr = new int[] {10, 2, 4, 6, 7, 8, 13, 20};




        System.out.println("Lista original:");
        sC.showList(arr);
        bB.bubbleSortPorEdad(arr);
        System.out.println("Lista ordenada:");
        sC.showList(arr);
        System.out.println("Busqueda binaria:");
        int resultado = bB.busquedaBinaria(arr, 10);
        sC.showResult(resultado, resultado);
        System.out.println("--------------------------------");
        // buscar persona

        Persona[] personas = new Persona[]{
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Luis", 28),
            new Persona("Carmen", 22),
            new Persona("Maria", 27),
            new Persona("Sofia", 24),

        };
        String personabuscada = "Ana";
        pC.sortbyname(personas);
        Persona encontrada = pC.findByName(personas, personabuscada);
        sC.showPersonResulti(encontrada, personabuscada);

    }
}
