package org.dis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/* Unit test for Calculadora. */
public class CalculadoraTest {
    Calculadora cal;
    double a;
    double b ;
    @BeforeEach
    public void init(){
        cal=new Calculadora();
        a = 4;
        b = -2;
    }
    @Test
    @DisplayName("Test método sumar (double, double")
    public void testSumar() {
        double suma=cal.sumar(a,b);
        //Assert
        assertEquals(2,suma);
    }
    @Test
    @DisplayName("Test método restar (double, double")
    public void testRestar() {
        assertEquals(6,cal.restar(a,b));
    }
}
