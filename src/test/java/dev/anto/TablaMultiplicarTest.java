package dev.anto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TablaMultiplicarTest {
    
     @Test
    public void testGenerarTabla() {
        TablaMultiplicar tablaMultiplicar = new TablaMultiplicar();
        List<String> tablaDelCinco = tablaMultiplicar.generarTabla(5);

        assertEquals(10, tablaDelCinco.size(), "La tabla de multiplicar debe tener 10 elementos");

        assertEquals("5 x 1 = 5", tablaDelCinco.get(0));
        assertEquals("5 x 2 = 10", tablaDelCinco.get(1));
        assertEquals("5 x 3 = 15", tablaDelCinco.get(2));
        assertEquals("5 x 4 = 20", tablaDelCinco.get(3));
        assertEquals("5 x 5 = 25", tablaDelCinco.get(4));
        assertEquals("5 x 6 = 30", tablaDelCinco.get(5));
        assertEquals("5 x 7 = 35", tablaDelCinco.get(6));
        assertEquals("5 x 8 = 40", tablaDelCinco.get(7));
        assertEquals("5 x 9 = 45", tablaDelCinco.get(8));
        assertEquals("5 x 10 = 50", tablaDelCinco.get(9));
    }

}
