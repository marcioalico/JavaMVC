/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion.Conexion;
import modelo.dto.ClienteDTO;
import modelo.interfaces.Obligacion;

/**
 *
 * @author malico
 */
public class ClienteDAO implements Obligacion<ClienteDTO>{
    private static final String SQL_AGREGAR = "INSERT INTO clientes (dni, apyn) VALUES (?,?)";
    private static final String SQL_BORRAR = "DELETE FROM clientes WHERE id = ?";
    private static final String SQL_MODIFICAR = "UPDATE clientes SET dni = ?, apyn = ? WHERE id = ?";
    private static final String SQL_LEER = "SELECT * FROM clientes WHERE id = ?"; 
    private static final Conexion CON = Conexion.getInstanciaUnica();
    
    public ClienteDAO() {
    }
    
    @Override
    public boolean agregar(ClienteDTO cc) {
        PreparedStatement ps;
        try {
            ps = CON.getCnn().prepareStatement(SQL_AGREGAR);
            ps.setInt(1,cc.getDni());
            ps.setString(2, cc.getApyn());
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            CON.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean borrar(ClienteDTO cc) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean modificar(ClienteDTO cc) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ClienteDTO leer(ClienteDTO cc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
