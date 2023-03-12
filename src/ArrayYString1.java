public class ArrayYString1 {
    public static int cantApariciones (String texto, char letra) {
        int cont = 0;
        char [] arregloTexto = texto.toCharArray();
        for (int i = 0; i < arregloTexto.length; i++){
            if (arregloTexto[i]==letra){
                cont++;
            }
        }
        return cont;
    }

    public static int [] ordenarNumeros(int n1, int n2, int n3, char orden){
        int[]ordenados = new int[3];
        if (orden=='a'){
            if(n1<n2 && n1<n3){
                ordenados[0]=n1;
                if(n2<n3){
                    ordenados[1]=n2;
                    ordenados[2]=n3;
                } else {
                    ordenados[1]=n3;
                    ordenados[2]=n2;
                }
            } else {
                if (n2<n3){
                    ordenados[0]=n2;
                    if(n1<n3){
                        ordenados[1]=n1;
                        ordenados[2]=n3;
                    } else {
                        ordenados[1]=n3;
                        ordenados[2]=n1;
                    }
                } else {
                    ordenados[0]=n3;
                    if(n1<n2){
                        ordenados[1]=n1;
                        ordenados[2]=n2;
                    } else {
                        ordenados[1]=n2;
                        ordenados[2]=n1;
                    }
                }
            }
        } else{
            if(n1>n2 && n1>n3){
                ordenados[0]=n1;
                if(n2>n3){
                    ordenados[1]=n2;
                    ordenados[2]=n3;
                } else {
                    ordenados[1]=n3;
                    ordenados[2]=n2;
                }
            } else {
                if (n2>n3){
                    ordenados[0]=n2;
                    if(n1>n3){
                        ordenados[1]=n1;
                        ordenados[2]=n3;
                    } else {
                        ordenados[1]=n3;
                        ordenados[2]=n1;
                    }
                } else {
                    ordenados[0]=n3;
                    if(n1>n2){
                        ordenados[1]=n1;
                        ordenados[2]=n2;
                    } else {
                        ordenados[1]=n2;
                        ordenados[2]=n1;
                    }
                }
            }
        }
        return ordenados;
    }

    public static int sumaMayorX (int [] vector, int x){
        int suma = 0;
        for (int nro:vector){
            if(nro>x){
                suma += nro;
            }
        }
        return suma;
    }
}
