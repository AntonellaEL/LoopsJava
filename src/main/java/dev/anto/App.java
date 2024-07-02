package dev.anto;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        List<String> tabla = tablaMultiplicar.generarTabla(numero);

        for (String linea : tabla) {
            System.out.println(linea);
        }

        scanner.close();
    }
}
