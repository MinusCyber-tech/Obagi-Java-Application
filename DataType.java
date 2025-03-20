public class DataType {
    public static void main(String[] args) {
        // Integer type (byte, short, int, long)
        byte age = 50;
        System.out.printf("You are %d years old%n", age);
        
        short quantity = 20000;
        System.out.printf("I bought %d quantity of bags for my business%n", quantity);
        
        int populationInNigeria = 1000000000;
        System.out.printf("The population in Nigeria is %d%n", populationInNigeria);
        
        long worldPopulation = 80000000000L;
        System.out.printf("The world population is %d%n", worldPopulation);
        
        // Float-point numbers (float, double)
        float weight = 5.6F;
        System.out.printf("The bag of rice was %.2f kg%n", weight); // Use %.2f for two decimal places
    }
}