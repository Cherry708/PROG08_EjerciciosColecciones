import java.util.*;

public class SetHashSet {
    public static void main(String[] args) {

        /**
         * Primero, crea un HashSet que pueda contener Integers.
         * Después, añade al HashSet diez números aleatorios
         * comprendidos entre el 1 y el 100.
         * En el momento degenerarlo, muestra también el número aleatorio en la pantalla.
         * Para finalizar, muestra el contenido del HashSet en la pantalla.
         *
         * En este ejercicio pretendemos que compruebes que el HashSet no almacenará valores repetidos.
         */

        int entero;
        Random aleatorio = new Random();
        HashSet<Integer> conjuntoHashSet = new HashSet<>();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        TreeSet<Integer> conjuntoTreeSet = new TreeSet<>();

        System.out.println("Enteros: ");
        for (int contador = 0; contador<10; contador++){
            entero = aleatorio.nextInt(100)+1;
            listaNumeros.add(entero);
            System.out.print(entero+" ");
            conjuntoHashSet.add(entero);
            conjuntoTreeSet.add(entero);
        }
        System.out.println();
        System.out.println("Lista ArrayList");
        System.out.println(listaNumeros);
        System.out.println("Set HashSet");
        System.out.println(conjuntoHashSet);
        System.out.println("Set TreeSet");
        System.out.println(conjuntoTreeSet);



    }

}
