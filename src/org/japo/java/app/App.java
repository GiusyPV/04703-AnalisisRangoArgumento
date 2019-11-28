/*
 * Copyright 2019 Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //COnstantes Clase
    public static final double NUM = 0;
    public static final double MIN = 1;
    public static final double MAX = 10;

    //Constantes switch
    public static final String DENTRO = "DENTRO";
    public static final String FUERA_ABAJO = "FUERA ( Abajo )";
    public static final String FUERA_ARRIBA = "FUERA ( Arriba )";

    //Constantes mensaje
    public static final String MSG_USR = "Número ......: ";
    public static final String MSG_OUT = "";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    public final void launchApp() {

        //Cabecera
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");

        //Introducción número
        int n = leerNumero(MSG_USR, MSG_ERR);

        //Separador
        System.out.println("---");

        //Minimos y máximos
        System.out.printf("Mínimo ......: %.0f%n", MIN);
        System.out.printf("Máximo ......: %.0f%n", MAX);
        
        //Separador
        System.out.println("---");
        
        //Analisis dentro o fuera
        String fin =  analizarRango(n, MIN, MAX);
        
        //Salir por pantalla dentro o fuera
        System.out.printf("Análisis ....: %s%n", fin);

    }

    public static final String analizarRango(double num, double min, double max) {

        String test;

        if (num < min) {
            test = FUERA_ABAJO;
        } else if (num <= max) {
            test = DENTRO;
        } else {
            test = FUERA_ARRIBA;
        }

        return test;
    }

    //Metodo obtener número de usuario
    public static final double obtener(String msgUsr, String msgErr) {
        double numero = 0;
        boolean errorOK = true;

        do {
            try {

                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                errorOK = false;

            } catch (Exception e) {
                System.out.println(msgErr);

            } finally {
                SCN.nextLine();
            }

        } while (errorOK);
        return numero;
    }

    public static final int leerNumero(String msgUsr, String msgErr) {
        return (int) obtener(msgUsr, msgErr);
    }

}
