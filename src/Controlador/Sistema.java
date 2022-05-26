/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Cliente;
import Dominio.Deposito;
import Dominio.Empleado;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Bryan
 */
public class Sistema extends Observable {

    private static HashMap<String, Cliente> clientes;
    private static HashMap<String, Empleado> empleados;
    private static HashMap<Integer, Deposito> depositos;

    public Sistema() {
        this.clientes = new HashMap<String, Cliente>();
        this.empleados = new HashMap<String, Empleado>();
        this.depositos = new HashMap<Integer, Deposito>();
    }

    public void registrarDeposito(int dimension, boolean estantes, boolean refrigerado) throws Exception {
        Deposito deposito = new Deposito(dimension, estantes, refrigerado);
        this.getDepositos().put(deposito.getId(), deposito);
        this.notifyObservadores(this.getDepositos().toString());
    }

    public void registrarEmpleado(String nombre, String cedula, String direccion, int anioIngreso, String telefono) throws Exception {
        Empleado empleado = new Empleado(nombre, cedula, direccion, anioIngreso, telefono);
        this.getEmpleados().put(empleado.getCedula(), empleado);
        this.notifyObservadores("empleado");
    }

    public void registrarCliente(String nombre, String cedula, String mail, String telefono) throws Exception {
        Cliente cliente = new Cliente(nombre, cedula, mail, telefono);
        this.getClientes().put(cliente.getCedula(), cliente);
        this.notifyObservadores("cliente");
    }

    private void notifyObservadores(String cambio) {
        setChanged();
        notifyObservers(cambio);
    }

    public HashMap<String, Empleado> getEmpleados() {
        return this.empleados;
    }

    public HashMap<String, Cliente> getClientes() {

        return this.clientes;
    }

    public HashMap<Integer, Deposito> getDepositos() {
        return this.depositos;
    }

    public void agregarVentanaObservador(Observer ventana){
        this.addObserver(ventana);
    }
}
