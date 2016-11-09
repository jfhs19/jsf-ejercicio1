package entities;

import java.util.ArrayList;
import java.util.List;

public class HealthPlanUtils {
 
  private static HealthPlan[] availablePlans =
    { new HealthPlan("Sanitas", "902-666-999", 1234.56),
      new HealthPlan("Cigna", "902-999-666", 1555.55),
      new HealthPlan("Caser", "902-969-696", 1357.91)
    };
 
  public static List<String> getAvailablePlans() {
	List<String> planes = new ArrayList<String>();
	planes.add("Sanitas");
	planes.add("Cigna");
	planes.add("Caser");
    return planes;
  }
 
  public static HealthPlan findPlan(String planName) {
    for(HealthPlan plan: availablePlans) {
      if (plan.getNombre().equalsIgnoreCase(planName)) {
        return(plan);
      }
    }
    return(null);
  }
 
  HealthPlanUtils() {} // no podemos instanciar la clase
}