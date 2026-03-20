import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> events = new ArrayList<>();

        events.add("IA Conference Brasil");
        events.add("AI Summit");
        events.add("DevFest");
        events.add("Cloud Expo");
        events.add("IA Conference Brasil");
        events.add("DevFest");

        Set<String> unique = new LinkedHashSet<>(events);

        events = new ArrayList<>(unique);

        System.out.println("Lista de eventos: " + events);
    }
}
/* outra maneira
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> events = new ArrayList<>();

        events.add("IA Conference Brasil");
        events.add("AI Summit");
        events.add("DevFest");
        events.add("Cloud Expo");
        events.add("IA Conference Brasil");
        events.add("DevFest");

        for (int i = 0; i < events.size(); i++) {
            for (int j = i + 1; j < events.size(); j++) {
                if (events.get(i).equals(events.get(j))) {
                    events.remove(j);
                    j--;
                }
            }
        }

        System.out.printf("Lista de eventos: " + events);
    }
}
*/
