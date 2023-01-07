/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;

public class Empleado implements Serializable {

    private String nombre;
    private String cedula;
    private String direccion;
    private String anioIngreso;
    private String telefono;

    public Empleado(String nombre, String cedula, String direccion, String anioIngreso, String telefono) throws Exception {
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

    public String getAnioIngreso() {
        return anioIngreso;
    }

    private void setAnioIngreso(String anioIngreso) {
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

    private void Validar(String nombre, String cedula, String direccion, String anioIngreso, String telefono) throws Exception {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        
        int numA= -1;
        if (nombre.length() < 1 || cedula.length() < 1 || direccion.length() < 1 || anioIngreso.length()<1 || telefono.length() < 1) {
            throw new Exception("Existen errores en los datos ingresados");
        }
        else {
            int numCedula = -1;
            
            int numTel=-1;
            try {
                numCedula = Integer.parseInt(cedula);
                numA = Integer.parseInt(anioIngreso);
                numTel = Integer.parseInt(telefono);
            } catch (NumberFormatException e) {
                String error = "";
                if (numCedula == -1) {
                    error = "El campo cédula debe ser numérico";
                }else if(numA ==-1){
                    error = "El campo Año de ingreso debe ser numérico";
                }else if(numTel ==-1){
                    error = "El campo Teléfono debe ser numérico";
                }
                throw new Exception(error);

            }
        }
        if(numA<1950 || numA>anioActual){
            throw new Exception ("Año de ingreso no valido");
        }

    }

    @Override
    public String toString() {
        return nombre + " C.I.: " + cedula;
    }

}
