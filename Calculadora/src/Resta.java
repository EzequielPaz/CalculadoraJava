import javax.swing.JOptionPane;  // Importo solo la clase JOptionPane para manejar cuadros de diálogo

// Clase que gestiona la operación de resta
public class Resta {
    private static double resultado = 0;  // Almacena la resta acumulada
    private static boolean continuar = true;  // Controla el ciclo de la operación

    // Método estático para realizar restas
    public static void resta() {
        while (continuar) {
            try {
                // Solicito los primeros números solo si la resta acumulada es 0
                if (resultado == 0) {
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el primer número: ",  // Mensaje de entrada
                            "Ingreso de Número",  // Título de la ventana
                            JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
                    ));

                    double num2 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el segundo número: ",  // Mensaje para el segundo número
                            "Ingreso de Número",
                            JOptionPane.QUESTION_MESSAGE
                    ));

                    resultado = num1 - num2;  // Realizo la resta inicial

                } else {
                    // Solicito un número adicional si ya hay una resta previa
                    double num3 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese otro número para restar: ",  // Mensaje de entrada adicional
                            "Ingreso de Número",
                            JOptionPane.QUESTION_MESSAGE
                    ));

                    resultado -= num3;  // Actualizo el resultado restando el nuevo número
                }

                // Muestro el resultado actual de la resta
                JOptionPane.showMessageDialog(
                        null,
                        "La resta actual es: " + resultado,  // Mensaje con la resta acumulada
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE  // Icono de información
                );

            } catch (NumberFormatException e) {
                // Manejo de error si el usuario ingresa un valor no numérico
                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un valor numérico.",  // Mensaje de error
                        "Error de Entrada",
                        JOptionPane.ERROR_MESSAGE  // Icono de error
                );
                continue;  // Permitir corrección y continuar el ciclo
            }

            // Pregunto si el usuario quiere ingresar más números
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea ingresar más números?",  // Pregunta al usuario
                    "Continuar",
                    JOptionPane.YES_NO_OPTION,  // Opciones "Sí" y "No"
                    JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
            );

            if (respuesta != JOptionPane.YES_OPTION) {
                continuar = false;  // Finalizo el ciclo si elige "No"
            }
        }

        // Muestro el resultado final después de salir del ciclo
        JOptionPane.showMessageDialog(
                null,
                "¡Gracias por usar la calculadora! Resta final: " + resultado,  // Mensaje de cierre
                "Fin del Programa",
                JOptionPane.INFORMATION_MESSAGE  // Icono de información
        );
    }
}
