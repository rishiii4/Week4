package testbasicjunit;

import junit.basicjunittest.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseConnectionTesting {
    @Test
    @BeforeEach
    void testDatabaseConnection(){
        DatabaseConnection db = new DatabaseConnection();
        assertEquals(db.connect(),"Connection is Established!");
        System.out.println("Connection is Established!");
    }
    @Test
    @AfterEach
    void testCloseConnection(){
        DatabaseConnection db = new DatabaseConnection();
        assertEquals(db.disconnect(),"Closed Correctly!");
        System.out.println("Closed Correctly!");
    }
}
