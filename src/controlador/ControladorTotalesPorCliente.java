/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaTotalesPorCliente;

/**
 *
 * @author malico
 */
public class ControladorTotalesPorCliente {
    VistaTotalesPorCliente totalesPorCliente = null;
    
    public ControladorTotalesPorCliente(VistaTotalesPorCliente totalesPorCliente) {
       	this.totalesPorCliente = totalesPorCliente;
        accionesVistaTotalesPorCliente();
    }

    private void accionesVistaTotalesPorCliente() {
        totalesPorCliente.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        totalesPorCliente.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
    }

    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        totalesPorCliente.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        
        // Aqui buscar la fecha y hora actual y mostrarla en la vista

        if (obtenerTotalesPorCliente()) {
            mostrarTotalesPorCliente();
        }
        else {
            System.out.println("No existen movimientos");
        }
    }

    private boolean obtenerTotalesPorCliente() {

        // Aqui invocar a un método que retorne un ResultSer con 
        // los totales por cliente
        
        return false;
    }

    private void mostrarTotalesPorCliente() {

        // Aqui recorrer el ResultSet y mostrarlo en la vista (tabla)

    }

}
