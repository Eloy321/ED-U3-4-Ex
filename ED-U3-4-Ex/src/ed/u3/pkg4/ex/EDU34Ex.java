package ed.u3.pkg4.ex;

/**
 * La clase EDU34Ex su funcion es sumar.
 *
 * @author Eloy Beltrán López
 */
public class EDU34Ex {

    /**
     * @param args Comando de línea de argumentos.
     */
    /**
     * Metodo suma: Suma dos números enteros a y b.
     *
     * @param a Primer numero entero que va a sumar.
     * @param b Segundo numero entero que va a sumar.
     * @return Resultado de la suma (a+b).
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    /**
     * Metodo suma: Suma dos números decimales a y b.
     *
     * @param a Primer numero decimal que va a sumar.
     * @param b Segundo numero decimal que va a sumar.
     * @return Resultado de la suma (a+b).
     */
    public static double suma(double a, double b) {
        return a + b;
    }

    /**
     * Metodo divide: Divide dos números decimales a y b.
     *
     * @param a Primer numero decimal que va a dividir.
     * @param b Segundo numero decimal que va a sumar.
     * @return Resultado de la división (a/b)
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("División por cero!");
        }
        return a / b;
    }

    /**
     * Metodo main
     *
     * @param args
     */
    public static void main(String[] args) {

        
    }

}
