/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author malico
 */
public class Conexion {
    public static Conexion instanciaUnica;
    private Connection cnn;

private Conexion() {
        try {
            cnn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Datos\\IES\\PRO1\\UNIDAD 11\\Unidad 11 - BDEj11_1_estadoinicial.mdb", null, null);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public static Conexion getInstanciaUnica() {
    if (instanciaUnica == null) {
        synchronized (Conexion.class) {
            if (instanciaUnica == null) {
            instanciaUnica = new Conexion();
            }
        }
    }
 return instanciaUnica;
 }

public Connection getCnn() {
    return cnn;
 }

public void cerrarConexion() {
    instanciaUnica = null;
 }

}
