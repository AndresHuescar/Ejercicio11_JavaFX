# Ejercicio 11 - JavaFX

## Descripción

Este proyecto corresponde al ejercicio 11 del bloque BC5 de JavaFX.

El objetivo del ejercicio es crear un formulario sencillo que recoja el nombre, el correo electrónico y una contraseña, validando que ningún campo esté vacío.

## Tecnologías utilizadas

- Java
- JavaFX
- Maven
- IntelliJ IDEA

## Funcionamiento

La aplicación muestra una ventana con un formulario compuesto por:

- Campo de nombre.
- Campo de correo electrónico.
- Campo de contraseña.
- Botón para validar el formulario.
- Mensaje de resultado.

Cuando el usuario pulsa el botón, el programa comprueba si alguno de los campos está vacío.

Si algún campo está vacío, se muestra un mensaje de error en color rojo.

Si todos los campos están completos, se muestra un mensaje de confirmación en color verde.

## Conceptos utilizados

- `Application`: clase base para crear aplicaciones JavaFX.
- `Stage`: ventana principal de la aplicación.
- `Scene`: contenido visual de la ventana.
- `Label`: texto descriptivo o mensaje de resultado.
- `TextField`: campo para introducir texto.
- `PasswordField`: campo para introducir una contraseña.
- `Button`: botón para ejecutar la validación.
- `setOnAction`: método que permite controlar el evento del botón.
- `isEmpty`: método usado para comprobar si un campo está vacío.
- `GridPane`: layout que organiza los elementos en filas y columnas.

## Estructura del proyecto

```text
Ejercicio11_JavaFX
 ├── pom.xml
 └── src
     └── main
         └── java
             └── org
                 └── example
                     └── Main.java
```

## Cómo ejecutar el proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto en IntelliJ.
2. Sincronizar el archivo `pom.xml` con Maven.
3. Abrir el panel Maven.
4. Ejecutar:

```bash
mvn javafx:run
```

## Autor

Andrés Huéscar Fernández
