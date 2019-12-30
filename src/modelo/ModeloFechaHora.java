/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author malico
 */
public class ModeloFechaHora {

    public static String obtenerFechaActual() {
        Calendar fecha = Calendar.getInstance();
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        mes = mes + 1;
        String mesString;
        if (mes < 10){
            mesString = "0" + mes;
        }
        else {
            mesString = "" + mes;
        }
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String diaString;
        if (dia < 10){
            diaString = "0" + dia;
        }
        else {
            diaString = "" + dia;
        }
        return diaString + "/" + mesString + "/" + anio;
    }

    public static String obtenerHoraActual() {
        Calendar fecha = Calendar.getInstance();
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        String horaString;
        if (hora < 10){
            horaString = "0" + hora;
        }
        else {
            horaString = "" + hora;
        }
        int minutos = fecha.get(Calendar.MINUTE);
        String minutosString;
        if (minutos < 10){
            minutosString = "0" + minutos;
        }
        else {
            minutosString = "" + minutos;
        }
        int segundos = fecha.get(Calendar.SECOND);
        String segundosString;
        if (segundos < 10){
            segundosString = "0" + segundos;
        }
        else {
            segundosString = "" + segundos;
        }
        return horaString + "." + minutosString + "." + segundosString;
    }
    public static String convertirFormatoFecha(String fecha) {
        return fecha.substring(8,10) + "/" + fecha.substring(5,7)
                + "/" + fecha.substring(0,4);
    }
}
