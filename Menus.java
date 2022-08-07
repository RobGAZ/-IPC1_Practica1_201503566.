package practica1_2s2022;

import java.util.Scanner;

public class Menus {

    public static void Menu() {
        int opcion;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        while (!salir) {
            System.out.println("========Menú========");
            System.out.println("1.Aritmeticas");
            System.out.println("2.Estadisticas");
            System.out.println("3.Matrices");
            System.out.println("4.Ecuaciones");
            System.out.println("5.Avanzadas");
            System.out.println("6.Salir");

            System.out.println("ELIJA LA OPERACION A EFECTUAR");

            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        Aritmeticas();
                        break;
                    case 2:
                        Estadisticas();
                        break;
                    case 3:
                        Matrices();
                        break;
                    case 4:
                        Ecuaciones();
                        break;
                    case 5:
                        Avanzadas();
                        break;
                    case 6:
                        salir = true;
                        System.out.println("\u000c");
                        System.out.println("FIN DEL PROGRAMA");

                        break;
                    default:
                        System.out.println("Elija Una Opcion del Menu");

                }
            } catch (Exception e) {

                System.out.println("ELIJA UNA OPCION VALIDA");
                teclado.next();
            }
        }

    }

    public static void Aritmeticas() {
        int opcion;
        boolean volver = false;
        Scanner teclado = new Scanner(System.in);

        while (!volver) {
            System.out.println("---------Aritmeticas--------");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Potencia");
            System.out.println("6.Atras");

            System.out.println("POR FAVOR, INGRESE LA OPERACION A REALIZAR");

            try {
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        int opcion1;
                        boolean volverAritmeticas = false;
                        while (!volverAritmeticas) {
                            System.out.println("Ingrese El Primer Numero");
                            float numero1 = teclado.nextFloat();
                            System.out.println("Ingrese el Segundo Numero");
                            float numero2 = teclado.nextFloat();
                            Operaciones.Suma(numero1, numero2);

                            System.out.println("¿Desea Realizar otra suma?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            opcion1 = teclado.nextInt();
                            if (opcion1 == 1) {
                                volverAritmeticas = false;
                            } else if (opcion1 == 2) {
                                volverAritmeticas = true;
                            }
                        }

                        break;
                    case 2:
                        int opcion2;
                        boolean volverAritmeticas1 = false;
                        while (!volverAritmeticas1) {
                            System.out.println("Ingrese El Primer Numero");
                            float numero1 = teclado.nextFloat();
                            System.out.println("Ingrese el Segundo Numero");
                            float numero2 = teclado.nextFloat();
                            Operaciones.Resta(numero1, numero2);

                            System.out.println("¿Desea Realizar otra Resta?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            opcion2 = teclado.nextInt();
                            if (opcion2 == 1) {
                                volverAritmeticas1 = false;
                            } else if (opcion2 == 2) {
                                volverAritmeticas1 = true;
                            }
                        }

                        break;
                    case 3:
                        int opcion3;
                        boolean volverAritmeticas2 = false;
                        while (!volverAritmeticas2) {
                            System.out.println("Ingrese El Primer Numero");
                            float numero1 = teclado.nextFloat();
                            System.out.println("Ingrese el Segundo Numero");
                            float numero2 = teclado.nextFloat();
                            Operaciones.Producto(numero1, numero2);

                            System.out.println("¿Desea Realizar otra Multiplicacion?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            opcion3 = teclado.nextInt();
                            if (opcion3 == 1) {
                                volverAritmeticas2 = false;
                            } else if (opcion3 == 2) {
                                volverAritmeticas2 = true;
                            }
                        }
                        break;
                    case 4:
                        int opcion4;
                        boolean volverAritmeticas3 = false;
                        while (!volverAritmeticas3) {
                            System.out.println("Ingrese El Dividendo");
                            float numero1 = teclado.nextFloat();
                            System.out.println("Ingrese El Divisor");
                            float numero2 = teclado.nextFloat();
                            Operaciones.Dividir(numero1, numero2);

                            System.out.println("¿Desea Realizar otra Division?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            opcion4 = teclado.nextInt();
                            if (opcion4 == 1) {
                                volverAritmeticas3 = false;
                            } else if (opcion4 == 2) {
                                volverAritmeticas3 = true;
                            }
                        }
                        break;
                    case 5:
                        int opcion5;
                        boolean volverAritmeticas4 = false;
                        while (!volverAritmeticas4) {
                            System.out.println("Ingrese La Base");
                            int numero1 = teclado.nextInt();
                            System.out.println("Ingrese El Exponente");
                            int numero2 = teclado.nextInt();
                            if (numero2 < 0 || (numero1 & numero2) == 0) {
                                System.out.println("Operacion no valida");

                            } else {
                                System.out.println("El resultado de" + numero1 + "^" + numero2 + " es: " + Operaciones.Potencia(numero1, numero2));

                                System.out.println("¿Desea Realizar otra Operacion?");
                                System.out.println("1.Si");
                                System.out.println("2.No");
                                opcion5 = teclado.nextInt();
                                if (opcion5 == 1) {
                                    volverAritmeticas4 = false;
                                } else if (opcion5 == 2) {
                                    volverAritmeticas4 = true;
                                }
                            }

                        }
                        break;
                    case 6:
                        volver = true;

                        break;
                    default:
                        System.out.println("ELIJA UNA OPCION DEL MENU");
                }
            } catch (Exception e) {
                System.out.println("ELIJA UNA OPCION VALIDA");
                teclado.next();
            }

        }

    }

    public static void Estadisticas() {
        int opcion;
        boolean volver = false;
        Scanner teclado = new Scanner(System.in);
        while (!volver) {
            System.out.println("----------Estadisticas------");
            System.out.println("1.Generar Resumen");
            System.out.println("2.Atras");
            System.out.println("ELIJA UNA OPERACION");
            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        int opcion1;
                        boolean volver1 = false;
                        while (!volver1) {
                            System.out.println("1.Tipo de ingreso de Datos");
                            System.out.println("2. Volver");

                            System.out.println("Elija una Opcion");

                            try {
                                opcion1 = teclado.nextInt();
                                switch (opcion1) {
                                    case 1:
                                        int opcion2;
                                        boolean volver2 = false;
                                        while (!volver2) {
                                            System.out.println("*********TIPO DE INGRESO DE DATOS*******");
                                            System.out.println("1.Manual");
                                            System.out.println("2.Serie de Numeros Aleatorios");
                                            System.out.println("3.Volver");

                                            System.out.println("ELija Una Opcion");

                                            try {
                                                opcion2 = teclado.nextInt();
                                                switch (opcion2) {
                                                    case 1:
                                                        Operaciones.Manual();
                                                        break;
                                                    case 2:
                                                        Operaciones.Random();
                                                        break;
                                                    case 3:
                                                        volver2 = true;
                                                        break;
                                                    default:
                                                        System.out.println("Elija una Opcion del Menu");
                                                }
                                            } catch (Exception e) {
                                                teclado.next();
                                                System.out.println("Elija una Opcion Valida");
                                            }
                                        }
                                        break;
                                    case 2:
                                        volver1 = true;
                                        break;
                                    default:
                                        System.out.println("Elija Una opcion del Menu");
                                }
                            } catch (Exception e) {
                                teclado.next();
                                System.out.println("Elija una Opcion valida");

                            }
                        }
                        break;
                    case 2:
                        volver = true;
                        break;
                    default:
                        System.out.println("ELIJA UNA OPCION DEL MENU");
                }
            } catch (Exception e) {
                teclado.next();
                System.out.println("ELIJA UNA OPCION DEL MENU");

            }
        }
    }

    public static void Matrices() {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        boolean volver = false;
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];

        while (!volver) {

            System.out.println("*******MATRICES******");
            System.out.println("1.Ingresar Matrices");
            System.out.println("2.Mostrar Matrices");
            System.out.println("3.Suma Matrices");
            System.out.println("4.Restar Matrices");
            System.out.println("5.Multiplicar Matrices");
            System.out.println("6.Atras");

            System.out.println("ELija Una Opcion");

            try {

                opcion = teclado.nextInt();
                switch (opcion) {

                    case 1:
                        System.out.println("*****INGRESAR MATRICES*******");
                        System.out.println("Matriz A");
                        Operaciones.ingresarA(A);
                        System.out.println("Matriz B");
                        Operaciones.ingresarB(B);
                        break;
                    case 2:

                        System.out.println("******Mostrar Matrices*******");
                        System.out.println("MATRIZ A");
                        Operaciones.imprimirmatriz(A);
                        System.out.println("MATRIZ B");
                        Operaciones.imprimirmatriz(B);

                        break;
                    case 3:
                        System.out.println("********Suma de Matrices***********");
                        System.out.println("MATRIZ A");
                        Operaciones.imprimirmatriz(A);
                        System.out.println("MATRIZ B");
                        Operaciones.imprimirmatriz(B);
                        System.out.println("Resultante");
                        Operaciones.sumaMatrices(A, B);

                        break;
                    case 4:
                        System.out.println("********Resta de Matrices**********");
                        System.out.println("MATRIZ A");
                        Operaciones.imprimirmatriz(A);
                        System.out.println("MATRIZ B");
                        Operaciones.imprimirmatriz(B);
                        System.out.println("Resultante");
                        Operaciones.restaMatrices(A, B);
                        break;
                    case 5:
                        System.out.println("********Suma de Matrices***********");
                        System.out.println("MATRIZ A");
                        Operaciones.imprimirmatriz(A);
                        System.out.println("MATRIZ B");
                        Operaciones.imprimirmatriz(B);
                        System.out.println("Resultante");
                        Operaciones.productoMatrices(A, B);
                        break;
                    case 6:
                        volver = true;
                        break;
                    default:
                        System.out.println("Elija una opcion del menu");
                }
            } catch (Exception e) {
                teclado.next();
                System.out.println("ELIJA UNA OPCION VALIDA");

            }
        }
    }

    public static void Ecuaciones() {
        int opcion;
        boolean volver = false;
        Scanner teclado = new Scanner(System.in);

        while (!volver) {
            System.out.println("*******ECUACIONES********");
            System.out.println("1.Ingrese Sistema de Ecuaciones");
            System.out.println("2.Atras");
            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("************ECUACIONES***********");
                        Operaciones.Ecuaciones();
                        break;
                    case 2:
                        volver = true;
                        break;
                    default:
                        System.out.println("Elija una Opcion del Menú");
                }
            } catch (Exception e) {
                System.out.println("Elija una opcion Valida");
                teclado.next();
            }
        }
    }

    public static void Avanzadas() {
        int opcion;
        boolean volver = false;
        Scanner teclado = new Scanner(System.in);

        while (!volver) {
            System.out.println("--------Avanzadas--------");
            System.out.println("1.Factorial");
            System.out.println("2.Valor Absoluto");
            System.out.println("3.Atras");

            System.out.println("POR FAVOR,ELIJA UNA OPCION");
            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        int opcion1;
                        boolean volverAvanzadas = false;
                        while (!volverAvanzadas) {
                            System.out.println("***********Factorial**********");
                            System.out.print("Por Favor ingrese un numero Entero:");
                            long numero = teclado.nextLong();
                            if (numero >= 0) {
                                if (Operaciones.Factorial(numero) > 0) {
                                    System.out.println("El Factorial de " + numero + " es de:" + Operaciones.Factorial(numero));
                                } else {
                                    System.out.println("El Factorial de " + numero + " es de:" + (-1) * Operaciones.Factorial(numero));
                                }
                            } else {
                                System.out.println("Ingres un valor Mayor a 0");
                            }

                            System.out.println("¿Desea Realizar otra Operacion?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            opcion1 = teclado.nextInt();
                            if (opcion1 == 1) {
                                volverAvanzadas = false;
                            } else if (opcion1 == 2) {
                                volverAvanzadas = true;
                            }
                        }
                        break;
                    case 2:
                        int opcion2;
                        boolean volverAvanzadas1 = false;
                        while (!volverAvanzadas1) {
                            System.out.println("******Valor Absoluto*****");
                            float numero;
                            System.out.print("Ingrese un Numero: ");
                            numero = teclado.nextFloat();
                            Operaciones.valorAbs(numero);
                            System.out.println("¿Desea Realizar otra Operacion?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            opcion2 = teclado.nextInt();
                            if (opcion2 == 1) {
                                volverAvanzadas1 = false;
                            } else if (opcion2 == 2) {
                                volverAvanzadas1 = true;
                            }
                        }
                        break;
                    case 3:
                        volver = true;
                        break;
                    default:
                        System.out.println("ELIJA UNA OPCION DEL MENU");
                }
            } catch (Exception e) {
                System.out.println("ELIJA UNA OPCION VALIDA");
                teclado.next();
            }
        }
    }
}
