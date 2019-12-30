/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.FocusEvent;
import modelo.ModeloFechaHora;
import modelo.ModeloRedondeoDecimal;
import vista.VistaIngresarRecibo;

/**
 *
 * @author malico
 */
public class ControladorIngresarRecibo {
    VistaIngresarRecibo ingresarRecibo = null;
    
    public ControladorIngresarRecibo(VistaIngresarRecibo ingresarRecibo) {
       	this.ingresarRecibo = ingresarRecibo;
        String fechaActual = ModeloFechaHora.obtenerFechaActual();
        this.ingresarRecibo.setFecha(fechaActual);
        accionesVistaIngresarRecibo();
    }

    private void accionesVistaIngresarRecibo() {
        ingresarRecibo.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        ingresarRecibo.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        ingresarRecibo.etIdCliente.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent evt) {
            }
            @Override
            public void focusLost(FocusEvent evt) {
                etIdClienteFocusLost(evt);
            }
        });
    }


    private void etIdClienteFocusLost(FocusEvent evt) {
        if (ingresarRecibo.etIdCliente.getText().equals("")) {
            System.out.println("Debe ingresar un número de Cliente");
        }
        else {
            ingresarRecibo.setDniCliente("10000000");
            ingresarRecibo.setNomCliente("Juan Perez");

        // Aqui obtener los datos del cliente de la tabla, almacenarlo en
        // el modelo y mostrarlo en la vista

        }    
    }

    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        ingresarRecibo.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        if (datosValidos()) {
            System.out.println("Todo preparado para confeccionar el recibo..");
            armarRecibo();
        }
    }

    private boolean datosValidos() {
        boolean validos = true;
        ingresarRecibo.setImporte(ModeloRedondeoDecimal.getDecimal(2,
                ingresarRecibo.getImporte(), true));
        if (ingresarRecibo.getCliente().equals("")) {
            validos = false;
        }
        if (ingresarRecibo.getNumeroRecibo().equals("")) {
            validos = false;
        }
        if (ingresarRecibo.getImporte() == 0) {
            validos = false;
        }
        if (ingresarRecibo.getMedioDePago().equals("")) {
            validos = false;
        }
        return validos;
    }

    private void armarRecibo() {

        // Aqui completar todos los datos del modelo excepto el "id" del
        // documento

        grabarBD();
    }

    private void grabarBD() {

        // Aqui insertar una fila en la tabla "Documentos" tomando los
        // datos del modelo y recibir el "id" generado, luego agregar
        // dicho dato al modelo (para tabla "Recibos") y por último
        // insertar una fila en la tabla "Recibos".

    }
}
