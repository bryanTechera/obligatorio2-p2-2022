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
    private Empleado empleado;
    private Cliente cliente;
    private Deposito deposito;
    public Contrato(Empleado empleado,Cliente cliente,Deposito deposito){
        
        this.empleado=empleado;
        this.cliente=cliente;
        this.deposito=deposito;
        this.deposito.setAlquilado(true);
    }
    
}
