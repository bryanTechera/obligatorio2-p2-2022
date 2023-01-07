/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

public class Visita implements Serializable {

    private Cliente cliente;
    private Empleado empleado;
    private Contrato contrato;
    private int dia;
    private int mes;

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setCliente(Cliente unCliente) {
        this.cliente = unCliente;
    }

    public void setEmpleado(Empleado unEmpleado) {
        this.empleado = unEmpleado;
    }

    public void setContrato(Contrato unContrato) {
        this.contrato = unContrato;
    }

    public void setDia(int unDia) {
        this.dia = unDia;
    }

    public void setMes(int unMes) {
        this.mes = unMes;
    }

    public Visita(Cliente cliente, Empleado empleado, Contrato contrato, int dia, int mes) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.contrato = contrato;
        this.dia = dia;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNombre() + ", empleado: " + empleado.getNombre() + ",día: " + this.dia + ",mes: " + this.mes;
    }

}
