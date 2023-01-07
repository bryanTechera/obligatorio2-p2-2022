/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArchivoLectura {

    private Scanner in;
    private String linea;

    public ArchivoLectura(String unNombre) {
        try {
            in = new Scanner(Paths.get(unNombre));
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
            System.exit(1);
        }
    }

    public boolean hayMasLineas() {
        boolean hay = false;
        linea = null;
        if (in.hasNext()) {
            linea = in.nextLine();
            hay = true;
        }
        return hay;
    }

    public String linea() {
        // devuelve la ultima linea
        return linea;
    }

    public void cerrar() {
        in.close();
    }
}
