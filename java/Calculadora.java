
import java.util.Scanner;

/**
 *
 * @author clase
 */
public class Calculadora {

    static Scanner teclado = new Scanner(System.in);

    static double sumar(double num1, double num2) {

        return num1 + num2;
    }

    static double restar(double num1, double num2) {

        return num1 - num2;
    }

    static double multiplicar(double num1, double num2) {

        return num1 * num2;
    }

    static double dividir(double num1, double num2) {
        double resultado = 0;
        if (num2 == 0) {
            System.out.println("Error, no se puede dividir entre 0");
        } else {
             resultado = num1 / num2;
        }
        return resultado;
    }

    /**
     *
     */
    static public void mostrarMenu() {
        System.out.println("Introduce una de las siguientes opciones: \n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir");

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        double num1;
        double num2;

        System.out.println("Introduce el primer numero");
        num1 = teclado.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = teclado.nextDouble();

        mostrarMenu();

        int opc = teclado.nextInt();

        do {
            switch (opc) {
                case 1:
                    System.out.println(sumar(num1, num2));
                    break;
                case 2:
                    System.out.println(restar(num1, num2));
                    break;
                case 3:
                    System.out.println(multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(dividir(num1, num2));
                    break;
                default:
                    System.err.println("No es una opcion valida");
                    break;
            }
            mostrarMenu();
            opc = teclado.nextInt();
        } while (opc
                != 5);
    }
}
