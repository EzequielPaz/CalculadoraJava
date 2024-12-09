import javax.swing.JOptionPane; // Importo solo la clase JOptionPane para manejar cuadros de diálogo

//Clase que gestiona la operación de suma
public class Suma {
    private static double resultado = 0;  //Almacena la suma acumulada
    private static boolean continuar = true;  //Controla el ciclo de la operación

    // Método estático para realizar sumas
    public static void suma() {
        while (continuar) {
            try {
                // Solicito los primeros números solo si la suma acumulada es 0
                if (resultado == 0) {
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el primer número: ",  // Mensaje de entrada
                            "Ingreso de Número",  // Título de la ventana
                            JOptionPane.QUESTION_MESSAGE  // Icono de pregunta
                    ));

                    double num2 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese el segundo número: ",
                            "Ingreso de Número",
                            JOptionPane.QUESTION_MESSAGE
                    ));

                    resultado = num1 + num2;  // Realizo la suma inicial

                } else {
                    // Solicito un número adicional si ya hay una suma previa
                    double num3 = Double.parseDouble(JOptionPane.showInputDialog(
                            null,
                            "Ingrese otro número para sumar: ",
                            "Ingreso de Número",
                            JOptionPane.QUESTION_MESSAGE
                    ));

                    resultado += num3;  // Acumulo el resultado
                }

                // Muestro el resultado actual de la suma
                JOptionPane.showMessageDialog(
                        null,
                        "La suma actual es: " + resultado,  // Mensaje con la suma acumulada
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
                continue;  // Continúo el ciclo para permitir corrección
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
                "¡Gracias por usar la calculadora! Suma final: " + resultado,  // Mensaje de cierre
                "Fin del Programa",
                JOptionPane.INFORMATION_MESSAGE  // Icono de información
        );
    }
}

