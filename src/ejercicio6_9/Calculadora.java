/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6_9;

/**
 *
 * @author rocio r
 */
import java.util.Scanner;

public class Calculadora {
    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }

    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }

    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }

    public double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return unNumero / otroNumero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        double resultado = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Limpiar");
            System.out.println("6. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = calculadora.sumar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.restar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    try {
                        resultado = calculadora.dividir(num1, num2);
                        System.out.println("Resultado: " + resultado);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    resultado = 0;
                    System.out.println("Resultado limpiado");
                    break;
                case 6:
                    salir = true;
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
