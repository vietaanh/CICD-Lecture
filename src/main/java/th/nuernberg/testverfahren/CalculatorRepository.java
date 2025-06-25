package th.nuernberg.testverfahren;

import java.util.HashMap;
import java.util.Map;

public class CalculatorRepository {
    private final Map<String, String> calculations = new HashMap<>();

    public void addCalculation(String userId, String calculationString) {
        calculations.put(userId, calculationString);
    }

    public String getEmail(String userId) {
        return calculations.get(userId);
    }

    public boolean userExists(String userId) {
        return calculations.containsKey(userId);
    }
}
