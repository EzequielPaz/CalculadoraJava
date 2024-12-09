# Calculadora Interactiva en Java

Este es un proyecto de calculadora interactiva desarrollada en Java que permite realizar varias operaciones matemáticas como suma, resta, multiplicación y división. Utiliza cuadros de diálogo gráficos proporcionados por la librería `javax.swing` para interactuar con el usuario, lo que mejora la experiencia en comparación con una calculadora basada únicamente en la consola.

## Descripción

La calculadora permite al usuario elegir entre las siguientes operaciones:

1. **Suma**: Realiza la suma de dos números proporcionados por el usuario.
2. **Resta**: Realiza la resta de dos números.
3. **Multiplicación**: Multiplica dos números.
4. **División**: Divide dos números (con validación para evitar la división por cero).
5. **Salir**: Termina el programa.

El flujo de trabajo del programa es el siguiente:
- El usuario selecciona una operación a través de un menú interactivo.
- Dependiendo de la operación seleccionada, se pide al usuario que ingrese los números correspondientes.
- El resultado de cada operación se muestra en un cuadro de mensaje.
- Después de cada operación, el usuario puede elegir si desea realizar otra operación o salir del programa.

El proceso continúa hasta que el usuario decide salir, asegurando una experiencia sencilla.

## Características

- Menú interactivo con opciones de operaciones matemáticas.
- Realiza operaciones de suma, resta, multiplicación y división.
- Validaciones de entrada para evitar errores, como la división por cero.
- Interfaz gráfica basada en cuadros de diálogo utilizando la biblioteca `javax.swing`.
- Permite al usuario continuar realizando operaciones o salir del programa.

## Requisitos

- Java 8 o superior instalado en el sistema.

## Cómo Ejecutar el Proyecto

### Paso 1: Clonar el Repositorio

Si desea clonar este proyecto en tu PC, abri la terminald de bash y utiliza el siguiente comando:

```bash
git clone https://github.com/EzequielPaz/CalculadoraJava.git
o clonarlo mediante una llave ssh
git clone git@github.com:EzequielPaz/CalculadoraJava.git

### Paso 2: Compilar el Proyecto
Abre una terminal en la carpeta raíz del proyecto donde está ubicado el archivo Main.java.
Compila el archivo Java usando el siguiente comando:
javac Main.java

### Paso 3: Ejecutar el Proyecto

java Main



