/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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
package org.japo.java.main;

import org.japo.java.app.App;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public final class Main {
    //Clave acceso
    private static final String ACCESS_UID = "JAPO-Omicron-0";

    //Punto entrada al programa
    public static final void main(String[] args) {
        if (args.length == 1 && args[0].equals(ACCESS_UID)) {
            App app = new App();
            app.launchApp();
        } else {
            System.out.println("Acceso denegado");
            System.out.println("---");
            System.out.println("Contacte con el servicio Técnico");
        }

    }
}
