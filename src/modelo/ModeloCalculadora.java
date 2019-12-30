/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author malico
 */
public class ModeloCalculadora {
    private Double totalFactura;
    private Double totalMercaderia;
    private Double descuento;

    public ModeloCalculadora(){
        totalFactura = 0.0;
        totalMercaderia = 0.0;
        descuento = 0.0;
    }
    public Double calcularUnDetalle(Integer cantidad, Double precioUnitario) {
        precioUnitario = ModeloRedondeoDecimal.getDecimal(2, precioUnitario, true);
        Double resultado = ModeloRedondeoDecimal.getDecimal(2,
                cantidad * precioUnitario + 0.00001, true);
        totalMercaderia = ModeloRedondeoDecimal.getDecimal(2, 
                totalMercaderia + resultado + 0.00001, true);
        return resultado;    
    }
    public Double calcularTotalFactura() {
        totalFactura = ModeloRedondeoDecimal.getDecimal(2,
                totalMercaderia + calcularIva() - descuento + 0.00001, true);
        return totalFactura;
    }
    public Double getTotalMercaderia() {
        return totalMercaderia;
    }
    public Double calcularIva() {
        return ModeloRedondeoDecimal.getDecimal(2, totalMercaderia * 0.21,true);
    }
    public Double getDescuento() {
        return descuento;
    }
    public void setDescuento(Double descuento) {
        this.descuento = ModeloRedondeoDecimal.getDecimal(2, descuento, true);
    }
}
