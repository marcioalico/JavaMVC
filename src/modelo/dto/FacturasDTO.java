/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

/**
 *
 * @author malico
 */
public class FacturasDTO {
    private Long id_documento;
    private String fecha_vencimiento;
    private Double importe_mercaderia;
    private Double iva;
    private Double descuento;

    public FacturasDTO() {
    }

    public Long getId_documento() {
        return id_documento;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public Double getImporte_mercaderia() {
        return importe_mercaderia;
    }

    public Double getIva() {
        return iva;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setId_documento(Long id_documento) {
        this.id_documento = id_documento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setImporte_mercaderia(Double importe_mercaderia) {
        this.importe_mercaderia = importe_mercaderia;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

}
