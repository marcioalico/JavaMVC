/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaConsultarRecibo;

/**
 *
 * @author malico
 */
public class ControladorConsultarRecibo {
    VistaConsultarRecibo consultarRecibo = null;
    
    public ControladorConsultarRecibo(VistaConsultarRecibo consultarRecibo) {
       	this.consultarRecibo = consultarRecibo;
        accionesVistaConsultarRecibo();
    }

    private void accionesVistaConsultarRecibo() {
        consultarRecibo.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        consultarRecibo.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
    }


    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        consultarRecibo.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        if (datosValidos()) {
            if (armarRecibo()){
                mostrarRecibo();
            }
            else {
                System.out.println("Recibo no encontrado");
            }
        }    
        else {
            System.out.println("Debe ingresar un número de recibo");
        }    
    }

    private boolean datosValidos() {
        boolean validos = true;
        if (consultarRecibo.getIdRecibo().equals("")) {
            validos = false;
        }
        return validos;
    }

    private boolean armarRecibo() {
        Integer localNumeroRecibo = 
                Integer.parseInt(consultarRecibo.getIdRecibo());
        
        // Aqui buscar los datos del recibo en la base de datos y almacenarlos
        // en el modelo
    
        return false;
        
    } 

    private void mostrarRecibo() {
        System.out.println("Todo preparado para visualizar el recibo..");

        // Aqui tomar los datos del recibo del modelo y mostrarlos en la vista

    }    

}
