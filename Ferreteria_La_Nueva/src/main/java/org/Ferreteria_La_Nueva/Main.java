package org.Ferreteria_La_Nueva;

import modelos.Usuarios;
import modelos.Productos;
import servicios.CrearUsuario;
import servicios.Login;
import conexionDB.ConexionBD;

public class Main {
    public static void main(String[] args) {

        ConexionBD miConexion = new ConexionBD();
        
        miConexion.cerrarConexion();

    }
}
