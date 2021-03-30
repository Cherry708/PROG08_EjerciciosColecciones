public class ControladorMonederoCaliente {
    public static void main(String[] args) throws Exception {

        MonederoCaliente monedero = new MonederoCaliente();

        try {

            monedero.añadirUsuario("Ruben");
            monedero.añadirUsuario("Cristian");
            monedero.añadirUsuario("Jorge");
            //monedero.añadirUsuario("Ruben");
            System.out.println(monedero.mostrarUsuario("Ruben"));
            System.out.println(monedero.mostrarTodo());
            monedero.borrarTodo();
            System.out.println("Se ha borrado");
            System.out.println();
            System.out.println(monedero.mostrarTodo());
            System.out.println("Se ha mostrado");
            System.out.println();
            monedero.añadirUsuario("Raúl");
            System.out.println("Se ha añadido");
            System.out.println();
            System.out.println(monedero.mostrarTodo());
            System.out.println("Se ha vuelto a mostrar");

        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
