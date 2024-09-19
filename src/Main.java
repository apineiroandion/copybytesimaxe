import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream("/home/dam/Desktop/copybytesimaxe/foto.jpg");
            //fos = new FileOutputStream("/home/dam/Desktop/copybytesimaxe/foto2.jpg");
            //Ponemos true para que no sobreescriba el archivo
            fos = new FileOutputStream("/home/dam/Desktop/copybytesimaxe/foto2.jpg", true);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
