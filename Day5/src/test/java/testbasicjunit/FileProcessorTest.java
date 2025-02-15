package testbasicjunit;

import junit.basicjunittest.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    private static final String filePath = "C:\\Users\\Lenovol\\OneDrive\\Documents\\Desktop\\Week4\\Day5\\src\\main\\java\\junit\\basicjunittest\\fileProcessor.txt";
    private final FileProcessor fileProcessor = new FileProcessor();

    @BeforeEach
    void setup() {
        // Clean up any existing test file before each test
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";

        // Write to file
        fileProcessor.writeToFile(filePath, content);

        // Read from file and verify
        String result = fileProcessor.readFromFile(filePath);
        assertEquals(content, result, "File content should match the written content");
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(filePath, "Hello World");
        File file = new File(filePath);

        // Check if the file is created
        assertTrue(file.exists(), "File should exist after writing");
    }

    @Test
    void testReadNonExistentFileThrowsIOException() {
        // Expect IOException when reading a non-existing file
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonex.txt"));
    }

    @AfterEach
    void cleanup() {
        // Delete the test file after each test
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
}

