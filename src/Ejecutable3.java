import java.util.Scanner;

public class Ejecutable3 {
    public static void main (String [] args){
        int [] arreglo;
        if (args.length==4){
            arreglo = ArrayYString1.ordenarNumeros(Integer.parseInt(args[0]),Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]),args[3].charAt(0));
        } else {
            int n1, n2, n3;
            char or;
            Scanner scn = new Scanner(System.in);
            Scanner scnChar = new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            n1=scn.nextInt();
            System.out.print("Ingrese otro número: ");
            n2=scn.nextInt();
            System.out.print("Ingrese otro número: ");
            n3 = scn.nextInt();
            System.out.print("Ingrese 'a' si desea ver los números ingresados en orden ascendente y 'd' si los desea en " +
                    "orden descendente: ");
            or = scnChar.nextLine().charAt(0);
            arreglo = ArrayYString1.ordenarNumeros(n1, n2,n3, or);
        }
        for (int nro : arreglo) {
            System.out.println(nro);
        }
    }
}
