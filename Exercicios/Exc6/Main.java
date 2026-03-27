import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int choice = 1;
        while(choice != 0){
            System.out.printf("Digite o ID que deseja buscar:\n");
            int id = scanner.nextInt();

            if(clientes.get(id) != null){
                System.out.printf("O nome do cliente com ID %d é: %s%n", id, clientes.get(id));
            } else{
                System.out.printf("Cliente com ID %d não encontrado.\n", id);
            }

            System.out.printf("Deseja buscar outro ID (1: sim; 0: não):\n");
            choice = scanner.nextInt();
        }

    }
}
