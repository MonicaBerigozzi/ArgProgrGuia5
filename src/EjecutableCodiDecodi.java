import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjecutableCodiDecodi {
    public static void main (String[]args) throws IOException {
        if (args.length== 4){
            Path archEntrada = Paths.get(args[2]);
            Path archSalida = Paths.get(args[3]);
            int desplaz = Integer.parseInt(args[1]);
            Scanner scnArch = new Scanner(archEntrada);
            if (Files.exists(archEntrada) && Files.exists(archSalida) && Files.isReadable(archEntrada) &&
                    Files.isWritable(archSalida)) {
                if (args[0].charAt(0) == 'c') {
                    if (scnArch.hasNextLine()){
                        Files.writeString(archSalida,ArrayYString2.codificacion(scnArch.nextLine(),desplaz));
                        System.out.println("Archivo codificado con éxito");
                    } else {
                        System.out.println("No hay texto que codificar");
                    }
                } else {
                    if (scnArch.hasNextLine()){
                        Files.writeString(archSalida,ArrayYString2.decodificacion(scnArch.nextLine(),desplaz));
                        System.out.println("Archivo decodificado con éxito");
                    } else {
                        System.out.println("No hay texto que decodificar");
                    }
                }
            } else {
                System.out.println("El archivo no existe");
            }
        } else {
            System.out.println("No se proporcionan los datos necesarios");
        }
    }
}
