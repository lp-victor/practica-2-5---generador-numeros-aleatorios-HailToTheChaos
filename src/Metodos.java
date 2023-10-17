
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Metodos {

    public static int generarNumero(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0) {
                return false;
            }
        }

        return true;
    }

    public static void guardarEnFichero(ArrayList<String> entrada, File fichero, boolean append) {

        try {
            fichero.createNewFile();
            FileWriter file = new FileWriter(fichero, append);

            for (int i = 0; i < entrada.size(); i++) {
                file.write(entrada.get(i));
                file.write("\n");
            }
            if (file != null) {
                file.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<String> leerFichero(File fichero) {
        ArrayList<String> historial = new ArrayList();

        try {
            Scanner sc = new Scanner(fichero);

            while (sc.hasNext()) {
                historial.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historial;
    }
}
