package servicios;

import javax.swing.*;
import java.util.Scanner;

public class Login {
    private static final String USUARIO_CORRECTO = "Admin";
    private static final String CONTRASEÑA_CORRECTA = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de inicio de sesión");

        // Solicitar nombre de usuario y contraseña
        System.out.print("Usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contraseñaIngresada = scanner.nextLine();

        // Verificar credenciales
        if (verificarCredenciales(usuarioIngresado, contraseñaIngresada)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Usuario y/o Contraseña incorrectas. Inténtalo nuevamente.");
        }
    }

    // Método para verificar las credenciales
    private static boolean verificarCredenciales(String usuario, String contraseña) {
        return usuario.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASEÑA_CORRECTA);
    }
}

