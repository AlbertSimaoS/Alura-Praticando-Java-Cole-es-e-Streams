import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        Double total = notas.stream()
                .reduce(0.0, (subtotal, elemento) -> subtotal + elemento);
        Double average = total / notas.size();
        Double maxNote = notas.stream()
                    .max(Double::compare)
                    .orElse(0.0);
        Double minNote = notas.stream()
                    .min(Double::compare)
                    .orElse(0.0);

        System.out.printf("A média das notas é: %.2f%n", average);
        System.out.printf("A menor nota foi: %.2f%n", minNote);
        System.out.printf("A maior nota foi: %.2f%n", maxNote);
    }
}
