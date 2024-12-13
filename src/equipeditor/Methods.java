package equipeditor;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;


public class Methods {
    
    private File archivoSlus; //Variable privada para encapsular y acceder con getter y setter
    
    public void setArchivo(File xSlus) {
        archivoSlus = xSlus;
    }
    
    public File getArchivo() {
        return archivoSlus;
    }
    
    public void ChangeMega(File slus, short valor1) {
        
        byte byteAlto = (byte) ((valor1 >> 8) & 0xFF); //Extraemos el byte más significativo
        byte byteBajo = (byte) (valor1 & 0xFF) ; //Extraemos el byte menos significativo
        
        //Tomamos el archivo para empezar a sobreescribir
        try(RandomAccessFile archivo = new RandomAccessFile(slus, "rw")) {
            
            archivo.seek(0xB020); //Se posiciona en el puntero indicado
            archivo.writeByte(byteBajo); //Sobreescribe esa dirección
            
            archivo.seek(0xB021); //Se posiciona en el puntero indicado
            archivo.writeByte(byteAlto); //Sobreescribe esa dirección
            
            JOptionPane.showMessageDialog(null, "Your file has been modified successfully!");
            
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, "Operation failed, the file could not be modified!");
            
          }
    }
    
    public void changeOthers(File slus, short valor2) {
        
        byte byteAlto = (byte) ((valor2 >> 8) & 0xFF); //Extraemos el byte más significativo
        byte byteBajo = (byte) (valor2 & 0xFF) ; //Extraemos el byte menos significativo
        
        //Tomamos el archivo para empezar a sobreescribir
        try(RandomAccessFile archivo = new RandomAccessFile(slus, "rw")) {
            
            archivo.seek(0xAFF8); //Se posiciona en el puntero indicado
            archivo.writeByte(byteBajo); //Sobreescribe esa dirección
            
            archivo.seek(0xAFF9); //Se posiciona en el puntero indicado
            archivo.writeByte(byteAlto); //Sobreescribe esa dirección
            
            JOptionPane.showMessageDialog(null, "Your file has been modified successfully!");
            
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(null, "Operation failed, the file could not be modified!");
            
          }
    }
    
}
