/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Visita;
import java.util.Comparator;


public class OrdenVisit implements Comparator<Visita> {

    @Override
    public int compare(Visita visita1, Visita visita2) {

        int retorno = 0;
        if (visita1.getMes() < visita2.getMes()) {
            retorno = -1;
        } else if (visita1.getMes() > visita2.getMes()) {
            retorno = 1;

        } else {
            if (visita1.getDia() < visita2.getDia()) {
                retorno = -1;
            } else if (visita1.getDia() > visita2.getDia()) {
                retorno = 1;
            } else {
                retorno = 0;
            }
        }
        System.out.println("entra a compare");
        return retorno;
    }

   
}


