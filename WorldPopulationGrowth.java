
public class WorldPopulationGrowth {

 public static void main(String[] args) {
  // Provided data
  double currentPopulation = 8000000000.0; // Approximate current world population
  double growthRate = 0.0105; // Approximate annual growth rate (1.05%)

  System.out.println("Year\tPopulation\tIncrease");

  for (int year = 1; year <= 75; year++) {
   double increase = currentPopulation * growthRate;
   currentPopulation += increase;

   System.out.printf("%d\t%.0f\t%.0f\n", year, currentPopulation, increase);
  }

  // Calculate the year when population doubles
  double initialPopulation = 8000000000.0;
  int doubleYear = 0;
  double pop = initialPopulation;

  while (pop < 2 * initialPopulation) {
   double increase = pop * growthRate;
   pop += increase;
   doubleYear++;
  }

  System.out.println("The population will double in approximately " + doubleYear + " year");
 }
}