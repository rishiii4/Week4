package annotations.exercise;

public class LegacyAPI {
    // Method of old feature
    // Using @Deprecated
    @Deprecated
    public static void oldFeature(){
        System.out.println("These are Old Features!");
    }

    // Method of new feature
    public static void newFeature(){
        System.out.println("These are New Features!");
    }

    public static void main(String[] args) {
        // Calling both methods
        oldFeature();
        newFeature();
    }
}
