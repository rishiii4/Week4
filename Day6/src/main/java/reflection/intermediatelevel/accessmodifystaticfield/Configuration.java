package reflection.intermediatelevel.accessmodifystaticfield;

public class Configuration {
    // Private static field
    private static String API_KEY = "initial_key";

    // Public method to print the API_KEY
    public static void printApiKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}
