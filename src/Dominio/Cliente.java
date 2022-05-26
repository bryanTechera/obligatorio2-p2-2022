/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

public class Cliente {

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

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public void setCedula(String unaCedula) {
        this.cedula = unaCedula;
    }

    public void setMail(String unMail) {
        this.mail = unMail;
    }

    public void setTelefono(String unTelefono) {
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
        if (nombre.length() < 1 && cedula.length() < 1 && mail.length() < 1 && telefono.length() < 1) {
            throw new Exception("Existen errores en los datos ingresados");
        }
    }

    @Override
    public String toString() {
        return cedula+" "+ nombre;
    }
    
    

}
