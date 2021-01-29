package org.califica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalificacionTest {

    @Test
    public void testMismaAsig() {
        Calificacion calif1 = new Calificacion(8,"DIS");
        Calificacion calif2 = new Calificacion(5,"DIS");
        boolean coinciden = calif1.MismaAsig(calif2);
        //assertTrue(calif1.MismaAsig(calif2));
        assertEquals(false, calif1.MismaAsig(calif2));
    }

    @Test
    void getNota() {
    }

    @Test
    void getAsignatura() {
    }
}