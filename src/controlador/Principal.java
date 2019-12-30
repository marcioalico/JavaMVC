/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaMenu;

/**
 *
 * @author malico
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaMenu menu = new VistaMenu();
        ControladorMenu controlador = new ControladorMenu(menu);
        menu.setVisible(true);
    }
}
