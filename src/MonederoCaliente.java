import java.util.*;
public class MonederoCaliente {

    /**
     * Crea una clase MonederoCaliente,
     * que almacenará las claves secretas de usuarios con cryptomonedas. La
     * clase tendrá los siguientes métodos:
     *
     * añadirUsuario (String identificador) - añade una nueva entrada en el HashMap
     * que contenga el identificador único de un nuevo usuario
     * que recibe como parámetro y una clave que se generará de forma automática.
     *
     * mostrarUsuario (String identificador) – muestra la clave del usuario
     * que recibe como parámetro.
     *
     * mostrarTodo() - muestra los identificadores y el número de usuarios
     * que existen en el monedero.
     *
     * borrarTodo() - elimina toda la información almacenada en la clase.
     *
     * Lanza la excepción adecuada en el método mostrarUsuario,
     * en el caso de que el usuario no exista.
     * Y también lanzará una excepción en el método añadirUsuario,
     * en el caso de que el usuario ya exista.
     *
     * Crea una clase ControladorMonederoCaliente,
     * que te permita comprobar el funcionamiento de la clase.
     *
     */


    //Atributos
    private HashMap<String, String> diccionario;

    //Métodos
    /**
     * Método constructor de la clase que no toma
     * níngún parámetro de entrada pero inicializa el HashMap.
     */
    public void monederoCaliente(){
        diccionario = new HashMap<>();
    }

    /**
     * Introduce una clave y valor en el diccionario con la clave
     * suministrada como parametro de entrada.
     * @param identificador es la clave del diccionario y hace referencia al nombre del usuario.
     * @throws Exception lanza una excepción en caso de que el usuario ya haya sido introducido.
     */
    public void añadirUsuario(String identificador) throws Exception {
        if (diccionario.containsKey(identificador)){
            throw new Exception("El usuario ya ha sido introducido.");
        }
        int entero;
        Random aleatorio = new Random();
        entero = aleatorio.nextInt(100)+1;
        diccionario.put(identificador, String.valueOf(entero));
    }

    /**
     * Muestra la clave que le corresponde al usuario
     * @param identificador parametro de entrada que hace referencia al usuario
     * @return devuelve la clave del usuario al que se ha hecho refencia con el identificador
     */
    public String mostrarUsuario(String identificador) throws Exception{
        if (!diccionario.containsKey(identificador)){
            throw new Exception("El usuario no existe.");
        }
        return "La clave del usuario "+ identificador + " es: "+diccionario.get(identificador);
    }

    /**
     * Muestra por pantalla el identificador y el número de usuarios
     * Asigna a un array el conjunto de claves del hashmap. El diccionario
     * devuelve un set y ese set se convierte en array para luego convertir
     * el array en un String.
     * @return delvuelve una String con la lista y cantidad de usuarios.
     */
    public String mostrarTodo(){
        Object[] contenido;
        contenido = diccionario.keySet().toArray();

        return "Usuarios: "+Arrays.toString(contenido)+" " +
                "\nNúmero de usuarios: "+diccionario.size();
    }

    /**
     * Elimina los elementos del HashMap
     */
    public void borrarTodo(){
        diccionario.clear();
    }
}
