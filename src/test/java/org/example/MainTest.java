package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void productoAdyacentes() {
        int [] arreglo1 = {1,4,2,2,5,1};
        int [] arreglo2 = {-4,-5,-3,-10,-20};
        int [] arreglo3 = {100, 200, 1000, 1000, 150,600};
        int [] arreglo4 = {-1, 50, -35, 100, -4, 60, -70};
        assertEquals(10, Main.productoAdyacentes(arreglo1));
        assertEquals(200, Main.productoAdyacentes(arreglo2));
        assertEquals(1000000,Main.productoAdyacentes(arreglo3));
        assertEquals(-50,Main.productoAdyacentes(arreglo4));

    }
}