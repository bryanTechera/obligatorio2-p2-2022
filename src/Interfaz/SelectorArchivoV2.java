/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class SelectorArchivoV2 {

    public static String mostrarSelectorArchivo() {
        //creo fileChooser con ruta para abrir en el escritorio de la pc.
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());  
        jfc.setVisible(true);
        //muestro fileChooser en modo abrir archivo.
        int opcion = jfc.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            //usuario seleccionó confirmar
            File archivoSelecionado = jfc.getSelectedFile();
            return archivoSelecionado.getAbsolutePath();
        } else {
            //usuario seleccionó cancelar
            jfc.setVisible(false);
            return "";
        }
    }
}
