import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> afterFilter = funcionarios.stream()
                .filter(s -> s.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(afterFilter);
    }
}
