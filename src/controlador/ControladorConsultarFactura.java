/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaConsultarFactura;

/**
 *
 * @author malico
 */
public class ControladorConsultarFactura {
    VistaConsultarFactura consultarFactura = null;
     
    public ControladorConsultarFactura(VistaConsultarFactura consultarFactura) {
       	this.consultarFactura = consultarFactura;
        accionesVistaConsultarFactura();
    }

    private void accionesVistaConsultarFactura() {
        consultarFactura.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        consultarFactura.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
    }

    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        consultarFactura.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        if (datosValidos()) {
            if (armarFactura()){
                mostrarFactura();
            }
            else {
                System.out.println("Factura no encontrada");
            }
        }
        else {
            System.out.println("Debe ingresar un número de factura");
        }    
    }

    private boolean datosValidos() {
        boolean validos = true;
        if (consultarFactura.getIdFactura().equals("")) {
            validos = false;
        }
        return validos;
    }

    private boolean armarFactura() {
        Integer localNumeroFactura = 
                Integer.parseInt(consultarFactura.getIdFactura());

        // Aqui buscar los datos de la factura en la base de datos y almacenarlos
        // en el modelo
    
        return false;
    } 

    private void mostrarFactura() {
        System.out.println("Todo preparado para visualizar la factura..");

        // Aqui tomar los datos de la factura del modelo y mostrarlos en la vista

    }

}
