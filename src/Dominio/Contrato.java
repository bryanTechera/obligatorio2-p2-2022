/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;


public class Contrato implements Serializable{

    private static int ultimoContrato = 0;
    private Empleado empleado;
    private Cliente cliente;
    private Deposito deposito;
    private int id;
    private String descripcion;

    public Contrato(Empleado empleado, Cliente cliente, Deposito deposito, String descripcion) {
        this.id = ultimoContrato + 1;
        ultimoContrato = this.id;
        this.empleado = empleado;
        this.cliente = cliente;
        this.deposito = deposito;
        this.deposito.setAlquilado(true);
        this.descripcion = descripcion;
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

    private void setDeposito(Deposito uneposito) {
        this.deposito = deposito;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    

    @Override
    public String toString(){
    return "Contrato nº: " + this.id + " Deposito: " + deposito.getId() + " Registrador por: " + empleado.getNombre() 
            + ". Cliente: " + cliente.getNombre() + " - C.I.: " + cliente.getCedula() ;
    }
    
}
