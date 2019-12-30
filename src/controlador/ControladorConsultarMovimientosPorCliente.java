/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaConsultarMovimientosPorCliente;

/**
 *
 * @author malico
 */
public class ControladorConsultarMovimientosPorCliente {
    VistaConsultarMovimientosPorCliente consultarMovimientosPorCliente = null;
    
    public ControladorConsultarMovimientosPorCliente(VistaConsultarMovimientosPorCliente consultarMovimientosPorCliente) {
       	this.consultarMovimientosPorCliente = consultarMovimientosPorCliente;
        accionesVistaConsultarMovimientosPorCliente();
    }

    private void accionesVistaConsultarMovimientosPorCliente() {
        consultarMovimientosPorCliente.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        consultarMovimientosPorCliente.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
    }

    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        consultarMovimientosPorCliente.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        if (datosValidos()) {
            if (obtenerDatosDelCliente()) {
                if (armarMovimientosPorCliente()) {
                    mostrarMovimientosPorCliente();
                }
                else {
                    System.out.println("No existen movimientos para ese cliente");
                }
            }    
            else {
                System.out.println("Cliente no existente");
            }
        }
        else {
            System.out.println("Debe ingresar un número de cliente");
        }    
    }

    private boolean datosValidos() {
        boolean validos = true;
        if (consultarMovimientosPorCliente.getIdCliente().equals("")) {
            validos = false;
        }
        return validos;
    }

    private boolean obtenerDatosDelCliente() {
        // Aqui obtener los datos de un cliente de la base y almacenarlo en 
        // el modelo

        return false;
        
    }

    private boolean armarMovimientosPorCliente() {
        Integer localNumeroCliente = 
                Integer.parseInt(consultarMovimientosPorCliente.getIdCliente());
        
        // Aqui obtener los movimientos de un cliente de la base y almacenarlos en 
        // el modelo

        return false;
        
    }

    private void mostrarMovimientosPorCliente() {
        System.out.println("Todo preparado para visualizar los movimientos..");

        // Aqui mostrar los datos del modelo en la vista
        
    }

}
