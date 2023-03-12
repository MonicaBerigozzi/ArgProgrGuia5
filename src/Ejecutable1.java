public class Ejecutable1 {
    public static void main (String [] args){
        if (args.length==4){
            int[] arreglo = ArrayYString1.ordenarNumeros(Integer.parseInt(args[0]),Integer.parseInt(args[1]),
                    Integer.parseInt(args[2]),args[3].charAt(0));
            for (int nro:arreglo){
                System.out.println(nro);
            }
        } else {
            System.out.println("Faltó incluir algún parámetro");
        }
    }
}
