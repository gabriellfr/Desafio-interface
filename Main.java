package formas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AreaCalculavel> formas = new ArrayList<>();

        formas.add(new Retangulo(5.0, 3.0));
        formas.add(new Circulo(4.0));
        formas.add(new Triangulo(6.0, 2.5));

        for (AreaCalculavel forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
