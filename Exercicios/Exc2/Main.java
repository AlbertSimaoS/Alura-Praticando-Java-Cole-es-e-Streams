import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> StudentsList = new ArrayList<>();

        StudentsList.add("Joana");
        StudentsList.add("Lucas");
        StudentsList.add("Pedro");
        StudentsList.add("Antônio");

        System.out.printf("Lista inicial: " + StudentsList);

        StudentsList.remove("Pedro");

        System.out.printf("\nLista após exclusão: " + StudentsList);

    }
}
