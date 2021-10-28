import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    private static Map<String, Computer> macFlyweight = new HashMap<>();

    // Escopo local
    public Computer getComputer(int ram, int disco) {
        String id = ":id " + ram + " : " + disco;
        System.out.println(id);

        if(!macFlyweight.containsKey(id)) {
            macFlyweight.put(id, new Computer(ram, disco));
            System.out.println("PC Criado");
            return macFlyweight.get(id);
        } else {
            System.out.println("PC obtido");
            return macFlyweight.get(id);
        }
    }
}
