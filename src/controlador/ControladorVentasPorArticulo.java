/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaVentasPorArticulo;

/**
 *
 * @author malico
 */
public class ControladorVentasPorArticulo {
    VistaVentasPorArticulo ventasPorArticulo = null;
    
    public ControladorVentasPorArticulo(VistaVentasPorArticulo ventasPorArticulo) {
       	this.ventasPorArticulo = ventasPorArticulo;
        accionesVistaVentasPorArticulo();
    }

    private void accionesVistaVentasPorArticulo() {
        ventasPorArticulo.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        ventasPorArticulo.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
    }

    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        ventasPorArticulo.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        
        // Aqui buscar la fecha y hora actual y mostrarla en la vista

        if (obtenerVentasPorArticulo()) {
            mostrarVentasPorArticulo();
        }
        else {
            System.out.println("No existen movimientos");
        }
    }

    private boolean obtenerVentasPorArticulo() {

        // Aqui invocar a un método que retorne un ResultSer con 
        // los totales por artículo
        
        
        return false;
    }

    private void mostrarVentasPorArticulo() {

        // Aqui recorrer el ResultSet y mostrarlo en la vista (tabla)

    }

}
