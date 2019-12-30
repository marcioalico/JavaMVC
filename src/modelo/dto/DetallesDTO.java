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
public class DetallesDTO {
    private Long id_documento;
    private Integer id_detalle;
    private String articulo;
    private Integer cantidad;
    private Double precio_unitario;
    private Double importe;

    public DetallesDTO() {
    }

    public Long getId_documento() {
        return id_documento;
    }

    public Integer getId_detalle() {
        return id_detalle;
    }

    public String getArticulo() {
        return articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public Double getImporte() {
        return importe;
    }

    public void setId_documento(Long id_documento) {
        this.id_documento = id_documento;
    }

    public void setId_detalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
    
    
}


