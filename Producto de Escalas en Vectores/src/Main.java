import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las componentes del vector a
        System.out.println("Ingrese las componentes del vector a de tres dígitos uno por uno:");
        int[] a = leerVector(scanner);

        // Pedir al usuario que ingrese las componentes del vector b
        System.out.println("Ingrese las componentes del vector b de tres dígitos uno por uno:");
        int[] b = leerVector(scanner);

        // Calcular el producto de escalas entre los vectores a y b
        int productoDeEscalas = calcularProductoDeEscalas(a, b);

        // Mostrar el resultado
        System.out.println("El producto de escalas entre los vectores a y b es: " + productoDeEscalas);

        scanner.close();
    }

    // Método para leer un vector desde la entrada estándar
    public static int[] leerVector(Scanner scanner) {
        int[] vector = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el componente " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    // Método para calcular el producto de escalas entre dos vectores
    public static int calcularProductoDeEscalas(int[] a, int[] b) {
        // Verificar que los vectores tengan la misma longitud
        if (a.length != b.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud");
        }

        // Inicializar el producto de escalas
        int productoDeEscalas = 0;

        // Calcular el producto de escalas sumando el producto de las componentes correspondientes
        for (int i = 0; i < a.length; i++) {
            productoDeEscalas += a[i] * b[i];
        }

        return productoDeEscalas;


    }
}