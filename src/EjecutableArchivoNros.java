import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjecutableArchivoNros {
    public static void main (String[]args) throws IOException {
        if (args.length==1){
            Path arch = Paths.get(args[0]);
            if (Files.exists(arch) && Files.isReadable(arch)){
                Scanner scnArch = new Scanner(arch);
                int suma = 0;
                while (scnArch.hasNextLine()){
                    String ln = scnArch.nextLine();
                    suma += Integer.parseInt(ln);
                }
                System.out.println("La suma de los números del archivo es: "+ suma);
            } else {
                System.out.println("El archivo no existe");
            }
        } else {
            System.out.println("No se recibieron parámetros");
        }
    }
}
