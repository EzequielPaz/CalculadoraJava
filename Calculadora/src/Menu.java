import javax.swing.*; // Importo todas las clases del paquete javax.swing para manejar cuadros de diálogo

//Clase que gestiona el menú principal de la calculadora
public class Menu {

    //Método estático que muestra el menú y devuelve la opción seleccionada por el usuario
    public static int menu() {
        int opcion = -1;  //Inicializo la opción con un valor inválido para manejar posibles errores

        try {
            //Solicito al usuario una opción mediante un cuadro de diálogo
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    null, //No se especifica ventana principal
                    "Bienvenido a la calculadora!\n\n" +
                            "Digite el número correspondiente a la operación que desea realizar:\n" +
                            "1) Sumar\n" +
                            "2) Restar\n" +
                            "3) Multiplicar\n" +
                            "4) Dividir\n" +
                            "5) Salir",
                    "MENÚ", //Título de la ventana
                    JOptionPane.QUESTION_MESSAGE //Icono de pregunta
            ));
        } catch (NumberFormatException e) {
            //Manejo de error si el usuario ingresa un valor no numérico
            JOptionPane.showMessageDialog(
                    null, // Sin ventana principal
                    "Entrada no válida. Por favor, ingrese un número del 1 al 5.", // Mensaje de error
                    "Error", //Título del cuadro de diálogo
                    JOptionPane.ERROR_MESSAGE //Icono de error
            );
        }
        return opcion;  //Devuelvo la opción seleccionada (o -1 si ocurrió un error)
    }
}
