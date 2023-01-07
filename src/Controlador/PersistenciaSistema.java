/*Bryan Techera #271868  Martín Lores #285463
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistenciaSistema {
    
    public static void persistirSistema(Sistema objeto, String nombreDatos) throws FileNotFoundException, IOException {
    
      FileOutputStream dataOut = new FileOutputStream(nombreDatos);
      ObjectOutputStream out = new ObjectOutputStream(dataOut);
      out.writeObject(objeto);
      out.close();
  }
    
  public static Object recuperarSistema(String nombreDatos) throws FileNotFoundException, IOException, ClassNotFoundException {
    
      FileInputStream dataIn = new FileInputStream(nombreDatos);
      ObjectInputStream in = new ObjectInputStream(dataIn);
      Object obj = in.readObject();
      in.close();
      return obj;
    
   
  }  
    
    
}
