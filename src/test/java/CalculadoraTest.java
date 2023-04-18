import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    // Nombres de métodos y variables poco descriptivos
    Calculadora c;

    // No hay comentarios para ayudar a entender el código
    @BeforeEach
    void s(){
        c = new Calculadora();
    }

    // Prueba de multiplicación con nombres de métodos poco descriptivos
    @Test
    void mul() {
        assertEquals(20, c.m(4, 5));
    }

    // Prueba de división por cero
    @Test
    void div() {
        // Se divide un número por cero
        assertEquals(8, c.d(14, 0));
    }

    // Método de división sin manejo de excepciones
    public double d(double num1, int num2) {
        return num1/num2;
    }
}