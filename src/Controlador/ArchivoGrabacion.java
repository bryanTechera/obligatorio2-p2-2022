/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;


public class ArchivoGrabacion {
    private Formatter out;

  public ArchivoGrabacion(String unNombre) throws FileNotFoundException {
      out = new Formatter(unNombre);
  }

  public ArchivoGrabacion(String unNombre, boolean ext) throws IOException {
    // si el parametro es true extiendo el archivo
    // de lo contrario sobreescribo
      FileWriter f = new FileWriter(unNombre, ext);
      out = new Formatter(f);
  }

  public void grabarLinea(String linea) {
    out.format("%s%n", linea);
  }

  public void cerrar() {
    out.close();
  }
}
