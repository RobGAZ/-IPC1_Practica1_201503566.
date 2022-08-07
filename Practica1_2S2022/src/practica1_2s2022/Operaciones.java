package practica1_2s2022;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Operaciones {

    public static void Suma(float a, float b) {
        float resultado = a + b;
        int resultadoentero = (int) resultado;
        if (resultado - resultadoentero == 0) {
            System.out.println("El Resultado es: " + resultadoentero);
        } else {
            DecimalFormat formato1 = new DecimalFormat("#.00");
            System.out.println("El Resultado es:" + formato1.format(resultado));
        }

    }

    public static void Resta(float a, float b) {
        float resultado = a - b;
        int resultadoentero = (int) resultado;
        if (resultado - resultadoentero == 0) {
            System.out.println("El Resultado es: " + resultadoentero);
        } else {
            DecimalFormat formato1 = new DecimalFormat("#.00");
            System.out.println("El Resultado es:" + formato1.format(resultado));
        }

    }

    public static void Producto(float a, float b) {
        float resultado = a * b;
        int resultadoentero = (int) resultado;
        if (resultado - resultadoentero == 0) {
            System.out.println("El Resultado es: " + resultadoentero);
        } else {
            DecimalFormat formato1 = new DecimalFormat("#.00");
            System.out.println("El Resultado es:" + formato1.format(resultado));
        }

    }

    public static void Dividir(float a, float b) {
        if (b != 0) {
            float resultado = a / b;
            int resultadoentero = (int) resultado;
            if (a % b == 0) {
                System.out.println("El Resultado es: " + resultadoentero);

            } else {
                DecimalFormat formato1 = new DecimalFormat("#.00");
                System.out.println("El Resultado es:" + formato1.format(resultado));
            }

        } else {
            System.out.println("MATH ERROR ");
            System.out.println("EL DIVISOR DEBE SER DISTINTO A '0' ");
        }

    }

    public static int Potencia(int a, int b) {
        int Potencia;
        if (b == 0) {
            Potencia = 1;
        } else {
            Potencia = a * Potencia(a, b - 1);
        }
        return Potencia;

    }

    public static long Factorial(long i) {
        if (i == 0) {
            return (1);
        } else {

        }
        return i * Factorial(i - 1);
    }

    public static void valorAbs(float a) {

        int numeroentero;

        numeroentero = (int) a;

        if (a - numeroentero == 0) {
            if (a > 0) {
                System.out.println("El Valor Absoluto es: " + numeroentero);
            } else {
                System.out.println("El Valor Absoluto es: " + (-1) * numeroentero);
            }
        } else {
            if (a > 0) {

                System.out.println("El Valor Absoluto es: " + a);
            } else {
                System.out.println("El Valor Absoluto es: " + (-1) * a);
            }
        }

    }

    public static void Manual() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por Favor ingrese los siguientes valores:");
        System.out.println("Ingrese la cantidad de numeros");
        int n;
        n = teclado.nextInt();
        int manual[] = new int[n];
        try {
            if (n > 0 && n < 25) {
                for (int i = 0; i < n; i++) {

                    System.out.print("Número " + (i + 1) + ": ");
                    manual[i] = teclado.nextInt();

                }

                System.out.print("La serie de Números es: ");
                mostrar(manual);
                System.out.println("");
                media(manual);
                ordenar(manual);

            } else {
                System.out.println("Elija un Numero menor a 25");
            }
        } catch (Exception e) {
            System.out.println("INGRESE VALORES ENTEROS");
            teclado.next();

        }

    }

    public static void Random() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por Favor ingrese los siguientes valores:");
        System.out.println("Ingrese la cantidad de numeros");
        int n;
        n = teclado.nextInt();
        int random[] = new int[n];
        if (n > 0 && n < 25) {
            for (int i = 0; i < n; i++) {
                Random aleatorio = new Random();

                int Aleatorio = aleatorio.nextInt(100);

                random[i] = Aleatorio;

            }

            System.out.print("La serie de Números es: ");
            mostrar(random);
            System.out.println("");
            media(random);
            ordenar(random);

        } else {
            System.out.println("Elija un Numero menor a 25");
        }
    }

    public static void mostrar(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }

    public static void media(int a[]) {
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {

            resultado += a[i];

        }
        float media;
        media = (float) resultado / a.length;
        if (resultado % a.length == 0) {
            int mediaentero;
            mediaentero = (int) media;
            System.out.println("Media: " + mediaentero);
        } else {
            DecimalFormat formato1 = new DecimalFormat("#.00");
            System.out.println("El Resultado es:" + formato1.format(media));
        }
    }

    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < (a.length - 1); i++) {
            for (int j = 0; j < (a.length - 1); j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {

        }
        System.out.println("Maximo: " + a[a.length - 1]);
        System.out.println("Minimo: " + a[0]);

    }

    public static void ingresarA(int a[][]) {
        Scanner teclado = new Scanner(System.in);
        
        try {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");

                    a[i][j] = teclado.nextInt();
                }

            }
        } catch (Exception e) {
            System.out.println("INGRESE NUMEROS ENTEROS");
            teclado.next();
            
        }
    }

    public static void ingresarB(int a[][]) {

        Scanner teclado = new Scanner(System.in);

        try {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print("B[" + (i + 1) + "][" + (j + 1) + "]: ");

                    a[i][j] = teclado.nextInt();

                }

            }
        } catch (Exception e) {
            teclado.next();
            System.out.println("INGRESE NUMEROS ENTEROS");
        }
    }

    public static void imprimirmatriz(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print("|" + a[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void sumaMatrices(int a[][], int b[][]) {
        int resultado[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
                System.out.print("|" + resultado[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void restaMatrices(int a[][], int b[][]) {
        int resultado[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
                System.out.print("|" + resultado[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void productoMatrices(int a[][], int b[][]) {
        int resultado[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] * b[i][j];
                System.out.print("|" + resultado[i][j] + "| ");
            }
            System.out.println("");
        }
    }

    public static void Ecuaciones() {
        Scanner teclado = new Scanner(System.in);
        float x1, x2, y1, y2, r1, r2, x, y;
        System.out.println("Por Favor Ingrese Los Siguientes Valores");
        System.out.println("Ecuacion 1");
        System.out.print("X1: ");
        x1 = teclado.nextFloat();
        System.out.print("Y2: ");
        y1 = teclado.nextFloat();
        System.out.print("R1: ");
        r1 = teclado.nextFloat();

        System.out.println("Ecuacion 2");
        System.out.print("X2: ");
        x2 = teclado.nextFloat();
        System.out.print("Y2: ");
        y2 = teclado.nextFloat();
        System.out.print("R2: ");
        r2 = teclado.nextFloat();

        float M = (x1 * y2) - (y1 * x2);
        float Mx = (r1 * y2) - (r2 * y1);
        float My = (x1 * r2) - (x2 * r1);

        if (M != 0) {
            x = (Mx / M);
            y = (My / M);
            int yentero, xentero;
            xentero = (int) x;
            yentero = (int) y;
            System.out.println("Resultado");
            if (x - xentero == 0) {
                System.out.println("X: " + xentero);

            } else {
                DecimalFormat formato1 = new DecimalFormat("#.00");
                System.out.println("X:" + formato1.format(x));

            }
            if (y - yentero == 0) {
                System.out.println("Y: " + yentero);
            } else {
                DecimalFormat formato1 = new DecimalFormat("#.00");
                System.out.println("Y:" + formato1.format(y));
            }

        } else {
            System.out.println("Resultado");
            System.out.println("");
            System.out.println("ERROR!");
            System.out.println("No se Puede Resolver por metodo de cramer,el determinante es '0'");
        }

    }

}
