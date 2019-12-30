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
public class RecibosDTO {
    private Long id_documento;
    private String medio_de_pago;
    private String informacion_adicional;

    public RecibosDTO() {
    }

    public Long getId_documento() {
        return id_documento;
    }

    public String getMedio_de_pago() {
        return medio_de_pago;
    }

    public String getInformacion_adicional() {
        return informacion_adicional;
    }

    public void setId_documento(Long id_documento) {
        this.id_documento = id_documento;
    }

    public void setMedio_de_pago(String medio_de_pago) {
        this.medio_de_pago = medio_de_pago;
    }

    public void setInformacion_adicional(String informacion_adicional) {
        this.informacion_adicional = informacion_adicional;
    }
    
}
