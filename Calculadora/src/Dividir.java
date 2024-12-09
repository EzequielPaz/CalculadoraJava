import javax.swing.JOptionPane;  // Importación de la clase JOptionPane para manejar la interfaz gráfica

public class Dividir {
    private static double resultado = 0;  // Variable para almacenar el resultado de la división
    private static boolean continuar = true;  // Controla el ciclo de la operación

    // Método estático para realizar la operación de división
    public static void dividir() {
        while (continuar) {  // Bucle que se repite mientras continuar sea verdadero
            try {
                // Solicitar el primer número solo si el resultado es 0 (es la primera división)
                if (resultado == 0) {
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el primer número: ",  // Mensaje solicitando el primer número
                            "Ingreso de Número",  // Título de la ventana
                            JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
                    ));

                    double num2 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el segundo número: ",  // Mensaje solicitando el segundo número
                            "Ingreso de Número",  // Título de la ventana
                            JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
                    ));

                    // Validación para evitar división por cero
                    if (num2 <= 0) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Debes ingresar un valor numérico mayor a cero. La división por cero no es posible.",
                                "Error de Entrada",
                                JOptionPane.ERROR_MESSAGE  // Icono de error
                        );
                        continue;  // Continuar el ciclo si el valor ingresado no es válido
                    } else {
                        resultado = num1 / num2;  // Realizar la división
                    }

                } else {
                    // Solicitar un número adicional si ya hay un resultado previo
                    double num3 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese otro número para dividir: ",  // Mensaje solicitando otro número
                            "Ingreso de Número",  // Título de la ventana
                            JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
                    ));

                    // Validación para evitar división por cero
                    if (num3 <= 0) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Debes ingresar un valor numérico mayor a cero. La división por cero no es posible.",
                                "Error de Entrada",
                                JOptionPane.ERROR_MESSAGE  // Icono de error
                        );
                        continue;  // Continuar el ciclo si el valor ingresado no es válido
                    } else {
                        resultado /= num3;  // Realizar la división con el nuevo número
                    }
                }

                // Mostrar el resultado actual
                JOptionPane.showMessageDialog(
                        null,
                        "La división actual es: " + resultado,  // Mensaje con el resultado de la división
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE  // Icono de información
                );

            } catch (NumberFormatException e) {
                // Si el usuario no ingresa un número válido, mostrar un mensaje de error
                JOptionPane.showMessageDialog(
                        null,
                        "Debes ingresar un valor numérico.",  // Mensaje de error
                        "Error de Entrada",
                        JOptionPane.ERROR_MESSAGE  // Icono de error
                );
                continue;  // Permitir al usuario corregir el error
            }

            // Preguntar al usuario si desea continuar dividiendo
            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Desea ingresar más números?",  // Pregunta al usuario
                    "Continuar",
                    JOptionPane.YES_NO_OPTION,  // Opciones "Sí" y "No"
                    JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
            );

            if (respuesta != JOptionPane.YES_OPTION) {
                continuar = false;  // Finalizar el ciclo si el usuario elige "No"
            }
        }

        // Mostrar el mensaje final con el resultado de la operación
        JOptionPane.showMessageDialog(
                null,
                "¡Gracias por usar la calculadora! División final: " + resultado,  // Mensaje de cierre
                "Fin del Programa",
                JOptionPane.INFORMATION_MESSAGE  // Icono de información
        );
    }
}

