public class ArrayYString2 {
   public static String codificacion (String texto, int desplazamiento){
       String resultado;
       int pos=0;
       char [] arregloTexto = texto.toCharArray();
       char [] res= new char[arregloTexto.length];
       char [] abece = {'a','b','c', 'd', 'e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v'
               ,'w','x','y','z',' '};
       for (int i = 0; i<arregloTexto.length;i++){
           for (int j = 0; j<abece.length;j++){
               if (arregloTexto[i]==abece[j]){
                   pos = j;
               }
           }
           if ((pos+desplazamiento)>=abece.length){
               int dif = abece.length - pos;
               pos = desplazamiento - dif;
           } else {
               pos += desplazamiento;
           }
           res[i]=abece[pos];
       }
       resultado=String.valueOf(res);
       return resultado;
   }

    public static String decodificacion (String texto, int desplazamiento){
        String resultado;
        int pos=0;
        char [] arregloTexto = texto.toCharArray();
        char [] res= new char[arregloTexto.length];
        char [] abece = {'a','b','c', 'd', 'e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v'
                ,'w','x','y','z',' '};
        for (int i = 0; i<arregloTexto.length;i++){
            for (int j = 0; j<abece.length;j++){
                if (arregloTexto[i]==abece[j]){
                    pos = j;
                }
            }
            if ((pos-desplazamiento)<0){
                int dif = pos - desplazamiento;
                pos = abece.length + dif;
            } else {
                pos -= desplazamiento;
            }
            res[i]=abece[pos];
        }
        resultado=String.valueOf(res);
        return resultado;
    }
}
