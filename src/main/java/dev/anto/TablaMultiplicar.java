package dev.anto;

import java.util.ArrayList;
import java.util.List;

public class TablaMultiplicar {

    public List<String> generarTabla(int numero) {
        List<String> tabla = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tabla.add(numero + " x " + i + " = " + (numero * i));
        }
        return tabla;
    }
}