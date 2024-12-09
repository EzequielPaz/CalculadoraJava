import javax.swing.JOptionPane;  // Importo solo la clase JOptionPane para manejar cuadros de diálogo

// Clase que gestiona la operación de multiplicación
public class Multiplicar {
    private static double resultado = 0;  // Almacena el resultado de la multiplicación
    private static boolean continuar = true;  // Controla el ciclo de la operación

    // Método estático para realizar multiplicaciones
    public static void multiplicar() {
        while (continuar) {
            try {
                // Solicito los primeros números solo si el resultado es 0 (primera multiplicación)
                if (resultado == 0) {
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el primer número: ",  // Mensaje de entrada para el primer número
                            "Ingreso de Número",  // Título de la ventana
                            JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
                    ));

                    double num2 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el segundo número: ",  // Mensaje de entrada para el segundo número
                            "Ingreso de Número",
                            JOptionPane.QUESTION_MESSAGE
                    ));

                    resultado = num1 * num2;  // Realizo la multiplicación inicial

                } else {
                    // Solicito un número adicional si ya hay un resultado previo
                    double num3 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese otro número para multiplicar: ",  // Mensaje de entrada adicional
                            "Ingreso de Número",
                            JOptionPane.QUESTION_MESSAGE
                    ));

                    resultado *= num3;  // Actualizo el resultado multiplicando el nuevo número
                }

                // Muestro el resultado actual de la multiplicación
                JOptionPane.showMessageDialog(
                        null,
                        "La multiplicación actual es: " + resultado,  // Mensaje con el resultado acumulado
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE  // Icono de información
                );

            } catch (NumberFormatException e) {
                // Manejo de error si el usuario ingresa un valor no numérico
                JOptionPane.showMessageDialog(
                        null,
                        "Debes ingresar un valor numérico.",  // Mensaje de error
                        "Error de Entrada",
                        JOptionPane.ERROR_MESSAGE  // Icono de error
                );
                continue;  // Permite la corrección y continuar con el ciclo
            }

            // Pregunto si el usuario quiere ingresar más números para multiplicar
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea ingresar más números?",  // Pregunta al usuario
                    "Continuar",
                    JOptionPane.YES_NO_OPTION,  // Opciones "Sí" y "No"
                    JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
            );

            if (respuesta != JOptionPane.YES_OPTION) {
                continuar = false;  // Finaliza el ciclo si elige "No"
            }
        }

        // Muestro el resultado final después de salir del ciclo
        JOptionPane.showMessageDialog(
                null,
                "¡Gracias por usar la calculadora! Multiplicación final: " + resultado,  // Mensaje de cierre
                "Fin del Programa",
                JOptionPane.INFORMATION_MESSAGE  // Icono de información
        );
    }
}
