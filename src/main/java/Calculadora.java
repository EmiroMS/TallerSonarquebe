public class Calculadora {

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
            if (num2 == 0) {
                throw new Exception("Error: no se puede dividir por cero"); // Se lanza una excepción personalizada
            }
            resultado = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Se muestra el mensaje de la excepción
        }
        return resultado;
    }
}
