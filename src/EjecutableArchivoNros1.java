import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjecutableArchivoNros1 {
    public static void main (String[]args) throws IOException {
        if (args.length==2){
            Path arch = Paths.get(args[0]);
            if (Files.exists(arch) && Files.isReadable(arch)){
                Scanner scnArch = new Scanner(arch);
                int res;
                if (args[1].equals("suma")) {
                    res = 0;
                    while (scnArch.hasNextLine()) {
                        String ln = scnArch.nextLine();
                        res += Integer.parseInt(ln);
                    }
                } else {
                    res = 1;
                    while (scnArch.hasNextLine()) {
                        String ln = scnArch.nextLine();
                        res *= Integer.parseInt(ln);
                    }
                }
                System.out.println("La "+args[1]+" de los números del archivo es: "+ res);
            } else {
                System.out.println("El archivo no existe");
            }
        } else {
            System.out.println("No se recibieron parámetros");
        }
    }
}
