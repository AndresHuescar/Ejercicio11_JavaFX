package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Creo las etiquetas del formulario
        Label labelNombre = new Label("Nombre:");
        Label labelCorreo = new Label("Correo:");
        Label labelPassword = new Label("Contraseña:");

        // Creo los campos donde el usuario introducirá los datos
        TextField campoNombre = new TextField();
        TextField campoCorreo = new TextField();
        PasswordField campoPassword = new PasswordField();

        // Texto de ayuda que aparece dentro de los campos
        campoNombre.setPromptText("Introduce tu nombre");
        campoCorreo.setPromptText("Introduce tu correo");
        campoPassword.setPromptText("Introduce tu contraseña");

        // Etiqueta donde se mostrará si el formulario es correcto o no
        Label mensaje = new Label();

        // Botón para validar el formulario
        Button botonValidar = new Button("Validar formulario");

        // Evento del botón
        botonValidar.setOnAction(event -> {

            // Guardo el contenido de los campos en variables
            String nombre = campoNombre.getText();
            String correo = campoCorreo.getText();
            String password = campoPassword.getText();

            // Compruebo si algún campo está vacío
            if (nombre.isEmpty() || correo.isEmpty() || password.isEmpty()) {
                mensaje.setText("Error: todos los campos son obligatorios.");
                mensaje.setStyle("-fx-text-fill: red;");
            } else {
                mensaje.setText("Formulario enviado correctamente.");
                mensaje.setStyle("-fx-text-fill: green;");
            }
        });

        // GridPane organiza el formulario en filas y columnas
        GridPane root = new GridPane();

        // Separación horizontal y vertical entre elementos
        root.setHgap(10);
        root.setVgap(10);

        // Estilo para centrar el formulario y añadir margen interior
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Añado los elementos al GridPane indicando columna y fila
        root.add(labelNombre, 0, 0);
        root.add(campoNombre, 1, 0);

        root.add(labelCorreo, 0, 1);
        root.add(campoCorreo, 1, 1);

        root.add(labelPassword, 0, 2);
        root.add(campoPassword, 1, 2);

        root.add(botonValidar, 1, 3);
        root.add(mensaje, 1, 4);

        // Creo la escena principal
        Scene scene = new Scene(root, 500, 300);

        // Configuro y muestro la ventana
        stage.setTitle("Ejercicio 11 - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}