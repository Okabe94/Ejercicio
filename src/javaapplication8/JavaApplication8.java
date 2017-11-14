package javaapplication8;


public class JavaApplication8 {


    public static void main(String[] args) {
        System.out.println("Hola desde Master");
       
    }

    public static int cantidadOcupada(String[] vec) {
        int cantidad = 0;
        for (String vec1 : vec) {
            if (vec1 == null) {
                break;
            }
            cantidad++;
        }
        return cantidad;
    }

    public static String imprimir(String[] vec) {
        String c = "";
        for (String v : vec) {
            c = c + v + " - ";
        }
        return c;
    }

    public static String imprimir(String[] vec, int cantidad) {
        String c = "";
        for (int i = 0; i < cantidad; i++) {
            c = c + vec[i] + " - ";
        }
        return c;
    }

}
