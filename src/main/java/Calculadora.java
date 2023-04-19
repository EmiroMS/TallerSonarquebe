public static double resultado;

public Calculadora() {
    resultado = 0;
}

public double suma(double num1, int num2) {
    resultado = num1 + num2;
    return resultado;
}

public double multiplicacion(double num1, int num2) {
    resultado = num1 * num2;
    return resultado;
}

public double division(double num1, int num2) {
    try {
        resultado = num1 / num2;
    } catch (Exception e) {
        System.out.println("Error al dividir por cero");
    }
    return resultado;
}

public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    calc.suma(2, 3);
    System.out.println("Resultado: " + resultado);
}

