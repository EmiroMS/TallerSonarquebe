import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

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
        assertEquals(20, c.multiplicacion(4,6));
    }

    // Prueba de división por cero
    @Test
    void div() {
        // Se divide un número por cero
        assertEquals(8, c.division(14, 0));
    }

}