package sesion24;

public class AritmeticaMejorada extends Aritmetica{
    @Override
    int suma(int A, int B) {
        System.out.println("Estoy en Suma()");
        return A + B;
    }

    @Override
    int resta(int A, int B) {
        System.out.println("Estoy en Resta()");
        return A - B;
    }

    @Override
    int multiplicacion(int A, int B) {
        System.out.println("Estoy en Multiplicacion()");
        return A * B;
    }

    @Override
    int division(int A, int B) {
        System.out.println("Estoy en Division()");
        return A / B;
    }
}
