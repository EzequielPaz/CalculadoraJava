import javax.swing.*; //Importo todas las clases del paquete javax.swing para manejar cuadros de diálogo

//Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        int opcion;  //Variable para almacenar la opción seleccionada por el usuario
        boolean seguir = true;  //Variable de control para mantener el bucle activo

        //Bucle principal que se ejecuta mientras "seguir" sea true y el usuario quiera continuar
        do {
            opcion = Menu.menu();  // Llamo al método menu() de la clase Menu para obtener la opción seleccionada

            //Estructura de control switch para ejecutar la operación correspondiente
            switch (opcion) {
                case 1 -> Suma.suma();  //Llamo al método suma() de la clase Suma
                case 2 -> Resta.resta();  //Llamo al método resta() de la clase Resta
                case 3 -> Multiplicar.multiplicar();  //Llamo al método multiplicar() de la clase Multiplicar
                case 4 -> Dividir.dividir();  //Llamo al método dividir() de la clase Dividir
                case 5 -> seguir = false;  //Establezco "seguir" en false para salir del bucle
                default -> JOptionPane.showMessageDialog(
                        null,
                        "Opción no válida." //Mensaje de error para opciones incorrectas
                );
            }

        } while (seguir && continuar());  //Continúa mientras "seguir" sea true y el usuario elija continuar

        //Mensaje final después de salir del bucle
        JOptionPane.showMessageDialog(
                null,
                "Gracias por usar la calculadora"
        );
    }

    // Método para preguntar al usuario si desea realizar otra operación
    public static boolean continuar() {
        int respuesta = JOptionPane.showConfirmDialog(
                null,  //Sin ventana principal
                "¿Desea realizar otra operación?",  //Pregunta mostrada al usuario
                "Continuar",  //Título del cuadro de diálogo
                JOptionPane.YES_NO_OPTION  // Opciones de "Sí" y "No"
        );
        return respuesta == JOptionPane.YES_OPTION;  // Devuelve true si el usuario selecciona "Sí"
    }
}
