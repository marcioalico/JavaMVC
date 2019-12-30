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
public class DocumentosDTO {
    private Long id;
    private String tipo;
    private Integer numero;
    private Long id_cliente;
    private String fecha;
    private Double importe;

    public DocumentosDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public Double getImporte() {
        return importe;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
    
}
