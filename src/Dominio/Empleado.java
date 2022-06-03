/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
/**
 *
 * @author Bryan
 */
public class Empleado{

    private String nombre;
    private String cedula;
    private String direccion;
    private int anioIngreso;
    private String telefono;

    public Empleado(String nombre, String cedula, String direccion, int anioIngreso, String telefono) throws Exception {
        this.Validar(nombre, cedula, direccion, anioIngreso, telefono);
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.anioIngreso = anioIngreso;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    private void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getTelefono() {
        return telefono;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    private void setCedula(String unaCedula) {
        this.cedula = unaCedula;
    }

    private void Validar(String nombre, String cedula, String direccion, int anioIngreso, String telefono) throws Exception {
        if (nombre.length() < 1 && cedula.length() < 1 && direccion.length() < 1 && anioIngreso < 1 && telefono.length() < 1) {
            throw new Exception("Existen errores en los datos ingresados");
        }
    }
    @Override
    public String toString() {
        return nombre;
    }

}
