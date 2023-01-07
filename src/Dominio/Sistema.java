//Bryan Techera #271868  Martín Lores #285463
package Dominio;

import Controlador.ArchivoGrabacion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;

public class Sistema extends Observable implements Serializable {

    private HashMap<String, Cliente> clientes;
    private HashMap<String, Empleado> empleados;
    private HashMap<Integer, Deposito> depositos;
    private HashMap<Integer, Contrato> contratos;
    private ArrayList<Visita> visitas;

    public Sistema() {
        this.clientes = new HashMap<String, Cliente>();
        this.empleados = new HashMap<String, Empleado>();
        this.depositos = new HashMap<Integer, Deposito>();
        this.contratos = new HashMap<Integer, Contrato>();
        this.visitas = new ArrayList<Visita>();

    }

    public void registrarDeposito(int dimension, boolean estantes, boolean refrigerado) throws Exception {
        Deposito deposito = new Deposito(dimension, estantes, refrigerado);
        this.getDepositos().put(deposito.getId(), deposito);
        this.notifyObservadores("deposito");

    }

    public void registrarEmpleado(String nombre, String cedula, String direccion, String anioIngreso, String telefono) throws Exception {
        if (this.getEmpleados().containsKey(cedula)) {
            throw new Exception("Ya existe un empleado con la cedula: " + cedula);
        }
        Empleado empleado = new Empleado(nombre, cedula, direccion, anioIngreso, telefono);
        this.getEmpleados().put(empleado.getCedula(), empleado);
        this.notifyObservadores("empleado");
    }

    public void registrarCliente(String nombre, String cedula, String mail, String telefono) throws Exception {
        if (this.getClientes().containsKey(cedula)) {
            throw new Exception("Ya existe un cliente con la cedula: " + cedula);
        }
        Cliente cliente = new Cliente(nombre, cedula, mail, telefono);
        this.getClientes().put(cliente.getCedula(), cliente);
        this.notifyObservadores("cliente");
    }

    public void registrarContrato(Empleado empleado, Cliente cliente, List<Deposito> deposito, String descripcion) throws Exception {

        verificacionEmpleado(empleado);
        verificacionCliente(cliente);

        String error = "";

        if (deposito.isEmpty()) {
            error = "Debe seleccionar un deposito";
        }
        if (!error.equals("")) {
            throw new Exception(error);
        }

        for (int i = 0; i < deposito.size(); i++) {
            Contrato contrato = new Contrato(empleado, cliente, deposito.get(i), descripcion);
            this.getContratos().put(contrato.getId(), contrato);
        }
        this.notifyObservadores("contratos");
    }

    public void registrarVisita(Cliente cliente, Empleado empleado, Contrato contrato, int dia, int mes) throws Exception {

        verificacionEmpleado(empleado);
        verificacionCliente(cliente);

        String error = "";
        if (contrato == null) {
            error = "Debe seleccionar un contrato";
        } else if (dia == 0 || mes == 0) {
            error = "Debe seleccionar una fecha";
        }
        if (!error.equals("")) {
            throw new Exception(error);
        }

        Visita visita = new Visita(cliente, empleado, contrato, dia, mes);

        this.getVisitas().add(visita);
        this.notifyObservadores("visita");
    }

    public void eliminarVisita(int numContrato) {
        Iterator it = visitas.iterator();
        boolean encontrado = false;
        Visita vis;
        while (it.hasNext() && !encontrado) {
            vis = (Visita) it.next();
            if (vis.getContrato().getId() == numContrato) {
                visitas.remove(vis);
                encontrado = true;
            }
        }
        this.notifyObservadores("visita");
    }

    public void eliminarContrato(int numContrato) {
        contratos.remove(numContrato);
        this.notifyObservadores("contratos");
    }

    public void eliminarDeposito(int numDeposito) {
        depositos.remove(numDeposito);
        this.notifyObservadores("deposito");
    }

    public ArchivoGrabacion grabar(String unNombre) throws FileNotFoundException, IOException {
        // si el parametro es true extiendo el archivo
        // de lo contrario sobreescribo
        return new ArchivoGrabacion(unNombre, true);
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

    public void setDepositos(HashMap<Integer, Deposito> deposEntrada) {
        this.depositos = deposEntrada;
    }

    public HashMap<Integer, Contrato> getContratos() {
        return this.contratos;
    }

    public Contrato getContrato(int idDeposito) {
        Collection<Contrato> coleccionDeContratos = contratos.values();
        Iterator it = coleccionDeContratos.iterator();
        Contrato miContrato = null;
        while (it.hasNext() && miContrato == null) {

            miContrato = (Contrato) it.next();

            if (miContrato.getDeposito().getId() != idDeposito) {
                miContrato = null;
            }
        }

        return miContrato;
    }

    public ArrayList<Visita> getVisitas() {
        return this.visitas;
    }

    public void agregarVentanaObservador(Observer ventana) {
        this.addObserver(ventana);
    }

    public String verificacionEmpleado(Empleado empleado) throws Exception {
        String error = "";
        if (empleado == null) {
            error = "Debe seleccionar un empleado";
        }
        if (!error.equals("")) {
            throw new Exception(error);
        }
        return error;
    }

    public String verificacionCliente(Cliente cliente) throws Exception {
        String error = "";
        if (cliente == null) {
            error = "Debe seleccionar un cliente";
        }
        if (!error.equals("")) {
            throw new Exception(error);
        }
        return error;
    }

    public DefaultListModel getModeloEmpleado() {
        DefaultListModel modeloDeListaEmpl = new DefaultListModel();
        modeloDeListaEmpl.addAll(this.empleados.values());
        return modeloDeListaEmpl;
    }

    public DefaultListModel getModeloDeposito() {
        DefaultListModel modeloDeListaDep = new DefaultListModel();
        modeloDeListaDep.addAll(this.depositos.values());
        return modeloDeListaDep;
    }

    public DefaultListModel getModeloCliente() {
        DefaultListModel modeloDeListaCliente = new DefaultListModel();
        modeloDeListaCliente.addAll(this.clientes.values());
        return modeloDeListaCliente;
    }

    public DefaultListModel getModeloContrato() {
        DefaultListModel modeloDeListaContarto = new DefaultListModel();
        modeloDeListaContarto.addAll(this.contratos.values());
        return modeloDeListaContarto;
    }

}
