package org.ed05_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorJuegosTest {

    @Test
    public void cp_01_tamanhoDistinto_debeDevolverMenosUno(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        assertEquals(-1, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123", "ABC124", "ABC125"}, new int[]{3, 1}));
    }

    @Test
    public void cp_02_tamanhoCero_debeDevolverMenosUno(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        assertEquals(-1, gestorJuegos.registrarLoteJuegos(new String[]{}, new int[]{3, 1}));
    }

    @Test
    public void cp_03_cantidadNegativa_debeDevolverMenosDos(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        assertEquals(-2, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123", "ABC124"}, new int[]{3, -1}));
    }

    @Test
    public void cp_04_cantidadMayorQueStock_debeDevolverMenosTres(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        assertEquals(-3, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123", "ABC124"}, new int[]{100, 101}));
    }

    @Test
    public void cp_05_registroSoloUnJuego_debeDevolverMenosTotal(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        assertEquals(1, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123"}, new int[]{1}));
    }

    @Test
    public void cp_06_juegoExsistente_debeDevolverTotal(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        gestorJuegos.registrarLoteJuegos(new String[]{"ABC123"}, new int[]{10});
        assertEquals(3, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123"}, new int[]{3}));}

    @Test
    public void cp_07_loteDeJuegos_debeDevolverTotal(){
        GestorJuegos gestorJuegos = new GestorJuegos();
        gestorJuegos.registrarLoteJuegos(new String[]{"ABC123"}, new int[]{5});
        assertEquals(6, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123", "ABC124"}, new int[]{3, 3}));
    }

    @Test
    public void cp08_dosJuegosDistintos_debeDevolverSumaTotal() {
        GestorJuegos gestorJuegos = new GestorJuegos();
        assertEquals(9, gestorJuegos.registrarLoteJuegos(new String[]{"ABC123", "XYZ456"}, new int[]{4, 5}));
    }
}
