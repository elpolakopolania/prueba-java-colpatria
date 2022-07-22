package com.scotiabankcolpatria.hiring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditRiskAssessment {

    public double standardDeviation(int[] paymentDelays) {
        double std = 0;
        // Se calcula la media del arreglo
        double m = media(paymentDelays);

        // Se calcula el cuadrado de la distancia de la media y se suman los valores
        for (int paymentDelay : paymentDelays) {
            std += Math.pow(paymentDelay - m, 2);
        }
        // Se divide el numero entre los datos y se saca la raíz cuadrada.
        return Math.sqrt(std / paymentDelays.length);
    }

    /**
     * Calcular media del array
     *
     * @param datos
     * @return
     */
    public static double media(int[] datos) {
        double suma = 0;
        for (int i : datos) {
            suma += i;
        }
        return suma / datos.length;

    }

    public int paymentDelayMaxPeakIndex(int[] paymentDelays) {
        //TODO implement.
        //System.out.println();
        return -1;
    }

    public double[] latePaymentProbabilityByPeriod(int[][] paymentDelays) {
        // Obtener la cantidad de productos
        final int productos = paymentDelays.length;
        // Obtener la cantidad de periodos
        final int periodos = paymentDelays[0].length;
        // Calcular la probabilidad 
        final double probabilidad = 1.0 / productos;
        // Inicializar un nuevo arreglo con la cantidad de periodos.
        double[] arrayProbabilidadPorPeriodo = new double[periodos];

        // Recorrer cada producto
        for (int[] paymentDelay : paymentDelays) {
            // Recorrer cada periodo
            for (int j = 0; j < periodos; j++) {
                // Si es mayo a cero se calcula la probabilidad  y se suma.
                if (paymentDelay[j] > 0) {
                    arrayProbabilidadPorPeriodo[j] += probabilidad;
                }
            }
        }
        return arrayProbabilidadPorPeriodo;
    }
}
