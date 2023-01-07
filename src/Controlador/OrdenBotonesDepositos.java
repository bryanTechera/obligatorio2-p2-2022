/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Deposito;
import java.util.Comparator;


public class OrdenBotonesDepositos implements Comparator<Deposito> {

    @Override
    public int compare(Deposito deposito1, Deposito deposito2) {

        int retorno = 0;
        if (deposito1.getId() < deposito2.getId()) {
            retorno = -1;
        } else if (deposito1.getId() > deposito2.getId()) {
            retorno = 1;

        } else {
            retorno = 0;
        }
        return retorno;
    }

}
