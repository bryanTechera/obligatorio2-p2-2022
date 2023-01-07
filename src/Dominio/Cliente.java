/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nombre;
    private String cedula;
    private String mail;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    private void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    private void setCedula(String unaCedula) {
        this.cedula = unaCedula;
    }

    private void setMail(String unMail) {
        this.mail = unMail;
    }

    private void setTelefono(String unTelefono) {
        this.telefono = unTelefono;
    }

    public Cliente(String nombre, String cedula, String mail, String telefono) throws Exception {
        this.Validar(nombre, cedula, mail, telefono);
        this.nombre = nombre;
        this.cedula = cedula;
        this.mail = mail;
        this.telefono = telefono;
    }

    private void Validar(String nombre, String cedula, String mail, String telefono) throws Exception {
        int retorno;
        Deposito deposito;
        if (nombre.length() < 1 || cedula.length() < 1 || mail.length() < 1 || telefono.length() < 1) {
            throw new Exception("Existen errores en los datos ingresados");
        } else {
            int numCedula=-1;
            int numTel=-1;
            try {
                numCedula = Integer.parseInt(cedula);
            } catch (NumberFormatException e) {
                String error = "";
                if(numCedula==-1){
                    error = "El campo cédula debe ser numérico";
                }else if(numTel==-1){
                    error = "El campo teléfono debe ser numérico";
                }
                throw new Exception(error);
            }
        }
    }

    @Override
    public String toString() {
        return nombre + " C.I.: " + cedula;
    }

}
