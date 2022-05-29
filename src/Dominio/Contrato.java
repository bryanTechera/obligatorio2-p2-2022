/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author Bryan
 */
public class Contrato {

    private static int ultimoContrato = 0;
    private Empleado empleado;
    private Cliente cliente;
    private Deposito deposito;
    private int id;

    public Contrato(Empleado empleado, Cliente cliente, Deposito deposito) {
        this.id = ultimoContrato + 1;
        ultimoContrato = this.id;
        this.empleado = empleado;
        this.cliente = cliente;
        this.deposito = deposito;
        this.deposito.setAlquilado(true);
    }

    public int getId() {
        return id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    private void setId(int unId) {
        this.id = unId;
    }

    private void setEmpleado(Empleado unEmpleado) {
        this.empleado = unEmpleado;
    }

    private void setCliente(Cliente unCliente) {
        this.cliente = unCliente;
    }

    public void setDeposito(Deposito uneposito) {
        this.deposito = deposito;
    }

}
