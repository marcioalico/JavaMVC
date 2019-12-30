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
public class ModeloRedondeoDecimal {

    public static double getDecimal(int numeroDecimales,
            double decimal, boolean truncar){
        double decimalAux = redondearDecimal(numeroDecimales, decimal);
        if (truncar && decimalAux > decimal) {
            decimalAux = decimalAux - 1/java.lang.Math.pow(10, numeroDecimales);
            decimalAux = redondearDecimal(numeroDecimales, decimalAux);
        }
        return decimalAux;
    }

    private static double redondearDecimal(int numeroDecimales, double decimal) {
        double decimalAux = decimal*(java.lang.Math.pow(10, numeroDecimales));
        decimalAux = java.lang.Math.round(decimalAux);
        decimalAux = decimalAux/java.lang.Math.pow(10, numeroDecimales);
        return decimalAux;
     }
    
}
