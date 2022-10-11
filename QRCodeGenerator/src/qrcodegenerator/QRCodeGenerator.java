/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qrcodegenerator;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author deven
 */
public class QRCodeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String details = "Devendra Johari :  Front End Developer.......";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        File f = new File("C:\\Users\\deven\\OneDrive\\Documents\\QRCode\\MyChannel.jpg");
        
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();        
        
    }
    
}
