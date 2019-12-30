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
public class ClienteDTO {
    private Long id;
    private Integer dni;
    private String apyn;

    public ClienteDTO() {
    }

    public Long getId() {
        return id;
    }

    public Integer getDni() {
        return dni;
    }

    public String getApyn() {
        return apyn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setApyn(String apyn) {
        this.apyn = apyn;
    }
    
}
