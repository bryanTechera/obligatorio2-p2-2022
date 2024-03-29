/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

public class Deposito implements Serializable {

    private static int ultimoDeposito = 0;
    private int tamaño;
    private boolean estante;
    private boolean refrigerado;
    private boolean alquilado;
    private int id;

    public Deposito(int id, int tamaño, boolean estante, boolean refrigerado) throws Exception {
        this.Validar(tamaño);
        this.id = id;
        this.tamaño = tamaño;
        this.estante = estante;
        this.refrigerado = refrigerado;
        this.alquilado = false;
        if (id < ultimoDeposito) {
            throw new Exception("El numero de los depositos debe esta especificados de forma ascendente en el archivo de entrada");
        } else {
            ultimoDeposito = id;
        }
    }

    public Deposito(int tamaño, boolean estante, boolean refrigerado) throws Exception {
        this.Validar(tamaño);
        this.id = ultimoDeposito + 1;
        ultimoDeposito = this.id;
        this.tamaño = tamaño;
        this.estante = estante;
        this.refrigerado = refrigerado;
        this.alquilado = false;
    }

    private void Validar(int dimension) throws Exception {
        int retorno;
        Deposito deposito;

        if (dimension < 1) {
            throw new Exception("Dimensiones para el deposio no validas");
        }
    }

    public int getId() {
        return id;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean esEstante() {
        return estante;
    }

    public boolean esRefrigerado() {
        return refrigerado;
    }

    private void setId(int unId) {
        this.id = unId;
    }

    private void setTamaño(int unTamaño) {
        this.tamaño = unTamaño;
    }

    private void setEstante(boolean unEstante) {
        this.estante = unEstante;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    private void setRefrigerado(boolean unRefrigerado) {
        this.refrigerado = unRefrigerado;
    }

    private String estadoEstantes() {
        String estadoEstantes = "";
        if (this.estante == true) {
            estadoEstantes = " Con Estantes ";
        } else {
            estadoEstantes = " Sin Estantes ";
        }
        return estadoEstantes;
    }

    private String estadoRefrigerado() {
        String estadoRefrigerado = "";
        if (this.refrigerado == true) {
            estadoRefrigerado = "Refrigerado";
        } else {
            estadoRefrigerado = "No Refrigerado";
        }
        return estadoRefrigerado;
    }

    @Override
    public String toString() {
        return "Num: " + this.id + "( " + tamaño + " m2) " + estadoRefrigerado() + " " + estadoEstantes();
    }
}
