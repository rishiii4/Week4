package reflection.intermediatelevel.accessmodifystaticfield;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {

        // Get the Class object for Configuration
        Class<?> configClass = Configuration.class;

        // Get the private static field API_KEY
        Field apiKeyField = configClass.getDeclaredField("API_KEY");

        // Print the initial value of API_KEY
        Configuration.printApiKey();

        // Make the field accessible
        apiKeyField.setAccessible(true);

        // Modify the value of the static field
        apiKeyField.set(null, "new_key");

        // Print the updated value of API_KEY
        Configuration.printApiKey();

    }
}
