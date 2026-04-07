import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        Double totalValue = precosProdutos.stream()
                .reduce(0.0, (subtotal, elemento) -> subtotal + elemento);

        System.out.printf("Valor total antes do imposto: %.2f%n", totalValue);
        System.out.printf("Valor total com imposto de 8%%: %.2f%n", totalValue * 1.08);
    }
}
