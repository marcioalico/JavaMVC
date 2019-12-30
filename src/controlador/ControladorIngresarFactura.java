/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.FocusEvent;
import modelo.ModeloCalculadora;
import modelo.ModeloFechaHora;
import modelo.ModeloRedondeoDecimal;
import vista.VistaIngresarFactura;

/**
 *
 * @author malico
 */
public class ControladorIngresarFactura {
    VistaIngresarFactura ingresarFactura = null;
    ModeloCalculadora calculadora = new ModeloCalculadora();
    Integer cantDetalles = 0;
    
    public ControladorIngresarFactura(VistaIngresarFactura ingresarFactura) {
       	this.ingresarFactura = ingresarFactura;
        String fechaActual = ModeloFechaHora.obtenerFechaActual();
        this.ingresarFactura.setFecha(fechaActual);
        this.ingresarFactura.setFechaVencimiento(fechaActual);
        accionesVistaIngresarFactura();
    }

    private void accionesVistaIngresarFactura() {
        ingresarFactura.btAgregar.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btAgregarActionPerformed(evt);
        }
        });
        ingresarFactura.btRetornar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });
        ingresarFactura.btConfirmar.addActionListener (new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        ingresarFactura.etDescuento.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent evt) {
            }
            @Override
            public void focusLost(FocusEvent evt) {
                etDescuentoFocusLost(evt);
            }
        });
        ingresarFactura.etIdCliente.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(FocusEvent evt) {
            }
            @Override
            public void focusLost(FocusEvent evt) {
                etIdClienteFocusLost(evt);
            }
        });
    }

    private void btAgregarActionPerformed
        (java.awt.event.ActionEvent evt) {
        String etArticulo = ingresarFactura.getArticulo();
//        ingresarFactura.setArticulo(etArticulo);
        Integer etCantidad = ingresarFactura.getCantidad();
        Double etPrecioUnitario = ModeloRedondeoDecimal.getDecimal(2,
                    ingresarFactura.getPrecioUnitario(),true);
        
        if (!etArticulo.equals("") && etCantidad != 0 && etPrecioUnitario != 0) {
            cantDetalles = cantDetalles + 1;
            Double total = calculadora.calcularUnDetalle(etCantidad,
                    etPrecioUnitario);
            ingresarFactura.agregarFilaTablaDetalle(cantDetalles,
                    etArticulo, etCantidad, etPrecioUnitario, total);
            Double etTotalMercaderia = calculadora.getTotalMercaderia();
            ingresarFactura.setTotalMercaderia(etTotalMercaderia);
            Double etIva = calculadora.calcularIva();
            ingresarFactura.setIva(etIva);
            Double etTotalFactura = ModeloRedondeoDecimal.getDecimal(2,
                    calculadora.calcularTotalFactura(),true);
            ingresarFactura.setTotalFactura(etTotalFactura);
            
            // Aqui agregar un detalle al modelo

        } 
     }


    private void etIdClienteFocusLost(FocusEvent evt) {
        if (ingresarFactura.etIdCliente.getText().equals("")) {
            System.out.println("Debe ingresar un número de Cliente");
        }
        else {
            ingresarFactura.setDniCliente("10000000");
            ingresarFactura.setNomCliente("Juan Perez");

            // Aqui obtener los datos del cliente de la tabla, almacenarlo en
            // el modelo y mostrarlo en la vista

        }

    }

    private void etDescuentoFocusLost
        (java.awt.event.FocusEvent evt) {
        Double etDescuento = ingresarFactura.getDescuento();
        calculadora.setDescuento(etDescuento);
        Double etTotalFactura = calculadora.calcularTotalFactura();
        ingresarFactura.setDescuento(calculadora.getDescuento());
        ingresarFactura.setTotalFactura(etTotalFactura);
    }

    private void btRetornarActionPerformed
        (java.awt.event.ActionEvent evt) {
        ingresarFactura.dispose();
    }

    private void btConfirmarActionPerformed
        (java.awt.event.ActionEvent evt) {
        if (datosValidos()) {
            System.out.println("Todo preparado para confeccionar la factura..");
            armarFactura();
        }
    }

    private boolean datosValidos() {
        boolean validos = true;
        if (ingresarFactura.getNomCliente().equals("")) {
            validos = false;
        }
        if (ingresarFactura.getNumeroFactura().equals("")) {
            validos = false;
        }
        if (ingresarFactura.getCantidadFilasTablaDetalle() == 0) {
            validos = false;
        }
        return validos;
    }

    private void armarFactura() {

        // Aqui completar todos los datos del modelo excepto el "id" del
        // documento

        grabarBD();
    }

    private void grabarBD() {

        // Aqui insertar una fila en la tabla "Documentos" tomando los
        // datos del modelo y recibir el "id" generado, luego agregar
        // dicho dato al modelo (para tablas "Facturas" y "Detalles"),
        // por último insertar una fila en la tabla "Facturas" y "n"
        // filas en la tabla "Detalles".

    }
}
