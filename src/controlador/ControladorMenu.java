/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaConsultarFactura;
import vista.VistaConsultarMovimientosPorCliente;
import vista.VistaConsultarRecibo;
import vista.VistaMenu;
import vista.VistaIngresarFactura;
import vista.VistaIngresarRecibo;
import vista.VistaTotalesPorCliente;
import vista.VistaVentasPorArticulo;

/**
 *
 * @author malico
 */
public class ControladorMenu {
    VistaMenu menu = null;

    public ControladorMenu(VistaMenu menu) {
       this.menu = menu;
       accionesVistaMenu();
    }

    private void accionesVistaMenu() {
        menu.login.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emLoginActionPerformed(evt);
            }
        });  
        menu.logout.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emLogoutActionPerformed(evt);
            }
        });  
        menu.salir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emSalirActionPerformed(evt);
            }
        }); 
        menu.ingresarFactura.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emIngresarFacturaActionPerformed(evt);
            }
        });
        menu.consultarFactura.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emConsultarFacturaActionPerformed(evt);
            }
        });
        menu.ingresarRecibo.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emIngresarReciboActionPerformed(evt);
            }
        });
        menu.consultarRecibo.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emConsultarReciboActionPerformed(evt);
            }
        });
        menu.consultarMovimientosPorCliente.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emConsultarMovimientosPorClienteActionPerformed(evt);
            }
        });
        menu.totalesPorCliente.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emTotalesPorClienteActionPerformed(evt);
            }
        });
        menu.ventasPorArticulo.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emVentasPorArticuloActionPerformed(evt);
            }
        });
    }
    private void emLoginActionPerformed(java.awt.event.ActionEvent evt) {
        menu.logout.setEnabled(true);
        menu.login.setEnabled(false);
        menu.movimientos.setEnabled(true);
        menu.consultas.setEnabled(true);
        menu.estadisticas.setEnabled(true);
    }
    private void emLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        menu.logout.setEnabled(false);
        menu.login.setEnabled(true);
        menu.movimientos.setEnabled(false);
        menu.consultas.setEnabled(false);
        menu.estadisticas.setEnabled(false);
    }
    private void emIngresarFacturaActionPerformed(java.awt.event.ActionEvent evt) {
        VistaIngresarFactura ingresarFactura = new VistaIngresarFactura();
        ControladorIngresarFactura controlador = 
                new ControladorIngresarFactura(ingresarFactura);
        ingresarFactura.setVisible(true);
    }
    private void emConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {
        VistaConsultarFactura consultarFactura = new VistaConsultarFactura();
        ControladorConsultarFactura controlador = 
                new ControladorConsultarFactura(consultarFactura);
        consultarFactura.setVisible(true);
    }
    private void emIngresarReciboActionPerformed(java.awt.event.ActionEvent evt) {
        VistaIngresarRecibo ingresarRecibo = new VistaIngresarRecibo();
        ControladorIngresarRecibo controlador = 
                new ControladorIngresarRecibo(ingresarRecibo);
        ingresarRecibo.setVisible(true);
    }
    private void emConsultarReciboActionPerformed(java.awt.event.ActionEvent evt) {
        VistaConsultarRecibo consultarRecibo = new VistaConsultarRecibo();
        ControladorConsultarRecibo controlador = 
                new ControladorConsultarRecibo(consultarRecibo);
        consultarRecibo.setVisible(true);
    }
    private void emConsultarMovimientosPorClienteActionPerformed(java.awt.event.ActionEvent evt) {
        VistaConsultarMovimientosPorCliente consultarMovimientosPorCliente =
                new VistaConsultarMovimientosPorCliente();
        ControladorConsultarMovimientosPorCliente controlador = 
                new ControladorConsultarMovimientosPorCliente(consultarMovimientosPorCliente);
        consultarMovimientosPorCliente.setVisible(true);
    }
    private void emTotalesPorClienteActionPerformed(java.awt.event.ActionEvent evt) {
        VistaTotalesPorCliente totalesPorCliente =
                new VistaTotalesPorCliente();
        ControladorTotalesPorCliente controlador = 
                new ControladorTotalesPorCliente(totalesPorCliente);
        totalesPorCliente.setVisible(true);
    }
    private void emVentasPorArticuloActionPerformed(java.awt.event.ActionEvent evt) {
        VistaVentasPorArticulo ventasPorArticulo =
                new VistaVentasPorArticulo();
        ControladorVentasPorArticulo controlador = 
                new ControladorVentasPorArticulo(ventasPorArticulo);
        ventasPorArticulo.setVisible(true);
    }
    private void emSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
}
